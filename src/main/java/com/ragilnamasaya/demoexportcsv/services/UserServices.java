package com.ragilnamasaya.demoexportcsv.services;

import com.ragilnamasaya.demoexportcsv.model.User;
import com.ragilnamasaya.demoexportcsv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServices {

    @Autowired
    private UserRepository repo;

    public List<User> listAll() {
        return repo.findAll(Sort.by("email").ascending());
    }

    public User saveUser(User user) {
        return repo.save(user);
    }
}