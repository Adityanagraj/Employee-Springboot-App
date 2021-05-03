package com.employee.employeespringboot.repositories;

import com.employee.employeespringboot.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
