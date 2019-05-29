package model;

public class PublicCompany extends ServiceCompany{

public static final String SAWAGE_SYSTEM = "Alcantarillado" ;
public static final String ENERGY = "Energia" ;
public static final String AQUEDUCT ="Acueducto" ;

private String servicePublic;
private int suscriptorsTotally;
private int suscriptorsOneAndTwo;

public PublicCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName,String servicePublic,int suscriptorsTotally, int suscriptorsOneAndTwo){

super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,typeOrganization,legalName);
this.servicePublic = servicePublic;
this.suscriptorsTotally = suscriptorsTotally;
this.suscriptorsOneAndTwo = suscriptorsOneAndTwo;

}

public String getServicePublic(){
  return servicePublic;
}

public void setServicePublic(String servicePublic){
  this.servicePublic = servicePublic;
}

public int getSuscriptorsTotally(){
  return suscriptorsTotally;
}

public void setSuscriptorsTotally(int suscriptorsTotally){
  this.suscriptorsTotally = suscriptorsTotally;
}

public int getSuscriptorsOneAndTwo(){
  return suscriptorsOneAndTwo;
}

public void setSuscriptorsOneAndTwo(int suscriptorsOneAndTwo){
  this.suscriptorsOneAndTwo = suscriptorsOneAndTwo;
}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El servicio publico es:" + servicePublic;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El total de suscriptores es:" + suscriptorsTotally;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de suscriptores uno y dos es:" +suscriptorsOneAndTwo;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}



}
