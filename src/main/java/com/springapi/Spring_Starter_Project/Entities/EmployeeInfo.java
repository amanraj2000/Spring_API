package com.springapi.Spring_Starter_Project.Entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
//
//import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "employeeRecords")
public class EmployeeInfo {
    @Id
    private int employeeId;
    @Column(name = "firstName")
    private String fname;
    @Column(name = "lastName")
    private String lname;
    @Column(name = "email")
    private String email;
    @Column(name = "team")
    private String team;
    @Column(name = "role")
    private String role;
    @Column(name = "band")
    private String band;

    public EmployeeInfo(int employeeId,String fname, String lname, String email, String team, String role, String band) {
        super();
        this.employeeId = employeeId;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.team = team;
        this.role = role;
        this.band = band;
    }
    public EmployeeInfo(){
        super();
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "employeeId=" + employeeId +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", team='" + team + '\'' +
                ", role='" + role + '\'' +
                ", band='" + band + '\'' +
                '}';
    }
}
