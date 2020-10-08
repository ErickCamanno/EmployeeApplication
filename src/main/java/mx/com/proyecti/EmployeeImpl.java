package mx.com.proyecti;

import java.util.List;

import mx.com.proyecti.entity.Employee;

public class EmployeeImpl {

	public static void main(String[] args) {
		EmployeeManager employeeManager = new EmployeeManager();

		employeeManager.setup();
//
//		Employee employee = employeeManager.read(1);
//		System.out.println(employee.toString());
		List<Employee> empleados = employeeManager.readAll();
		for (int i = 0; i < empleados.size(); i++) {
			System.out.println(empleados.get(i).toString());
		}
		employeeManager.exit();
	}

}
