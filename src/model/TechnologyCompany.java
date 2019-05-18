package model;
import java.util.ArrayList;

public class TechnologyCompany extends ServiceCompany{

//Constantes

public static final String CAPATATION_CONSULT = "Consultoria capacitacion";
public static final String SOFTWARE_DEVELOP = "Desarrollo de software a la medida";
public static final String INFRASTRUCTURE_SER = "Infraestructura como servicio";
public static final String SOFTWARE_SER = "Software como servicio";
public static final String PLATAFORM_SER = "Plataforma como servicio";

//Atributo

private String service;


//Relaciones

private ArrayList<String> services;


public TechnologyCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName){
  super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,typeOrganization,legalName);
	this.service = service;
	services = new ArrayList<String>();
	services.add(CAPATATION_CONSULT);
	services.add(SOFTWARE_DEVELOP);
	services.add(INFRASTRUCTURE_SER);
	services.add(SOFTWARE_SER);
	services.add(PLATAFORM_SER);

}






}
