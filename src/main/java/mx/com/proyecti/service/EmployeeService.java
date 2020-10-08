package mx.com.proyecti.service;

import java.util.List;

import mx.com.proyecti.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee getEmployee(Integer id);

	Integer inserteEmployee(Employee employee);

	Boolean updateEmployee(Employee employee);

	Boolean deleteEmployee(Integer id);

}
