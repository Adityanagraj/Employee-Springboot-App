package com.employee.employeespringboot.repositories;

import com.employee.employeespringboot.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
