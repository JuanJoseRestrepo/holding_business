package model;

public class FoodCompany extends ManufacturingCompany{

public static final String ROOM_TEMPERATURE = "Temperatura ambiente" ;
public static final String REFRIGERATION = "Refrigeracion";
public static final String FREEZER = "Congelacion" ;

private String importer;
private String maker;
private String conservation;

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
*@param importer String el importador
*@param maker String el fabricador
*@param conservation String la conservacion
*/
public FoodCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build,String importer,String maker,String conservation){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
this.importer = importer;
this.maker = maker;
this.conservation = conservation;
}

/** Description:Este metodo obtiene el importador
*@return String el fabricador
*/
public String getImporter(){
  return importer;
}

/**Description: este metodo modifica el fabricador
@param importer String el importador
*/
public void setImporter(String importer){
  this.importer = importer;
}

/** Description:Este metodo obtiene  el fabricador
*@return String  el fabricador
*/
public String getMaker(){
  return maker;
}

/**Description: este metodo modifica  el fabricador
@param maker String  el fabricador
*/
public void setMaker(String maker){
  this.maker = maker;
}

/** Description:Este metodo obtiene la conservacion
*@return String la conservacion
*/
public String getConservation(){
  return conservation;
}

/**Description: este metodo modifica la conservacion
@param conservation String la conservacion
*/
public void setConservation(String conservation){
  this.conservation = conservation;
}

/** Description:Este metodo obtiene la informacion de la coimpanhia de comida
*@return String la informacion de la companhia de comida
*/
public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El importador es:" + importer + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El fabricador es:" + maker + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La conservacion es:" + conservation + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}




}
