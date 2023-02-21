package com.example.Example_SimpleWebApp.repository;

import com.example.Example_SimpleWebApp.model.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidaysRepository extends CrudRepository<Holiday, String> {
}
