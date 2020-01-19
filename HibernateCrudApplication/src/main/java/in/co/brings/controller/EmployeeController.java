package in.co.brings.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.brings.entity.Employee;
import in.co.brings.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	public EmployeeController() {
		// TODO Auto-generated constructor stub
		System.out.println("EmployeeController");
	}
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee emp) {
		return service.saveEmployee(emp);
	}
	@PutMapping("/update")
	public Employee update(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	@GetMapping("/get")
	public List<Employee> getAllEmployee(){
		return service.getAllEmployee();
	}
	@GetMapping("/getValue")
	public Optional<Employee> eployeeId(@PathVariable("employeeId") Long employeeId) {
		return service.getAllEmployeeById(employeeId);
	}
	@DeleteMapping("/delete")
	public void delete(@PathVariable("employeeId") Long employeeId) {
		service.deleteEmployee(employeeId);
	}
}
