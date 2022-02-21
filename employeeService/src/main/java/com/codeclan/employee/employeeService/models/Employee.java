package com.codeclan.employee.employeeService.models;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="employee_number")
    private int employeeNumber;

    @Column(name="email_address")
    private String emailAddress;

    public Employee(String name, int age, int employeeNumber, String emailAddress){
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.emailAddress = emailAddress;

    }

    public Employee(){

    }

    public Long getId() { // NEW
        return id;
    }

    public void setId(Long id) { // NEW
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
