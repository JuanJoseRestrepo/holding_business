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

public ServiceCompany getCompanies(String nombre){

ServiceCompany m = null;
boolean f = false;

for(int i = 0; i < companies.size() && !f ;i++){
if(nombre.equals(companies.get(i).getNameComercy())){
  if(companies.get(i) instanceof TechnologyCompany){

    m = companies.get(i);
    f = true;
  }else if(companies.get(i) instanceof EducationsCompany){

    m = companies.get(i);
    f = true;
  }else if(companies.get(i) instanceof PublicCompany){

    m = companies.get(i);
    f = true;
  }

}

}

return m;

}

}
