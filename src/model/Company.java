package model;

public abstract class Company{

public final static char AGRICUL_HUNT_SILV_FISH = 'A';
public static final char EXPLOT_MINES_CAN = 'B';
public static final char INDUSTRY_MANU = 'C';
public static final char ELECTRICITY_GAS_STEAM = 'D';
public static final char CONSTRUCTION = 'E';
public static final char COMERCY_MM  = 'F';
public static final char TRANSPORTATION_A_C = 'G';
public static final char SECURE_INMU_COM = 'H';
public static final char SOCI_COM = 'I';

private  String nameComercy;
private String nit;
private String addres;
private String phoneContact;
private int employeerCant;
private double amountActives;
private String dateOfInscription;
private char typeOrganization;
private String legalName;
private Building[][] tower;

public Company(String nameComercy,String nit, String addres,String phoneContact, int employeerCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName ){
  this.nameComercy = nameComercy;
  this.nit = nit;
  this.addres = addres;
  this.phoneContact = phoneContact;
  this.employeerCant = employeerCant;
  this.amountActives = amountActives;
  this.dateOfInscription = dateOfInscription;
  this.typeOrganization = typeOrganization;
  this.legalName = legalName;
  tower = new Building[7][20];
}

public String getDateOfInscription(){
  return dateOfInscription;
}

public void setDateOfInscription(String dateOfInscription){
  this.dateOfInscription = dateOfInscription;
}

public String getNameComercy(){
  return nameComercy;
}

public void setNameComercy(String nameComercy){
  this.nameComercy = nameComercy;
}

public String getNit(){
  return nit;
}

public void setNit(String nit){
  this.nit = nit;
}

public String getAddres(){
  return addres;
}

public void setAddres(String addres){
  this.addres = addres;
}

public String getPhoneContact(){
  return phoneContact;
}

public void setPhoneContact(String phoneContact){
  this.phoneContact = phoneContact;
}

public int getEmployeerCant(){
  return employeerCant;
}

public void setEmployeerCant(int employeerCant){
  this.employeerCant = employeerCant;
}

public double getAmountActives(){
  return amountActives;
}

public void setAmountActives(double amountActives){
  this.amountActives = amountActives;
}

public char getTypeOrganization(){
  return typeOrganization;
}

public void setTypeOrganization(char typeOrganization){
  this.typeOrganization = typeOrganization;
}

public String getLegalName(){
  return legalName;
}

public void setLegalName(String legalName){
  this.legalName = legalName;
}

public Building[][] getTower(){
	return tower;
}

public void setTower(Building[][] tower){
this.tower = tower;
}

public abstract String toString();

public String espiral(String cargo){
	String msj = "";
	boolean ultima = false;
	boolean ultimaDerecha = false;
	
	for(int i = 0; i < tower.length * tower[0].length; i++){
		
		if(!ultima){
		if(tower[i][0].getCargo.equals(cargo)){
	    msj += tower[i][0];
		}
		if(i = tower.length){
			ultima = true;
		}
			}else if(!ultimaDerecha){		
			if(tower[tower.length][sumador++].getCargo.equals(cargo)){
			String msj += tower[tower.length][i++];	
			}
			if(i == tower[0].length){
			ultimaDerecha = true;
			}
				}else if(!ultimaArriba){
					if(tower[i++][tower.length].getCargo.equals(cargo)){
					String msj += tower[i++][tower.length];
					}
					if(i == tower.length){
					ultimaArriba = true;
					}
						}else if(!arribaIzquierda){
						if(tower[tower.length--][i++].getCargo.equals(cargo)){
						 msj += tower[tower.length--][i++].getEmail();
						}
						if(){}
		
		
		}else if(!arribaAbajo){
			
		String msj += tower[i++][tower.length--];
		if(tower[i].getCargo.equals(cargo)){
		arribaAbajo = true;
		}
		
		}else if(!derecha){
			
		String msj += tower[i+2][tower.length--];
				if(tower[i].getCargo.equals(cargo)){
		derecha = true;
		}
		
		}else if(!Arriba){
		String msj += tower[tower.length--][i+3];
		if(tower.length--][i+3].getCargo.equals(cargo)){
		Arriba = true;
		}
		
		}else if(!derechaIzquierda){
		String msj += tower[i++][tower.length-2];
		if(tower[i].getCargo.equals(cargo)){
		ultimaArriba = true;
		}
		
		}else if(!)
		
		
	}
	
	
}

public String espiral(String cargo){
	
	String msj = "";
	boolean AbajoDerecha = false;
	boolean ultimaArriba = false;
	boolean arribaIzquierda = false;
	int sumador = 0;
	int restador = 0;
	
	for(int i = 0; i < tower.length;i++){
		//Abajo
		for(int k = 0; i < tower[0].length-sumador; k++){
		if(tower[k][i].getCargo().equals(cargo)){
		    msj += tower[k][i].getEmail();
		}
		abajoDerecha = true;
	}
	//Abajo derecha
	if(AbajoDerecha == true){
		for(int j = 1; j < tower[0].length-sumador; j++){
			if(tower[tower.length][j].getCargo().equals(cargo)){
			msj += tower[tower.length][j].getEmail();
			}
		ultimaArriba = true;
		}
	}
	
	if(ultimaArriba == true){
		for(int k = tower.length; k > sumador;k--){
			
			if(tower[k][tower.length].getCargo().equals(cargo)){
			msj += tower[k][tower.length].getEmail();
			}
			arribaIzquierda = true;
		}
	}
	
	if(arribaIzquierda == true){
		for(int m = tower.length-sumador; m > restador ; m--){
			if(tower[restador][m].getCargo().equals(cargo)){
			msj += tower[restador][m].getEmail();
			}
		}	
	}
	
    AbajoDerecha = false;
	ultimaArriba = false;
	arribaIzquierda = false;
	sumador++;
	restador++;
		
		
		
	}
	
	
	return msj;
	
	
}


}
