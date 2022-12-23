package net.curdprojects.springbootCurd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.curdprojects.springbootCurd.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootCurdApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCurdApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setName("Bhargav");
//		employee.setAddress("Vadodara");
//		employee.setPincode("876333");
//		employee.setState("Gujarat");
//		employee.setRow_creation_timeStamp("22/12/22 12:33:22 ");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setName("John");
//		employee1.setAddress("USA");
//		employee1.setPincode("229933");
//		employee1.setState("washington DC");
//		employee1.setRow_creation_timeStamp("21/12/22 04:33:22 ");
//		employeeRepository.save(employee1);
		
	}
}