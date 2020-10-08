package mx.com.proyecti;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import mx.com.proyecti.entity.Employee;

@WebService
public class EmployeeSoap {
	public final String hello = "Hey";
	EmployeeManager manager = new EmployeeManager();

	public EmployeeSoap() {

	}

	@WebMethod
	public String getHello(@WebParam(name = "nombre") String name) {
		return hello + " " + name;
	}

	@WebMethod
	public Integer create(@WebParam(name = "firstname") String firstName, @WebParam(name = "lastname") String lastName,
			@WebParam(name = "birthdate") Date birthdate, @WebParam(name = "salary") double salary) {
		manager.setup();
		Integer id = manager.create(firstName, lastName, birthdate, salary);
		manager.exit();
		return id;
	}

	@WebMethod
	public Employee read(@WebParam(name = "id") Integer id) {
		manager.setup();
		Employee employee = manager.read(id);
		manager.exit();
		return employee;
	}

	@WebMethod
	public void update(@WebParam(name = "id") int id, @WebParam(name = "firstname") String firstName,
			@WebParam(name = "lastname") String lastName, @WebParam(name = "birthdate") Date birthdate,
			@WebParam(name = "salary") double salary) {
		manager.setup();
		manager.update(id, firstName, lastName, birthdate, salary);
		manager.exit();
	}

	@WebMethod
	public void delete(@WebParam(name = "id") Integer id) {
		manager.setup();
		manager.delete(id);
		manager.exit();
	}

	@WebMethod
	public List<Employee> readAll() {
		manager.setup();
		List<Employee> empleados = manager.readAll();
		manager.exit();
		return empleados;
	}

	@WebMethod
	public List<Employee> readAll2() {
		manager.setup();
		List<Employee> empleados = manager.readAll2();
		manager.exit();
		return empleados;
	}

}
