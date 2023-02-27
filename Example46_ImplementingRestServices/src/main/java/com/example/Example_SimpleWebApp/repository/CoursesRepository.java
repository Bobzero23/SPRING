package com.example.Example_SimpleWebApp.repository;

import com.example.Example_SimpleWebApp.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer> {
}
