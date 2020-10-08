package mx.com.proyecti;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mx.com.proyecti.entity.Employee;

public class EmployeeManager {

	public SessionFactory sessionFactory;

	public void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	public void exit() {
		sessionFactory.close();
	}

	public Integer create(String firstName, String lastName, Date birthdate, double salary) {
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setBirthDate(birthdate);
		employee.setSalary(salary);

		Session session = sessionFactory.openSession();
		// Iniciar una transacción
		session.beginTransaction();

		Integer id = (Integer) session.save(employee); // INSERT
		session.getTransaction().commit();

		session.close();

		return id;

	}

	public Employee read(Integer id) {
		Session session = sessionFactory.openSession();
		Employee employee = session.get(Employee.class, id); // SQL: SELECT

		session.close();
		return employee;
	}

	public void update(Integer id, String firstName, String lastName, Date birthdate, double salary) {
		Employee employee = new Employee();
		employee.setId(id);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setBirthDate(birthdate);
		employee.setSalary(salary);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.update(employee); // SQL: UPDATE

		session.getTransaction().commit(); // Confirmar el update
		session.close();
	}

	public void delete(Integer id) {
		Employee employee = new Employee();
		employee.setId(id);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.delete(employee); // SQL: DELETE

		session.getTransaction().commit();
		session.close();
	}

	public List<Employee> readAll() {
		Session session = sessionFactory.openSession();
		return session.createCriteria(Employee.class).list();
	}

	public List<Employee> readAll2() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Employee").list();
	}

}
