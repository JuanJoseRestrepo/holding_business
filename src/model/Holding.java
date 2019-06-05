package model;
import java.util.ArrayList;

public class Holding{

//Relaciones

private ArrayList<Company> companies;

public Holding(){
companies = new ArrayList<Company>();
}

public void addCompany(Company m){

  companies.add(m);

}

public String showInfo(){
String msj = "";

for(int i = 0; i < companies.size(); i++){

msj += companies.get(i).toString();

}
return msj;
}


public void addCompanyProducts(Company k,ArrayList<Product> l){

  companies.add(k);
  ((ManufacturingCompany) k).addProduct(l);

	for(int i = 0; i < companies.size();i++){
		if(companies.get(i) instanceof ManufacturingCompany){
    ((ManufacturingCompany) k).addProduct(l);
		}

	}

}

public String getCompaniesNames(){
  String msj = "";

	for(int i = 0; i < companies.size();i++){

    	if(companies.get(i) instanceof ServiceCompany){

        msj += companies.get(i).getNameComercy();

      }


  }

return msj;

}

public String getCompanyWithProducts(String nombre){
String msj = "";

for(int i = 0; i < companies.size();i++){

if(companies.get(i) instanceof ManufacturingCompany){

  if(companies.get(i).getNameComercy().equals(nombre)){

msj += ((ManufacturingCompany)companies.get(i)).getInformation();

}
}


}
return msj;
}

public ArrayList<Product> getProductWithCompany(String nombre){

ArrayList<Product> m = null;

  for(int i = 0; i < companies.size();i++){

if(companies.get(i) instanceof ManufacturingCompany){

  if(companies.get(i).getNameComercy().equals(nombre)){


    m =  ((ManufacturingCompany)companies.get(i)).getProducts();

}

  }
}
return m;
}


}
