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


/**Description: Este constructor inicializa las variables
*@param nameComercy String el nombre de la empresa
*@param nit String el nit de la empresa
*@param addres String la direccion de la empresa
*@param phoneContact String la direccion de la empresa
*@param employeerCant int la cantidad de empleados
*@param amountActives double la cantidad de activos
*@param dateOfInscription String el dia de la inscripcion
*@param typeOrganization char el tipo de organizacion
*@param legalName String el nombre legal
*@param build Building el edificio
*@param service String el servicio
*@param consuptiomKilowatts int el consumo de kilowatts
*/
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

/** Description: Este metodo obtiene el servicio
*@return String el servicio
*/
public String getService(){
  return service;
}

/**Description: este metodo modifica el servicio
@param service String el servicio
*/
public void setService(String service){
  this.service = service;
}

/** Description: Este metodo obtiene el consumo de killowatts
*@return int killowatts
*/
public int getConsuptiomKilowatts(){
	return consuptiomKilowatts;
}

/**Description: este metodo modifica el consumo de killowatts
@param consuptiomKilowatts int el consumo de killowatts
*/
public void setConsuptiomKilowatts(int consuptiomKilowatts){
	this.consuptiomKilowatts = consuptiomKilowatts;
}

/** Description: Este metodo metodo obtiene la cantidad da arboles a planta
*@return int la cantidad de arboles
*/
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

/** Description:Este metodo obtiene la informacion de la coimpanhia de tecnologia
*@return String la informacion de la companhia
*/
public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El servicio es:" + service + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Los arboles son:" + calculatedThingXArbol() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}





}
