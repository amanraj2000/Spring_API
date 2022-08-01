package com.springapi.Spring_Starter_Project.Services;

import com.springapi.Spring_Starter_Project.Dao.empRecords;
import com.springapi.Spring_Starter_Project.Entities.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employee_Service_impl implements Employee_Service {

    @Autowired
    public empRecords emprecords;

    @Override
    public List<EmployeeInfo> getEmployee() {
        return emprecords.findAll();
    }

    public EmployeeInfo getEmployeeDetails(int employeeId){
        return emprecords.getReferenceById(employeeId);
    }

    @Override
    public EmployeeInfo addEmployee(EmployeeInfo newDetails) {
        emprecords.save(newDetails);
        List<EmployeeInfo> ei = emprecords.findAll();
//        ei.forEach(System.out :: println);
        return newDetails;
    }

    public EmployeeInfo updateInfo(EmployeeInfo upadatedEntity){
        emprecords.save(upadatedEntity);
        return upadatedEntity;
    }


    public void deleteRecords(Integer employeeId)
    {
        EmployeeInfo temp = emprecords.getReferenceById(employeeId);
        emprecords.delete(temp);
    }
}
