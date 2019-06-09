package model;

public class PublicCompany extends ServiceCompany implements Taxes{

public static final String SAWAGE_SYSTEM = "Alcantarillado" ;
public static final String ENERGY = "Energia" ;
public static final String AQUEDUCT ="Acueducto" ;

private String servicePublic;
private int suscriptorsTotally;
private int suscriptorsOneAndTwo;

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
*@param servicePublic String el servicio publico
*@param suscriptorsTotally int el total de suscriptores
*@param suscriptorsOneAndTwo int los suscriptores uno y dos
*/
public PublicCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build,String servicePublic,int suscriptorsTotally, int suscriptorsOneAndTwo){

super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
this.servicePublic = servicePublic;
this.suscriptorsTotally = suscriptorsTotally;
this.suscriptorsOneAndTwo = suscriptorsOneAndTwo;

}

/**Description: este metodo obtiene el servicio publico
*@return String el servicio publico
*/
public String getServicePublic(){
  return servicePublic;
}

/**Description: este metodo modifica el servicio publico
@param servicePublic String el servicio publico
*/
public void setServicePublic(String servicePublic){
  this.servicePublic = servicePublic;
}

/**Description: este metodo obtiene los suscriptors Total
*@return int los suscriptores en total
*/
public int getSuscriptorsTotally(){
  return suscriptorsTotally;
}

/**Description: este metodo modifica los suscriptores en total
@param suscriptorsTotally los suscriptores en total
*/
public void setSuscriptorsTotally(int suscriptorsTotally){
  this.suscriptorsTotally = suscriptorsTotally;
}

/**Description: este metodo obtiene los suscruptores uno y dos
*@return int os suscruptores uno y dos
*/
public int getSuscriptorsOneAndTwo(){
  return suscriptorsOneAndTwo;
}

/**Description: este metodo modifica los suscruptores uno y dos
@param suscriptorsOneAndTwo int  los suscruptores uno y dos
*/
public void setSuscriptorsOneAndTwo(int suscriptorsOneAndTwo){
  this.suscriptorsOneAndTwo = suscriptorsOneAndTwo;
}

/** Description:Este metodo obtiene la informacion de la coimpanhia publica
*@return String la informacion de la companhia
*/
public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El servicio publico es:" + servicePublic + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El total de suscriptores es:" + suscriptorsTotally + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de suscriptores uno y dos es:" +suscriptorsOneAndTwo + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El impuesto proCultura es:" + calculatedProCultura() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}

/**Description: Este metodo calcula el impuesto pro cultura
*@return double el calculo del impuesto pro cultura 
*/
public double calculatedProCultura(){

double porProCultura = 0.0;

porProCultura += 40 - (suscriptorsTotally/100);

if(porProCultura < 0){

porProCultura = 0.0;

}

return porProCultura;


}



}
