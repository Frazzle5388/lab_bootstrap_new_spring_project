package com.codeclan.employee.employeeService.repositories;

import com.codeclan.employee.employeeService.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
