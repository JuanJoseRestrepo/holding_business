package model;

public abstract class Company{

public final static char AGRICUL_HUNT_SILV_FISH = 'A';
public static final char EXPLOT_MINES_CAN = 'B';
public static final char INDUSTRY_MANU = 'C';
public static final char ELECTRICITY_GAS_STEAM = 'D';
public static final char CONSTRUCTION = 'E';
public static final char COMERCY_MM  = 'F';
public static final char TRANSPORTATION_A_C = 'G';
public static final char SECURE_INMU_COM = 'H';
public static final char SOCI_COM = 'I';

private  String nameComercy;
private String nit;
private String addres;
private String phoneContact;
private int employeerCant;
private double amountActives;
private String dateOfInscription;
private char typeOrganization;
private String legalName;
private Building build;

public Company(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build){
  this.nameComercy = nameComercy;
  this.nit = nit;
  this.addres = addres;
  this.phoneContact = phoneContact;
  this.employeerCant = employeerCant;
  this.amountActives = amountActives;
  this.dateOfInscription = dateOfInscription;
  this.typeOrganization = typeOrganization;
  this.legalName = legalName;
  this.build = build;
}

/** Description: Este metodo obtiene los edificios
*@return Building retorna el edificio
*/
public Building getBuilding1(){
  return build;
}

/** Description: Este metodo modifica los edificios
*@param build Building el edificio
*/
public void setBuilding1(Building build){
  this.build = build;
}

/** Description: Este metodo obtiene la fecha de la inscripcion
*@return String la fecha de la inscripcion
*/
public String getDateOfInscription(){
  return dateOfInscription;
}

/** Description: Este metodo modifica la fecha de la inscripcion
*@param dateOfInscription String la fecha de inscripcion
*/
public void setDateOfInscription(String dateOfInscription){
  this.dateOfInscription = dateOfInscription;
}

/** Description: Este metodo obtiene el nombre de la companhia
*@return String obtiene el nombre del comercio
*/
public String getNameComercy(){
  return nameComercy;
}

/** Description: este metodo modifica modifica el nombre del comercio
*@param nameComercy String el nombre del comercio
*/
public void setNameComercy(String nameComercy){
  this.nameComercy = nameComercy;
}

/** Description: Este metodo obtiene el nit
*@return String retorna el nit
*/
public String getNit(){
  return nit;
}

/** Description: Este metodo estable el nit
*@param nit String el nit de la empresa
*/
public void setNit(String nit){
  this.nit = nit;
}

/** Description: este metodo obtiene la direccion
*@return String la direccion
*/
public String getAddres(){
  return addres;
}

/**Description: Este metodo modifica la direccion
*@param addres String la direccion
*/
public void setAddres(String addres){
  this.addres = addres;
}

/** Description: Este metodo obtiene el numero telefonico
*@return String el telefono de contacto
*/
public String getPhoneContact(){
  return phoneContact;
}

/** Description: Este metodo modifica el telefono de contacto
*@param phoneContact String el telefono de contacto
*/
public void setPhoneContact(String phoneContact){
  this.phoneContact = phoneContact;
}

/** Description: Este metodo obtiene la cantidad de empleados
*@return int el numero de empleados
*/
public int getEmployeerCant(){
  return employeerCant;
}

/** Description: Este metodo establece la cantidad de empleados
*@param employeerCant int la cantidad de empleados
*/
public void setEmployeerCant(int employeerCant){
  this.employeerCant = employeerCant;
}

/** Description: Este metodo obtiene la cantidad de activos
*@return double la cantidad de activos
*/
public double getAmountActives(){
  return amountActives;
}

/**Description: Este metodo establece la cantidad de activos
*@param amountActives double la cantidad de activos
*/
public void setAmountActives(double amountActives){
  this.amountActives = amountActives;
}

/**Description: este metodo obtiene el tipo de organizacion
*@return char el tipo de organizacion
*/
public char getTypeOrganization(){
  return typeOrganization;
}

/**Description: este metodo establece el tipo de organizacion
*@param typeOrganization char el tipo de organizacion
*/
public void setTypeOrganization(char typeOrganization){
  this.typeOrganization = typeOrganization;
}

/** Description: este metodo obtiene el nombre legal
*@return String el nombre legal
*/
public String getLegalName(){
  return legalName;
}

/**Description: este metodo estable el tipo de nombe legal
*@param legalName String el nombre legal
*/
public void setLegalName(String legalName){
  this.legalName = legalName;
}

public abstract String toString();


}
