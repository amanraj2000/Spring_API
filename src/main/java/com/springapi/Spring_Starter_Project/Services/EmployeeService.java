package com.springapi.Spring_Starter_Project.Services;

import com.springapi.Spring_Starter_Project.Entities.EmployeeInfo;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeInfo> getEmployee();
    public EmployeeInfo getEmployeeDetails(int employeeId);
    public EmployeeInfo addEmployee(EmployeeInfo newDetails);

    EmployeeInfo updateInfo(EmployeeInfo ef);


    void deleteRecords(Integer employeeId);
}
