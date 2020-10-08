package mx.com.proyecti;

import java.rmi.RemoteException;

import org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.FaultBean;
import org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapAgeInfo;
import org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapContext;
import org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapContextPropertiesEntry;
import org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapNameField;
import org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizerProxy;
import org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapPersonGenderizerResult;
import org.nameapi.server.soap.v4_0.services.genderizer.persongenderizer.SoapSimpleNaturalPerson;

public class GenderApiImpl {

	public static void main(String[] args) {
		SoapPersonGenderizerProxy proxy = new SoapPersonGenderizerProxy();
		SoapContext context = new SoapContext();
		context.setApiKey("0fe65d284cb86a1caaa42c3ea20e3084-user1");
		SoapContextPropertiesEntry[] propertiesEntries = new SoapContextPropertiesEntry[1];
		context.setProperties(propertiesEntries);

		SoapSimpleNaturalPerson person = new SoapSimpleNaturalPerson();
		person.setAgeInfo(new SoapAgeInfo(20, 8, 1998, null));
		SoapNameField[] name = new SoapNameField[1];
		name[0] = new SoapNameField("FULLNAME", "Erick Jesús");
		person.setPersonName(name);
		try {

			SoapPersonGenderizerResult result = proxy.assess(context, person);
			System.out.println("Genero: " + result.getGender() + " Certeza: " + result.getConfidence());
		} catch (FaultBean e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
