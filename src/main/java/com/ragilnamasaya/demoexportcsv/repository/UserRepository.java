package com.ragilnamasaya.demoexportcsv.repository;

import com.ragilnamasaya.demoexportcsv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
