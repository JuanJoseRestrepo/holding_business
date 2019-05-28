package model;

public class FoodCompany extends ManufacturingCompany{

public static final String ROOM_TEMPERATURE = "Temperatura ambiente" ;
public static final String REFRIGERATION = "Refrigeracion";
public static final String FREEZER = "Congelacion" ;

private String importer;
private String maker;
private String conservation;

public FoodCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName,String importer,String maker,String conservation){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,typeOrganization,legalName);
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


}
