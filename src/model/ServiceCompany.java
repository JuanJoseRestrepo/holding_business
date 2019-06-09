package model;

import java.util.ArrayList;

public class ServiceCompany extends Company{

//Relaciones
private ArrayList<Poll> polls;

/**Description: Este constructor inicializa las variables
*@param nameComercy String el nombre de la empresa
*@param nit String el nit de la empresa
*@param addres String la direccion de la empresa
*@param phoneContact String la direccion de la empresa
*@param employeerCant int la cantidad de empleados
*@param amountActives double la cantidad de activos
*@param dateOfInscription String el dia de la inscripcion
*@param typeOrganization char el tipo de organizacion
*@param legalName String el nombre legal
*@param build Building el edificio
*/
public ServiceCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
polls = new ArrayList<Poll>();
}

/** Description: obtiene las encuestas
*@return ArrayList el arrayList de encuestas
*/
public ArrayList<Poll> getPolls(){
  return polls;
}

/** Description: este metodo establece las encuestas
*@param polls ArrayList las encuestas
*/
public void setPolls(ArrayList<Poll> polls){
  this.polls = polls;
}

/** Description: este metodo agrega las encuestas
*@param client ArrayList las encuestas nuevas
*/
public void addPolls(ArrayList<Poll> client){
  polls = client;
}

/** Description: la inforamcion de las encuestas
*@return String  la informacion de las polls
*/
public String getInfor(){
String msj = "";

for(int i = 0 ; i < polls.size();i++){

msj += polls.get(i).toString1();


}

return msj;

}

/** Description: Este metodo obtiene la informacion en general
*@return String la informacion
*/
public String toString(){
String msj = "";

msj += "----------------------------------------------------------------------------------------------------------------------------\n";
msj += "El nombre del comercio es:" + getNameComercy() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nit es:" + getNit() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La direccion es:" + getAddres() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero  celular es:" + getPhoneContact() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de empleados es:" + getEmployeerCant() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de activos es:" + getAmountActives() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La fecha en la que se hizo" + getDateOfInscription()+ "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El tipo de organizacion es:" + getTypeOrganization()+ "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre legal es:" + getLegalName()+ "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El promedio de las encuestas es:" + promediateFinal()+ "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El promedio de las encuestas de 50" + promediateFinal1() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

for(int k = 0; k < polls.size();k++){
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += polls.get(k).toString1();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

}

return msj;


}

/** Description: el promedio en general
*@return int el servicio
*/
public int promediateOfThis(){

int ser = 0;
for(int i = 0; i < polls.size();i++){
  ser += polls.get(i).getServiceDoIt();

}
return ser;

}

/** Description: el promedio en general
*@return int el tiempo de respuesta
*/
public int promediateOfThis1(){

int ans = 0;
for(int i = 0; i < polls.size();i++){
  ans += polls.get(i).getAnswerTime();

}
return ans;

}

/** Description: el promedio en general
*@return int la relacion costo por beneficio
*/
public int promediateOfThis2(){

int rela = 0;
for(int i = 0; i < polls.size();i++){
  rela += polls.get(i).getRelationCostXBenefit();
}
return rela;

}

/** Description: el promedio final sobre 10
*@return int el promedio
*/
public int promediateFinal(){

  int finalPolls = 0;

  finalPolls = (promediateOfThis() + promediateOfThis1() + promediateOfThis2()) / 10;

  return finalPolls;


}

/** Description: el promedio final sobre 50
*@return int el promedio
*/
public int promediateFinal1(){

int finalPolls1 = 0;

finalPolls1 = (promediateOfThis() + promediateOfThis1() + promediateOfThis2()) / 50;

return finalPolls1;


}








}
