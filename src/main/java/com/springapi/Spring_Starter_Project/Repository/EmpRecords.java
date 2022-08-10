package com.springapi.Spring_Starter_Project.Repository;

import com.springapi.Spring_Starter_Project.Entities.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRecords extends JpaRepository<EmployeeInfo , Integer> {

}
