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

	for(int i = 0; i < companies.size();i++){

		if(companies.get(i) instanceof ManufacturingCompany){

			companies.add(k);
      k.addProduct(l);


		}

	}

}





}
