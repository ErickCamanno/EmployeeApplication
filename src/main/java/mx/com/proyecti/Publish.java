package mx.com.proyecti;

import javax.xml.ws.Endpoint;

public class Publish {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/employee/webService", new EmployeeSoap());
		System.out.println("Servicio iniciado en el puerto 8081");
	}

}
