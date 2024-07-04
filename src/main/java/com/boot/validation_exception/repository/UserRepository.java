package com.boot.validation_exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.validation_exception.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserId(int id);

}
