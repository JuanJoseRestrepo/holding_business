package model;
import java.util.ArrayList;

public class ManufacturingCompany extends Company{

//Relaciones
private ArrayList<Product> products;

public ManufacturingCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,typeOrganization,legalName);
products = new ArrayList<Product>();
}

public ArrayList<Product> getProducts(){
  return products;
}

public void setProducts(ArrayList<Product> products){
  this.products = products;
}

public int serviceWaterxTree(){

int amountTree = 0;

for(int i = 0; i < products.size(); i++){
  Product m = products.get(i);
  if(m.getWaterAmount() > 1 && m.getWaterAmount() < 140){

    amountTree = 6;

    }else if(m.getWaterAmount() > 141 && m.getWaterAmount() < 800){

      amountTree = 25;

      }else if(m.getWaterAmount() > 800){

          amountTree = 200;

        }
      }

return amountTree;

}



}
