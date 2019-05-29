package model;

public class ServiceCompany extends Company{


public ServiceCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,typeOrganization,legalName);
}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre del comercio es:" + nameComercy;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nit es:" + nit;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La direccion es:" + addres;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero  celular es:" + phoneContact;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de empleados es:" + employeerCant;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de activos es:" + amountActives;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El tipo de organizacion es:" + typeOrganization;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre legal es:" + legalName;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}






}
