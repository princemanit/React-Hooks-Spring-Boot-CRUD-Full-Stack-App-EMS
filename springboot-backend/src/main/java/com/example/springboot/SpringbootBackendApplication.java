package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Employee employee = new Employee();
//		employee.setFirstName("Prince");
//		employee.setLastName("Kumar");
//		employee.setEmailId("prince.kumar020896@gmail.com");
//		employeeRepository.save(employee);
//		
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Karan");
//		employee1.setLastName("Rustagi");
//		employee1.setEmailId("karan.rustagi@gmail.com");
//		employeeRepository.save(employee1);
	}

}
