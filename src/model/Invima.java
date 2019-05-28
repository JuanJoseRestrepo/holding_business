package model;

public class Invima extends ManufacturingCompany{

public static final char FABRICATION_EXPO = 'X';
public static final char FABRICATION_SELL = 'Y';
public static final char IMPORT_SELL = 'Z';
public static final String VALID = "Vigente";
public static final String NORENEWED = "No renovado";

private String sanitaryRegistration;
private String state;
private String expiration;
private char modality;

public Invima(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName,String sanitaryRegistration, String state, String expiration, char modality){
  super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,typeOrganization,legalName);
  this.sanitaryRegistration = sanitaryRegistration;
  this.state = state;
  this.expiration = expiration;
  this.modality = modality;
}

public String getSanitaryRegistration(){
  return sanitaryRegistration;
}

public void setSanitaryRegistration(String sanitaryRegistration){
  this.sanitaryRegistration = sanitaryRegistration;
}

public String getState(){
  return state;
}

public void setState(String state){
  this.state = state;
}

public String getExpiration(){
  return expiration;
}

public void setExpiration(String expiration){
  this.expiration = expiration;
}

public char getModality(){
return modality;
}

public void setModality(char modality){
  this.modality = modality;
}


}
