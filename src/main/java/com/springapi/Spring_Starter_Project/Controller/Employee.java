package com.springapi.Spring_Starter_Project.Controller;

import com.springapi.Spring_Starter_Project.Entities.EmployeeInfo;
import com.springapi.Spring_Starter_Project.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class Employee {
    @Autowired
    private EmployeeService employeesList;

    @GetMapping("")
    public String Home(){
        return "Employee Directory";
    }
    // Returns the List of Employees
    @GetMapping("/listOfAllEmployees")
    public List<EmployeeInfo> getEmployee(){
        return this.employeesList.getEmployee();
    }

    // Returns a particular employee
    @GetMapping("/getOneEmployeeRecords/{employeeId}")
    public EmployeeInfo getEmployeeDetail(@PathVariable int employeeId){
        return this.employeesList.getEmployeeDetails(employeeId);
    }

    @PostMapping("/addNewEmployee")
    public EmployeeInfo addNewEmployee(@RequestBody EmployeeInfo newDetails){
        return this.employeesList.addEmployee(newDetails);
    }

    @PutMapping("/updateEmployeeRecord")
    public EmployeeInfo updatedEmployee(@RequestBody EmployeeInfo ef){
        return this.employeesList.updateInfo(ef);
    }

    @DeleteMapping("/deleteEmployeeRecord/{employeeId}")
    public ResponseEntity<HttpStatus> deleteRecord(@PathVariable Integer employeeId){
        this.employeesList.deleteRecords(employeeId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    
}
