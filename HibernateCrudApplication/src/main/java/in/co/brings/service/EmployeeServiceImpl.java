package in.co.brings.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.brings.dao.EmployeeDao;
import in.co.brings.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeDao dao;
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}

	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.saveAndFlush(emp);
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public Optional<Employee> getAllEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		return dao.findById(employeeId);
	}

	public void deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
				dao.deleteById(employeeId);
	}

}
