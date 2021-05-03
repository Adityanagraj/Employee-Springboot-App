package com.employee.employeespringboot.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prj_id;
    private String prj_code;
    private String prj_name;
    private String prj_desc;

    public Project(){

    }

    public Long getPrj_id() {
        return prj_id;
    }

    public void setPrj_id(Long prj_id) {
        this.prj_id = prj_id;
    }

    public String getPrj_code() {
        return prj_code;
    }

    public void setPrj_code(String prj_code) {
        this.prj_code = prj_code;
    }

    public String getPrj_name() {
        return prj_name;
    }

    public void setPrj_name(String prj_name) {
        this.prj_name = prj_name;
    }

    public String getPrj_desc() {
        return prj_desc;
    }

    public void setPrj_desc(String prj_desc) {
        this.prj_desc = prj_desc;
    }
}
