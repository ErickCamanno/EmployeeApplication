package mx.com.proyecti.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.jws.WebParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.proyecti.entity.Employee;
import mx.com.proyecti.service.EmployeeService;

@RestController
@CrossOrigin(origins="*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("api")
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return service.getAllEmployee();
	}

	@PostMapping("/insertEmployee")
	public Integer insertEmployee(@RequestBody Employee employee) {
		return service.inserteEmployee(employee);
	}

	@PutMapping("/updateEmployee")
	public Boolean updateEMployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return service.getEmployee(id);
	}

	@DeleteMapping("employee/{id}")
	public Boolean deleteEmployee(@PathVariable Integer id) {
		return 	service.deleteEmployee(id);
	}

}
