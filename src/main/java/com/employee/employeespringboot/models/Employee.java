package com.employee.employeespringboot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;
    private String emp_code;
    private String emp_name;
    private String emp_email;
    private String emp_pass;
    private Integer emp_dept;
    private Integer emp_prj;
    private String emp_join;
    public Employee(){}

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_pass() {
        return emp_pass;
    }

    public void setEmp_pass(String emp_pass) {
        this.emp_pass = emp_pass;
    }

    public Integer getEmp_dept() {
        return emp_dept;
    }

    public void setEmp_dept(Integer emp_dept) {
        this.emp_dept = emp_dept;
    }

    public Integer getEmp_prj() {
        return emp_prj;
    }

    public void setEmp_prj(Integer emp_prj) {
        this.emp_prj = emp_prj;
    }

    public String getEmp_join() {
        return emp_join;
    }

    public void setEmp_join(String emp_join) {
        this.emp_join = emp_join;
    }
}
