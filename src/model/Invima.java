package model;

public class Invima extends ManufacturingCompany implements Consuptiom{

public static final char FABRICATION_EXPO = 'X';
public static final char FABRICATION_SELL = 'Y';
public static final char IMPORT_SELL = 'Z';
public static final String VALID = "Vigente";
public static final String NORENEWED = "No renovado";

private String sanitaryRegistration;
private String state;
private String expiration;
private char modality;

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
*@param sanitaryRegistration String el servicio sanitario
*@param state String el estado del medicamento
*@param expiration String la expiracion del producto
*@param modality char la modalidad del medicamento
*/
public Invima(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build,String sanitaryRegistration, String state, String expiration, char modality){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
  this.sanitaryRegistration = sanitaryRegistration;
  this.state = state;
  this.expiration = expiration;
  this.modality = modality;
}

/** Description:Este metodo obtiene el registro sanitario
*@return String el registro sanitario
*/
public String getSanitaryRegistration(){
  return sanitaryRegistration;
}

/**Description: este metodo modifica el registro sanitario
@param sanitaryRegistration String el registro sanitario
*/
public void setSanitaryRegistration(String sanitaryRegistration){
  this.sanitaryRegistration = sanitaryRegistration;
}

/** Description:Este metodo obtiene el estado
*@return String el estado
*/
public String getState(){
  return state;
}

/**Description: este metodo modifica el estado
@param state String el estado
*/
public void setState(String state){
  this.state = state;
}

/** Description:Este metodo obtiene la expiracion
*@return String la expiracion
*/
public String getExpiration(){
  return expiration;
}

/**Description: este metodo modifica la expiracion
@param expiration String la expiracion
*/
public void setExpiration(String expiration){
  this.expiration = expiration;
}

/** Description:Este metodo obtiene la modalidad
*@return char la modalidad
*/
public char getModality(){
return modality;
}

/**Description: este metodo modifica la modalidad
@param modality char la modalidad
*/
public void setModality(char modality){
  this.modality = modality;
}

/** Description:Este metodo obtiene la informacion de la coimpanhia de comida
*@return String la informacion de la companhia de comida
*/
public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El registro sanitario es:" + sanitaryRegistration + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El estado es:" + state + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La expiracion es:" + expiration + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La modalidad es:" + modality + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Los arboles a sembrar son:" + calculatedThingXArbol() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}

/** Description: Este metodo metodo obtiene la cantidad da arboles a planta
*@return int la cantidad de arboles
*/
public int calculatedThingXArbol(){

int amountTree = 0;

for(int i = 0; i < getProducts().size(); i++){
  Product m = getProducts().get(i);
  if(m.getWaterAmount() > 1 && m.getWaterAmount()  < 140){

    amountTree = 6;

  }else if(m.getWaterAmount()  >41&& m.getWaterAmount()  < 800){

      amountTree = 25;

    }else if(m.getWaterAmount() >800){

          amountTree = 200;

        }
      }

return amountTree;

}


}
