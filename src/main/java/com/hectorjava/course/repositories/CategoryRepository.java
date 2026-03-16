package com.hectorjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hectorjava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
