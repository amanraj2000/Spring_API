package com.springapi.Spring_Starter_Project.Controller;

import com.springapi.Spring_Starter_Project.Dao.empRecords;
import com.springapi.Spring_Starter_Project.Entities.EmployeeInfo;
import com.springapi.Spring_Starter_Project.Services.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
        public class Employee {

            @Autowired
            public Employee_Service es;

            @GetMapping("/home")
            public String Home(){
                return "Welcome to the Directory!";
            }

          //     Returns the List of Employees
            @GetMapping("/api/v1/employee")
            public List<EmployeeInfo> getEmployee(){
                        return this.es.getEmployee();
            }

            // Returns a particular employee
            @GetMapping("/api/v1/employee/{employeeId}")
            public EmployeeInfo getEmployeeDetail(@PathVariable int employeeId){
                return this.es.getEmployeeDetails(employeeId);
            }

            @PostMapping("/api/v1/employee")
            public EmployeeInfo addNewEmployee(@RequestBody EmployeeInfo newDetails){
                return this.es.addEmployee(newDetails);
            }

            @PutMapping("/api/v1/employee")
            public EmployeeInfo updatedEmployee(@RequestBody EmployeeInfo ef){
                return this.es.updateInfo(ef);
            }

            @DeleteMapping("/api/v1/employee/{employeeId}")
            public ResponseEntity<HttpStatus> deleteRecord(@PathVariable Integer employeeId){
                this.es.deleteRecords(employeeId);
                return new ResponseEntity<>(HttpStatus.OK);
            }

}
