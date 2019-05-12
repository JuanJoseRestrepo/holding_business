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

protected String nameComercy;
protected String nit;
protected String addres;
protected String phoneContact;
protected int employeerCant;
protected double amountActives;
protected char typeOrganization;
protected String legalName;

public Company(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName ){
  this.nameComercy = nameComercy;
  this.nit = nit;
  this.addres = addres;
  this.phoneContact = phoneContact;
  this.employeerCant = employeerCant;
  this.amountActives = amountActives;
  this.typeOrganization = typeOrganization;
  this.legalName = legalName;
}




}
