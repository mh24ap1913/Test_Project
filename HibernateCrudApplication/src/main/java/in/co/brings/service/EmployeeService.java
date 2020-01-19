package in.co.brings.service;

import java.util.List;
import java.util.Optional;

import in.co.brings.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee emp);
	Employee updateEmployee(Employee emp);
	List<Employee> getAllEmployee();
	Optional<Employee> getAllEmployeeById(Long employeeId);
	void deleteEmployee(Long employeeId);
	

}
