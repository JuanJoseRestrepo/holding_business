package model;
import java.util.ArrayList;

public class ManufacturingCompany extends Company{

//Relaciones
private ArrayList<Product> products;

public ManufacturingCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,typeOrganization,legalName);
products = new ArrayList<Product>();
}

public int serviceWaterxTree(){

int amountTree = 0.0;

for(int i = 0; i < products.size(); i++){
  Product m = products.get(i);
  if(){

  }else if(){

  }else if(){

  }
}



return amountTree;

}



}
