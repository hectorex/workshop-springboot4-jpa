package com.hectorjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hectorjava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
