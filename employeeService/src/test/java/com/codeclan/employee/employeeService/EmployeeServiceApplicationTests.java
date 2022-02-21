package com.codeclan.employee.employeeService;

import com.codeclan.employee.employeeService.models.Employee;
import com.codeclan.employee.employeeService.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee mrBean = new Employee("Mr Bean", 180, 765, "mrbean@gmail.com");
		employeeRepository.save(mrBean);
	}

}
