package com.employee.employeespringboot.repositories;

import com.employee.employeespringboot.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
