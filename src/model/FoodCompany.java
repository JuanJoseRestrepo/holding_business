package model;

public class FoodCompany extends ManufacturingCompany{

public static final String ROOM_TEMPERATURE = "Temperatura ambiente" ;
public static final String REFRIGERATION = "Refrigeracion";
public static final String FREEZER = "Congelacion" ;

private String importer;
private String maker;
private String conservation;

public FoodCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build,String importer,String maker,String conservation){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
this.importer = importer;
this.maker = maker;
this.conservation = conservation;
}

public String getImporter(){
  return importer;
}

public void setImporter(String importer){
  this.importer = importer;
}

public String getMaker(){
  return maker;
}

public void setMaker(String maker){
  this.maker = maker;
}

public String getConservation(){
  return conservation;
}

public void setConservation(String conservation){
  this.conservation = conservation;
}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El importador es:" + importer;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El fabricador es:" + maker;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La conservacion es:" + conservation;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}




}
