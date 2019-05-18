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


public EducationsCompany(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, char typeOrganization, String legalName, String numberRegistrationMEN,int numberYearsAcreditation,int nationalPositionSaber11,int nationalPositionSaberPro,String rectorName,String educativeSector,int amountStudentsStratum1and2, int totalAmountActivesStudent){
super(nameComercy,nit,addres,phoneContact,employeerCant,amountActives,typeOrganization,legalName);
this.numberRegistrationMEN = numberRegistrationMEN;
this.numberYearsAcreditation = numberYearsAcreditation;
this.nationalPositionSaber11 = nationalPositionSaber11;
this.nationalPositionSaberPro = nationalPositionSaberPro;
this.rectorName = rectorName;
this.educativeSector = educativeSector;
this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
this.totalAmountActivesStudent = totalAmountActivesStudent;
}

public double calculatedProCultura(){
double porcentaje = 0.0;

porcentaje += 20 - ( amountStudentsStratum1and2/100);

if(porcentaje < 0){

porcentaje = 0.0;

}

return porcentaje;
}





}
