package com.employee.employeespringboot.controllers;

import com.employee.employeespringboot.models.Project;
import com.employee.employeespringboot.repositories.ProjectRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/project")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> list() {
        return projectRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Project get(@PathVariable Long id){
        return projectRepository.getOne(id);
    }

    @PostMapping
    public Project create(@RequestBody final Project project){
        return projectRepository.saveAndFlush(project);
    }

    @RequestMapping(value = "{id}" ,method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        projectRepository.deleteById(id);
    }

    @RequestMapping(value ="{id}",method = RequestMethod.PUT)
    public Project update(@PathVariable Long id, @RequestBody Project project ){
        Project existingProject=projectRepository.getOne(id);
        BeanUtils.copyProperties(project,existingProject,"prj_id");
        return projectRepository.saveAndFlush(existingProject);
    }
}
