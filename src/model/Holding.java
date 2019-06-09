package model;
import java.util.ArrayList;

public class Holding{

//Relaciones

private ArrayList<Company> companies;
private Building principalOfThis;

/** Description: Constructor donde se inicializa las variables
*@param principalOfThis Building el edificio
*/
public Holding(Building principalOfThis){
  this.principalOfThis = principalOfThis;
companies = new ArrayList<Company>();
}

/**
*Description: Este metodo obtiene los edificios
*@return Building el edificio donde se encuentra
*/
public Building getBuilding(){
  return principalOfThis;
}

/**Description: Este metodo modifica los edificios
*@param principalOfThis Building el edificio
*/
public void setBuilding(Building principalOfThis){
  this.principalOfThis = principalOfThis;
}

/** Description: Este metodo se agrega la companhia
*@param m Company agrega la companhia
*/
public void addCompany(Company m){

  companies.add(m);

}

/** Description: este metodo muestra la informacion de las companhias
*@return String la informacion de las empresas
*/
public String showInfo(){
String msj = "";

for(int i = 0; i < companies.size(); i++){

msj += companies.get(i).toString();

}
return msj;
}

/** Description: Este metodo agrega los productos con la companhias
*@param k Company la companhia
*@param l ArrayList los varios productos
*/
public void addCompanyProducts(Company k,ArrayList<Product> l){

  companies.add(k);
  ((ManufacturingCompany) k).addProduct(l);


}

/** Description: Este metodo agrega las encuestas con las companhias
*@param k Company la companhia
*@param polls las encuestas a las companhias
*/
public void addCompanyWithPolls(Company k, ArrayList<Poll> polls){

companies.add(k);
((ServiceCompany)k).addPolls(polls);


}

/** Description: Obtiene el nombre de las companhias
*@return String la informacion
*/
public String getCompaniesNames(){
  String msj = "";

	for(int i = 0; i < companies.size();i++){

    	if(companies.get(i) instanceof ServiceCompany){

        msj += companies.get(i).getNameComercy();

      }


  }

return msj;

}

/** Description: Este metodo obtiene la informacion de la companhia
*@param nombre String el nombre de la companhia
*@return String la informacion de la companhia
*/
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

/** Description: Este metodo obtiene la informacion de las polls
*@param nombre1 String el nombre de la companhia
*@return String la info de las polls
*/
public String getCompanyWithPolls(String nombre1){
String msj = "";

for(int i = 0; i < companies.size();i++){

if(companies.get(i) instanceof ServiceCompany){
  if(companies.get(i).getNameComercy().equals(nombre1)){

    msj += ((ServiceCompany) companies.get(i)).getInfor();

  }

}

}

return msj;

}

/** Description: Este metodo obtiene el objeto de la companhia
*@param nombre String el nombre de la companhia
*@return ArrayList el arreglo de los productos
*/
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

/** Description: Este metodo obtiene el objeto de poll
*@param nombre1 String el nombre de la companhia
*@return ArrayList el arreglo de polls
*/
public ArrayList<Poll> getPollsWithCompany(String nombre1){

ArrayList<Poll> k = null;

for(int i = 0; i < companies.size();i++){

if(companies.get(i) instanceof ServiceCompany){
  if(companies.get(i).getNameComercy().equals(nombre1)){

    k = ((ServiceCompany)companies.get(i)).getPolls();

  }

}

}

return k;

}

/** Description: Este metodo agrega a un empleado a un cubiculo
*@param nameCom String el nombre de la companhia
*@param nameEm String el nombre del empleado
*@param positionEm String el cargo del empleado
*@param emailEm String el email del empleado
*/
public void addEmployeerToCubicules(String nameCom,String nameEm,String positionEm,String emailEm){

for(int i = 0; i < companies.size();i++){
  if(nameCom.equals(companies.get(i).getNameComercy())){
    if(companies.get(i).getBuilding1().getEmployeer() !=null){
      companies.get(i).getBuilding1().assigTheEmploInCub(nameEm,positionEm,emailEm);
    }
  }
}

}

/** Description: Agrega un edifico a una companhia
*@param nameCom String el nombre de la companhia
*@param numberPisos Building el edifico a agregar
*/
public void addBuildingToCompany(String nameCom,Building numberPisos){

for(int i = 0; i < companies.size();i++){
  if(companies.get(i).getNameComercy().equals(nameCom)){
    if(companies.get(i).getBuilding1().getEmployeer() == null){
        companies.get(i).setBuilding1(numberPisos);
    }
  }

}

}

/** Description: Este metodo muestra el recorrido en L
*@param nombre3 String el nombre de la companhia
*@param nombreEmpleado el nombre del empleado
*@return String la informacion del edificio
*/
public String showBuildingL(String nombre3,String nombreEmpleado){
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){

msj += companies.get(i).getBuilding1().recorridoL(nombreEmpleado);

}

}
return msj;
}

/** Description: Este metodo muestra el recorrido en Z
*@param nombre3 String el nombre de la companhia
*@param nombreEmpleado el nombre del empleado
*@return String la informacion del edificio
*/
public String showBuildingZ(String nombre3,String nombreEmpleado){
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){

msj += companies.get(i).getBuilding1().recorridoZ(nombreEmpleado);

}

}
return msj;
}

/** Description: Este metodo muestra el recorrido en espiral
*@param nombre3 String el nombre de la companhia
*@param cargo1 el cargo del empleado
*@return String la informacion del edificio
*/
public String showBuildingEspiral(String nombre3,String cargo1){
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){

msj += companies.get(i).getBuilding1().espiral(cargo1);

}

}
return msj;
}

/** Description: Este metodo muestra el recorrido en E
*@param nombre3 String el nombre de la companhia
*@param nombreEmpleado el nombre del empleado
*@return String la informacion del edificio
*/
public String showBuildingE(String nombre3,String nombreEmpleado){
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){

msj += companies.get(i).getBuilding1().espiralE(nombreEmpleado);

}

}
return msj;
}

/** Description: Este metodo muestra el recorrido en O
*@param nombre3 String el nombre de la companhia
*@param nombreEmpleado el nombre del empleado
*@return String la informacion del edificio
*/
public String showBuildingO(String nombre3,String nombreEmpleado){
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){

msj += companies.get(i).getBuilding1().espiralO(nombreEmpleado);

}

}
return msj;
}

/** Description: Este metodo muestra el recorrido en X
*@param nombre3 String el nombre de la companhia
*@param nombreEmpleado el nombre del empleado
*@return String la informacion del edificio
*/
public String showBuildingX(String nombre3,String nombreEmpleado){
String msj = "";

for(int i = 0; i < companies.size();i++){
if(companies.get(i).getNameComercy().equals(nombre3)){

msj += companies.get(i).getBuilding1().espiralXfila(nombreEmpleado);

}

}
return msj;
}


}
