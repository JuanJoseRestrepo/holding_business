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

public void addProduct(Product pro){

  products.add(pro);
}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre del comercio es:" + nameComercy;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nit es:" + nit;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La direccion es:" + addres;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero  celular es:" + phoneContact;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de empleados es:" + employeerCant;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de activos es:" + amountActives;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El tipo de organizacion es:" + typeOrganization;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre legal es:" + legalName;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

for(int i = 0; i < products.size();i++){

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += products.get(i).toString();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

}

return msj;


}





}
