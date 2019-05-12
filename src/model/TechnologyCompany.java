package model;

public class TechnologyCompany extends ServiceCompany{

public static final char CAPATATION_CONSULT = 'J';
public static final char SOFTWARE_DEVELOP = 'K';
public static final char INFRASTRUCTURE_SER = 'L';
public static final char SOFTWARE_SER = 'M';
public static final char PLATAFORM_SER = 'N';

private char service;

public TechnologyCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName){
  super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,typeOrganization,legalName);
  this.service = service;
}






}
