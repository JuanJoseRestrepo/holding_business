package model;
import java.util.ArrayList;

public class TechnologyCompany extends ServiceCompany implements Consuptiom{

//Constantes

public static final String CAPATATION_CONSULT = "Consultoria capacitacion";
public static final String SOFTWARE_DEVELOP = "Desarrollo de software a la medida";
public static final String INFRASTRUCTURE_SER = "Infraestructura como servicio";
public static final String SOFTWARE_SER = "Software como servicio";
public static final String PLATAFORM_SER = "Plataforma como servicio";

//Atributo

private String service;
private int consuptiomKilowatts;

//Relaciones

private ArrayList<String> services;


public TechnologyCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription ,char typeOrganization, String legalName,Building build,String service,int consuptiomKilowatts){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
	this.service = service;
	this.consuptiomKilowatts = consuptiomKilowatts;
	services = new ArrayList<String>();
	services.add(CAPATATION_CONSULT);
	services.add(SOFTWARE_DEVELOP);
	services.add(INFRASTRUCTURE_SER);
	services.add(SOFTWARE_SER);
	services.add(PLATAFORM_SER);

}

public String getService(){
  return service;
}

public void setService(String service){
  this.service = service;
}

public int getConsuptiomKilowatts(){
	return consuptiomKilowatts;
}

public void setConsuptiomKilowatts(int consuptiomKilowatts){
	this.consuptiomKilowatts = consuptiomKilowatts;
}

public int calculatedThingXArbol(){

int amountTreeEnergy = 0;

  if(getConsuptiomKilowatts() > 1 && getConsuptiomKilowatts() < 1000){

    amountTreeEnergy = 8;

  }else if(getConsuptiomKilowatts() > 1001 && getConsuptiomKilowatts() < 3000){

      amountTreeEnergy = 35;

    }else if(getConsuptiomKilowatts() > 3000){

          amountTreeEnergy = 500;

        }

return amountTreeEnergy;

}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El servicio es:" + service;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Los arboles son:" + calculatedThingXArbol();

return msj;


}





}
