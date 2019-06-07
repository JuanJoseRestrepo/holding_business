package model;

import java.util.ArrayList;

public class ServiceCompany extends Company{

//Relaciones
private ArrayList<Poll> polls;

public ServiceCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
polls = new ArrayList<Poll>();
}

public ArrayList<Poll> getPolls(){
  return polls;
}

public void setPolls(ArrayList<Poll> polls){
  this.polls = polls;
}

public void addPolls(ArrayList<Poll> client){
  polls = client;
}

public String getInfor(){
String msj = "";

for(int i = 0 ; i < polls.size();i++){

msj += polls.get(i).toString();


}

return msj;

}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre del comercio es:" + getNameComercy();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nit es:" + getNit();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La direccion es:" + getAddres();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero  celular es:" + getPhoneContact();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de empleados es:" + getEmployeerCant();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La cantidad de activos es:" + getAmountActives();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La fecha en la que se hizo" + getDateOfInscription();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El tipo de organizacion es:" + getTypeOrganization();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre legal es:" + getLegalName();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El promedio de las encuestas es:" + promediateOfThis();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}

public String promediateOfThis(){

String msj = "";
int ser = 0;
int ans = 0;
int rela = 0;
for(int i = 0; i < polls.size();i++){
  ser += polls.get(i).getServiceDoIt();
  ans += polls.get(i).getAnswerTime();
  rela += polls.get(i).getRelationCostXBenefit();

  msj += "El servicio hecho es:" + ser + "El tiempo de respuesta es:" + ans + "El costo de relacion por beneficio es:" + rela;
}
return msj;

}








}
