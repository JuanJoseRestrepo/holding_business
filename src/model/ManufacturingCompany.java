package model;
import java.util.ArrayList;

public class ManufacturingCompany extends Company{

//Relaciones
private ArrayList<Product> products;


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
*/
public ManufacturingCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription ,char typeOrganization, String legalName,Building build){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
products = new ArrayList<Product>();
}

/** Description:Este metodo obtiene los productos
*@return ArrayList la informacion de la companhia
*/
public ArrayList<Product> getProducts(){
  return products;
}

/** Description: este metodo mdoifica los productos
*@param products ArrayList  los productos
*/
public void setProducts(ArrayList<Product> products){
  this.products = products;
}

/** Description: este metodo agrega los productos
*@param pro ArrayList los productos
*/
public void addProduct(ArrayList<Product> pro){

products = pro;

}

/** Description:Este metodo obtiene la informacion de los productos
*@return String la informacion de los products
*/
public String getInformation(){

String msj = "";

for(int i = 0; i < products.size();i++){
    msj += products.get(i).toString();
  }
return msj;
}


/** Description:Este metodo obtiene la informacion de la coimpanhia de la manofactura
*@return String la informacion de la companhia manofactura
*/
public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre del comercio es:" + getNameComercy() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nit es:" + getNit() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La direccion es:" + getAddres() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero  celular es:" + getPhoneContact() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de empleados es:" + getEmployeerCant() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de activos es:" + getAmountActives() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La fecha en la que se hizo" + getDateOfInscription() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El tipo de organizacion es:" + getTypeOrganization() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre legal es:" + getLegalName() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

for(int i = 0; i < products.size();i++){

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += products.get(i).toString() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

}

return msj;


}





}
