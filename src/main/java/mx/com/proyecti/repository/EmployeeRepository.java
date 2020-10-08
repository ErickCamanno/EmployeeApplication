package mx.com.proyecti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.proyecti.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
