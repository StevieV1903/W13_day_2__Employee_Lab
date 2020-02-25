package com.codeclan.example.Employee_Lab;

import com.codeclan.example.Employee_Lab.models.Department;
import com.codeclan.example.Employee_Lab.models.Employee;
import com.codeclan.example.Employee_Lab.models.Project;
import com.codeclan.example.Employee_Lab.repositories.DepartmentRepository;
import com.codeclan.example.Employee_Lab.repositories.EmployeeRepository;
import com.codeclan.example.Employee_Lab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeLabApplicationTests {

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
	public void create_employee_and_department(){
		Department department1 = new Department("HR");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("John", "Smith", 123, department1);
		employeeRepository.save(employee1);

		Project project1 = new Project("Hiring", 10);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}





}
