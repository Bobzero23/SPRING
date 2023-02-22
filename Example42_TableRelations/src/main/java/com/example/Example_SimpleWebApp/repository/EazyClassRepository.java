package com.example.Example_SimpleWebApp.repository;

import com.example.Example_SimpleWebApp.model.EazyClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EazyClassRepository extends JpaRepository<EazyClass, Integer> {

}
