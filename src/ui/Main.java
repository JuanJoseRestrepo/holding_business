package ui;

import model.*;
import java.util.Scanner;

public  class Main{

private Holding principal;
private Scanner reader;

public Main(){
  init();
  reader = new Scanner(System.in);
}


public static void main(String[] args) {
Main m = new Main();
m.showMenu();
}


public void showMenu(){
  int userImput = 0;

  System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
  System.out.println("1.Mostrar la informacion");
  System.out.println("2.Agregar una compahnia");
  System.out.println("9.Salir");
  System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

  while(userImput != 9){

    userImput = reader.nextInt();
    reader.nextLine();

    if(userImput == 1){

      System.out.println(principal.showInfo());

    }else if(userImput == 2){

      int userSelection = 0;

      System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
      System.out.println("Elija el tipo de companhia");
      System.out.println("|||||||||||||||||||||DE SERVICIO||||||||||||||||||||||||");
      System.out.println("1.Empresa de Educacion");
      System.out.println("2.Empresa de tecnologia");
      System.out.println("3.Empresa publica");
      System.out.println("|||||||||||||||||||||DE MANOFACTURA|||||||||||||||||||||");
      System.out.println("4.Empresa de comida");
      System.out.println("5.Empresa de comida");
      System.out.println("6.Salir de la creacion");
      System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
      while(userSelection != 6){
      userSelection = reader.nextInt();
      reader.nextLine();

      if(userSelection == 1){

        System.out.println("Digite el nombre del comercio");
        String comerName1 = reader.nextLine();

        System.out.println("Digite su nit");
        String nit1 = reader.nextLine();

        System.out.println("Digite su direccion");
        String addres1 = reader.nextLine();

        System.out.println("Digite su numero de contacto");
        String phoneContact1 = reader.nextLine();

        System.out.println("Digite la cantidad de empleados");
        int employeerCant1 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el valor de los activos");
        double amountActives1 = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite la fecha en formato AAAA-MM-DD");
        String dateOfInscription1 = reader.nextLine();

        System.out.println("Digite el tipo de organizacion" + "Agricultura,caza,silvestre y pescadera:" +Company.AGRICUL_HUNT_SILV_FISH + "//" + "Explotacion de minas:" + Company.EXPLOT_MINES_CAN + "//" + "Industria de manufactura:" + Company.INDUSTRY_MANU + "//" + "Electricidad,gas y vapos:" + Company.ELECTRICITY_GAS_STEAM + "//" + "construcion:" + Company.CONSTRUCTION + "//" + "Comercio al mayor y menor" + Company.COMERCY_MM + "//" + "Transporte,almacenamiento y Comunicaciones" + Company.TRANSPORTATION_A_C + "//" + "Seguros,inmuebles" + Company.SECURE_INMU_COM + "//" + "Comunales,sociales" + Company.SOCI_COM);
        char typeOrganization1 = reader.nextLine().charAt(0);
        reader.nextLine();

        System.out.println("Digite el nombre legal");
        String legalName1 = reader.nextLine();

        System.out.println("Digite el numero de registro ante el Ministerio de educacion");
        String numberRegistrationMEN1 = reader.nextLine();

        System.out.println("Digite los anhos de acreditacion");
        int numberYearsAcreditation1 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el puesto el puesto en saber 11 (Si esta en el sector Bachillerato,si no ponga 0)");
        int positionSaber11 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el puesto en saber Pro(Si esta en el sector de universitario,si no ponga 0)");
        int positionSaberPro = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el nombre del rector");
        String nameRector = reader.nextLine();

        System.out.println("Digite el sector educativo" + "//" + EducationsCompany.HIGH_SCHOOL + "//" + EducationsCompany.UNIVERSITY);
        String sectorEdu = reader.nextLine();

        System.out.println("Digite los estudiantes en estratos 1 y 2");
        int students1and2 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el total de estudiantes");
        int totalEstudents = reader.nextInt();
        reader.nextLine();

        Company m = new EducationsCompany(comerName1,nit1,addres1,phoneContact1,employeerCant1,amountActives1,dateOfInscription1,typeOrganization1,legalName1,numberRegistrationMEN1,numberYearsAcreditation1,positionSaber11,positionSaberPro,nameRector,sectorEdu,students1and2,totalEstudents);

        principal.addCompany(m);



      }else if(userSelection == 2){

        System.out.println("Digite el nombre del comercio");
        String comerName2 = reader.nextLine();

        System.out.println("Digite su nit");
        String nit2 = reader.nextLine();

        System.out.println("Digite su direccion");
        String addres2 = reader.nextLine();

        System.out.println("Digite su numero de contacto");
        String phoneContact2 = reader.nextLine();

        System.out.println("Digite la cantidad de empleados");
        int employeerCant2 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el valor de los activos");
        double amountActives2 = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite la fecha en formato AAAA-MM-DD");
        String dateOfInscription2 = reader.nextLine();

        System.out.println("Digite el tipo de organizacion" + "Agricultura,caza,silvestre y pescadera:" +Company.AGRICUL_HUNT_SILV_FISH + "//" + "Explotacion de minas:" + Company.EXPLOT_MINES_CAN + "//" + "Industria de manufactura:" + Company.INDUSTRY_MANU + "//" + "Electricidad,gas y vapos:" + Company.ELECTRICITY_GAS_STEAM + "//" + "construcion:" + Company.CONSTRUCTION + "//" + "Comercio al mayor y menor" + Company.COMERCY_MM + "//" + "Transporte,almacenamiento y Comunicaciones" + Company.TRANSPORTATION_A_C + "//" + "Seguros,inmuebles" + Company.SECURE_INMU_COM + "//" + "Comunales,sociales" + Company.SOCI_COM);
        char typeOrganization2 = reader.nextLine().charAt(0);

        System.out.println("Digite el nombre legal");
        String legalName2 = reader.nextLine();
		
		System.out.println("Digite el tipo de servicio + " + TechnologyCompany.CAPATATION_CONSULT + "" + TechnologyCompany.SOFTWARE_DEVELOP + "" + TechnologyCompany.INFRASTRUCTURE_SER + "" + TechnologyCompany.SOFTWARE_SER + "" + TechnologyCompany.PLATAFORM_SER);
		String serviceTechno = reader.nextLine();
		
		System.out.println("Digite el consumo de kilowatts");
		int killowatts = reader.nextDouble();
		reader.nextLine();
	  
		Company n = new TechnologyCompany(comerName2,nit2,addres2,phoneContact2,employeerCant2,amountActives2,dateOfInscription2,typeOrganization2,legalName2,serviceTechno,killowatts);

		principal.addCompany(n);
		
      }else if(userSelection == 3){

        System.out.println("Digite el nombre del comercio");
        String comerName3 = reader.nextLine();

        System.out.println("Digite su nit");
        String nit3 = reader.nextLine();

        System.out.println("Digite su direccion");
        String addres3 = reader.nextLine();

        System.out.println("Digite su numero de contacto");
        String phoneContact3 = reader.nextLine();

        System.out.println("Digite la cantidad de empleados");
        int employeerCant3 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el valor de los activos");
        double amountActives3 = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite la fecha en formato AAAA-MM-DD");
        String dateOfInscription3 = reader.nextLine();

        System.out.println("Digite el tipo de organizacion" + "Agricultura,caza,silvestre y pescadera:" +Company.AGRICUL_HUNT_SILV_FISH + "//" + "Explotacion de minas:" + Company.EXPLOT_MINES_CAN + "//" + "Industria de manufactura:" + Company.INDUSTRY_MANU + "//" + "Electricidad,gas y vapos:" + Company.ELECTRICITY_GAS_STEAM + "//" + "construcion:" + Company.CONSTRUCTION + "//" + "Comercio al mayor y menor" + Company.COMERCY_MM + "//" + "Transporte,almacenamiento y Comunicaciones" + Company.TRANSPORTATION_A_C + "//" + "Seguros,inmuebles" + Company.SECURE_INMU_COM + "//" + "Comunales,sociales" + Company.SOCI_COM);
        char typeOrganization3 = reader.nextLine().charAt(0);

        System.out.println("Digite el nombre legal");
        String legalName3 = reader.nextLine();
		
		System.out.println("Digite el servicio de la empresa publica" + PublicCompany.SAWAGE_SYSTEM + "" + PublicCompany.ENERGY + "" + PublicCompany.AQUEDUCT);
		String namePublic = reader.nextLine();
		
		System.out.println("Digite la cantidad de suscriptores total");
	    int suscriptorsTotal = reader.nextInt();
		reader.nextLine();
		
		System.out.println("Digite la cantidad de suscriptores 1 y 2 ");
		int suscriptors1and2 = reader.nextInt();
		reader.nextLine();
		
		Company b = new TechnologyCompany(comerName3,nit3,addres3,phoneContact3,employeerCant3,amountActives3,dateOfInscription3,typeOrganization3,legalName3,namePublic,suscriptorsTotal,suscriptors1and2);
		
		principal.addCompany(b);

      }else if(userSelection == 4){

        System.out.println("Digite el nombre del comercio");
        String comerName4 = reader.nextLine();

        System.out.println("Digite su nit");
        String nit4 = reader.nextLine();

        System.out.println("Digite su direccion");
        String addres4 = reader.nextLine();

        System.out.println("Digite su numero de contacto");
        String phoneContact4 = reader.nextLine();

        System.out.println("Digite la cantidad de empleados");
        int employeerCant4 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el valor de los activos");
        double amountActives4 = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite la fecha en formato AAAA-MM-DD");
        String dateOfInscription4 = reader.nextLine();

        System.out.println("Digite el tipo de organizacion" + "Agricultura,caza,silvestre y pescadera:" +Company.AGRICUL_HUNT_SILV_FISH + "//" + "Explotacion de minas:" + Company.EXPLOT_MINES_CAN + "//" + "Industria de manufactura:" + Company.INDUSTRY_MANU + "//" + "Electricidad,gas y vapos:" + Company.ELECTRICITY_GAS_STEAM + "//" + "construcion:" + Company.CONSTRUCTION + "//" + "Comercio al mayor y menor" + Company.COMERCY_MM + "//" + "Transporte,almacenamiento y Comunicaciones" + Company.TRANSPORTATION_A_C + "//" + "Seguros,inmuebles" + Company.SECURE_INMU_COM + "//" + "Comunales,sociales" + Company.SOCI_COM);
        char typeOrganization4 = reader.nextLine().charAt(0);

        System.out.println("Digite el nombre legal");
        String legalName4 = reader.nextLine();


      }else if(userSelection == 5){

        System.out.println("Digite el nombre del comercio");
        String comerName5 = reader.nextLine();

        System.out.println("Digite su nit");
        String nit5 = reader.nextLine();

        System.out.println("Digite su direccion");
        String addres5 = reader.nextLine();

        System.out.println("Digite su numero de contacto");
        String phoneContact5 = reader.nextLine();

        System.out.println("Digite la cantidad de empleados");
        int employeerCant5 = reader.nextInt();
        reader.nextLine();

        System.out.println("Digite el valor de los activos");
        double amountActives5 = reader.nextDouble();
        reader.nextLine();

        System.out.println("Digite la fecha en formato AAAA-MM-DD");
        String dateOfInscription5 = reader.nextLine();

        System.out.println("Digite el tipo de organizacion" + "Agricultura,caza,silvestre y pescadera:" +Company.AGRICUL_HUNT_SILV_FISH + "//" + "Explotacion de minas:" + Company.EXPLOT_MINES_CAN + "//" + "Industria de manufactura:" + Company.INDUSTRY_MANU + "//" + "Electricidad,gas y vapos:" + Company.ELECTRICITY_GAS_STEAM + "//" + "construcion:" + Company.CONSTRUCTION + "//" + "Comercio al mayor y menor" + Company.COMERCY_MM + "//" + "Transporte,almacenamiento y Comunicaciones" + Company.TRANSPORTATION_A_C + "//" + "Seguros,inmuebles" + Company.SECURE_INMU_COM + "//" + "Comunales,sociales" + Company.SOCI_COM);
        char typeOrganization5 = reader.nextLine().charAt(0);

        System.out.println("Digite el nombre legal");
        String legalName5 = reader.nextLine();


      }else{

        System.out.println("Ha salido con exito de la creacion");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("1.Mostrar la informacion");
        System.out.println("2.Agregar una compahnia");
        System.out.println("9.Salir");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

      }

    }
}

    }




  }

  public void init(){

    principal = new Holding();

    Company techno = new TechnologyCompany("UbisoftSoftware","123330133","Sucre","3104898989",12,139.1,"2019-03-01", Company.SECURE_INMU_COM, "Bugisoft", TechnologyCompany.SOFTWARE_DEVELOP, 1233);
    principal.addCompany(techno);

  }


}//finalxd
