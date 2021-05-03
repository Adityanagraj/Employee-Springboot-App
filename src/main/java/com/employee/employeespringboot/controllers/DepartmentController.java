package com.employee.employeespringboot.controllers;


import com.employee.employeespringboot.models.Department;
import com.employee.employeespringboot.repositories.DepartmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> list() {
        return departmentRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Department get(@PathVariable Long id){
        return departmentRepository.getOne(id);
    }

    @PostMapping
    public Department create(@RequestBody final Department department){
        return departmentRepository.saveAndFlush(department);
    }

    @RequestMapping(value = "{id}" ,method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        departmentRepository.deleteById(id);
    }

    @RequestMapping(value ="{id}",method = RequestMethod.PUT)
    public Department update(@PathVariable Long id, @RequestBody Department department ){
        Department existingDepartment=departmentRepository.getOne(id);
        BeanUtils.copyProperties(department,existingDepartment,"dept_id");
        return departmentRepository.saveAndFlush(existingDepartment);
    }

}
