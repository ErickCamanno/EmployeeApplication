package mx.com.proyecti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.proyecti.entity.Employee;
import mx.com.proyecti.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}

	@Override
	public Employee getEmployee(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public Integer inserteEmployee(Employee employee) {
		return repository.save(employee).getId();
	}

	@Override
	public Boolean updateEmployee(Employee employee) {
		Employee employee2 = repository.findOne(employee.getId());
		if (employee2 != null) {
			employee2.setFirstName(employee.getFirstName());
			employee2.setLastName(employee.getLastName());
			employee2.setBirthDate(employee.getBirthDate());
			employee2.setSalary(employee.getSalary());
			repository.save(employee2);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Boolean deleteEmployee(Integer id) {
		repository.delete(id);
		return true;
	}

}
