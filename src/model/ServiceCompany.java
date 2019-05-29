package model;

public class ServiceCompany extends Company{


public ServiceCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName);
}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre del comercio es:" + getNameComercy();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nit es:" + getNit();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La direccion es:" + getAddres();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero  celular es:" + getPhoneContact();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de empleados es:" + getEmployeerCant();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de activos es:" + getAmountActives();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La fecha en la que se hizo" + getDateOfInscription();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El tipo de organizacion es:" + getTypeOrganization();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre legal es:" + getLegalName();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}






}
