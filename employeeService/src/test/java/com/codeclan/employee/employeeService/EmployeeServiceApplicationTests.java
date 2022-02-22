package com.codeclan.employee.employeeService;

import com.codeclan.employee.employeeService.models.Department;
import com.codeclan.employee.employeeService.models.Employee;
import com.codeclan.employee.employeeService.models.Project;
import com.codeclan.employee.employeeService.repositories.DepartmentRepository;
import com.codeclan.employee.employeeService.repositories.EmployeeRepository;
import com.codeclan.employee.employeeService.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createDepartment(){
		Department sales = new Department("Sales");
		Employee mrBean = new Employee("Mr Bean", 180, 765, "mrbean@gmail.com", sales);
		sales.addEmployee(mrBean);
		departmentRepository.save(sales);
		employeeRepository.save(mrBean);
	}

	@Test
	public void createProject(){
		Project budget = new Project("Budget", 5);
		Department sales = new Department("Sales");
		Employee mrBean = new Employee("Mr Bean", 180, 765, "mrbean@gmail.com", sales);
		sales.addEmployee(mrBean);
		departmentRepository.save(sales);
		mrBean.addProject(budget);
		projectRepository.save(budget);
		employeeRepository.save(mrBean);
	}



}
