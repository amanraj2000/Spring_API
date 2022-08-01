package com.springapi.Spring_Starter_Project.Dao;

import com.springapi.Spring_Starter_Project.Entities.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface empRecords extends JpaRepository<EmployeeInfo , Integer> {

}
