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
      ManufacturingCompany m = k.addProduct(l);
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

public String addPolls(String nameComercy1,ArrayList<Poll> client){
  String msj = "";

  for(int i = 0; i < companies.size();i++){

    	if(companies.get(i) instanceof ServiceCompany){
        if(nameComercy1.equals(companies.get(i))){

           companies.get(i).addPolls(client);

        }else{
          msj = "No existe esa empresa";
        }


      }


  }


}





}
