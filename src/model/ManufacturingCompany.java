package model;
import java.util.ArrayList;

public class ManufacturingCompany extends Company{

//Relaciones
private ArrayList<Product> products;

public ManufacturingCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,typeOrganization,legalName);
products = new ArrayList<Product>();
}





}
