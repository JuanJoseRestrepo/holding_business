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
  System.out.println("9.Salir");
  System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

  while(userImput != 9){

    userImput = reader.nextInt();
    reader.nextLine();

    if(userImput == 1){

      System.out.println(principal.showInfo());

    }else if(userImput == 2){

      System.out.println("");
    }


    }




  }

  public void init(){

    principal = new Holding();

    Company techno = new TechnologyCompany("UbisoftSoftware","123330133","Sucre","3104898989",12,139.1, Company.SECURE_INMU_COM, "Bugisoft", TechnologyCompany.SOFTWARE_DEVELOP, 1233);
    principal.addCompany(techno);

  }


}//finalxd
