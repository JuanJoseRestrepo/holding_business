package model;

public class EducationsCompany extends ServiceCompany implements Taxes{

public static final String HIGH_SCHOOL = "Bachillerato" ;
public static final String UNIVERSITY = "Universidad" ;

private String numberRegistrationMEN;
private int numberYearsAcreditation;
private int nationalPositionSaber11;
private int nationalPositionSaberPro;
private String rectorName;
private String educativeSector;
private int amountStudentsStratum1and2;
private int totalAmountActivesStudent;

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
*@param numberRegistrationMEN String el numero de registro de la MEN
*@param numberYearsAcreditation int el numero de years acreditados
*@param nationalPositionSaber11 int el puesto nacional en las pruebas saber11
*@param rectorName String el nombre del rector
*@param educativeSector String el sector educativo
*@param amountStudentsStratum1and2 int el total de estudiantes estrato 1 y 2
*@param totalAmountActivesStudent int el total de estudiantes
*/
public EducationsCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build, String numberRegistrationMEN,int numberYearsAcreditation,int nationalPositionSaber11,int nationalPositionSaberPro,String rectorName,String educativeSector,int amountStudentsStratum1and2, int totalAmountActivesStudent){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
this.numberRegistrationMEN = numberRegistrationMEN;
this.numberYearsAcreditation = numberYearsAcreditation;
this.nationalPositionSaber11 = nationalPositionSaber11;
this.nationalPositionSaberPro = nationalPositionSaberPro;
this.rectorName = rectorName;
this.educativeSector = educativeSector;
this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
this.totalAmountActivesStudent = totalAmountActivesStudent;
}

/**Description: este metodo obtiene el numero de registro ante la men
*@return String el numero de registro ante la men
*/
public String getNumberRegistrationMEN(){
  return numberRegistrationMEN;
}

/**Description: este metodo modifica el numero de registro ante la men
@param numberRegistrationMEN String el numero de registro ante la men
*/
public void setNumberRegistrationMEN(String numberRegistrationMEN){
  this.numberRegistrationMEN = numberRegistrationMEN;
}

/**Description: este metodo obtiene los anhos de acreditacion
*@return int los anhos de acreditacion
*/
public int getNumberYearsAcreditation(){
  return numberYearsAcreditation;
}

/**Description: este metodo modifica los anhos de acreditacion
@param numberYearsAcreditation int los anhos de acreditacion
*/
public void setNumberYearsAcreditation(int numberYearsAcreditation){
  this.numberYearsAcreditation = numberYearsAcreditation;
}

/**Description: este metodo obtiene el puesto saber11
*@return int el puesto saber11
*/
public int getNationalPositionSaber11(){
  return nationalPositionSaber11;
}

/**Description: este metodo modifica el puesto saber11
@param nationalPositionSaber11 int el puesto saber11
*/
public void setNationalPositionSaber11(int nationalPositionSaber11){
  this.nationalPositionSaber11 = nationalPositionSaber11;
}

/**Description: este metodo obtiene el puesto nacional saber pro
*@return int el puesto nacional saber pro
*/
public int getNationalPositionSaberPro(){
  return nationalPositionSaberPro;
}

/**Description: este metodo modifica el puesto nacional saber pro
@param nationalPositionSaberPro int el puesto nacional saber pro
*/
public void setNationalPositionSaberPro(int nationalPositionSaberPro){
  this.nationalPositionSaberPro = nationalPositionSaberPro;
}

/**Description: este metodo obtiene el nombre del rector
*@return String el nombre del rector
*/
public String getRectorName(){
  return rectorName;
}

/**Description: este metodo modifica el nombre del rector
@param rectorName String el nombre del rector
*/
public void setRectorName(String rectorName){
  this.rectorName = rectorName;
}

/**Description: este metodo obtiene el sector educativo
*@return String el el sector educativo
*/
public String getEducativeSector(){
  return educativeSector;
}

/**Description: este metodo modifica el sector educativo
@param educativeSector String  el sector educativo
*/
public void setEducativeSector(String educativeSector){
  this.educativeSector = educativeSector;
}

/**Description: este metodo obtiene la cantidad de estudiantes 1 y 2
*@return int la cantidad de estudiantes 1 y 2
*/
public int getAmountStudentsStratum1and2(){
  return amountStudentsStratum1and2;
}

/**Description: este metodo modifica la cantidad de estudiantes 1 y 2
@param amountStudentsStratum1and2 int la cantidad de estudiantes 1 y 2
*/
public void setAmountStudentsStratum1and2(int amountStudentsStratum1and2){
  this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
}

/**Description: este metodo obtiene la cantidad de estudiantes en total
*@return int la cantidad de estudiantes en total
*/
public int getTotalAmountActivesStudent(){
  return totalAmountActivesStudent;
}

/**Description: este metodo modifica la cantidad de estudiantes en total
@param totalAmountActivesStudent int la cantidad de estudiantes en total
*/
public void setTotalAmountActivesStudent(int totalAmountActivesStudent){
  this.totalAmountActivesStudent = totalAmountActivesStudent;
}

/** Description:Este metodo obtiene la informacion de la coimpanhia publica
*@return String la informacion de la companhia
*/
public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero de registro es:" + numberRegistrationMEN + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Los años de acreditacion es:" + numberYearsAcreditation + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El puesto en las pruebas 11 es:" + nationalPositionSaber11 + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El puesto de las pruebas Pro es:" + nationalPositionSaberPro + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre del rector es:" +rectorName + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El sector educativo es:" + educativeSector + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero de estudiantes en estratos uno y dos son:" + amountStudentsStratum1and2 + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero de total de estudiantes es:" +totalAmountActivesStudent + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El impuesto de procultura es:" + calculatedProCultura() + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";


return msj;


}


/**Description: Este metodo calcula el impuesto pro cultura
*@return double el calculo del impuesto pro cultura
*/
public double calculatedProCultura(){
double porcentaje = 0.0;

porcentaje += 20 - ( amountStudentsStratum1and2/100);

if(porcentaje < 0){

porcentaje = 0.0;

}

return porcentaje;
}





}
