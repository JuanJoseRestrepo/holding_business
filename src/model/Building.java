package model;

public class Building{

private Employeer[][] tower;
private int numberBuilding;

/**Description: este metodo inicializa los empleados(cubiculos)
*/
public void inicializatedCub(){
for(int i = 0; i < tower.length;i++){
	for(int j = 0; j < tower[0].length;j++){
		tower[i][j] = new Employeer("","68" + i + j,"","",false);
	}
}
}

/** Description: Este metodo inicializa las variables
*@param numberBuilding int el numero de pisos
*/
public Building(int numberBuilding){
this.numberBuilding = numberBuilding;
tower = new Employeer[numberBuilding][20];
inicializatedCub();
}

/** Description: Este metodo obtiene el cubiculo
*@return Employer la torre
*/
public Employeer[][] getEmployeer(){
	return tower;
}

/** Description: Este metodo estable el cubiculo
*@param tower Employeer el edificio
*/
public void setEmployeer(Employeer[][] tower){
	this.tower = tower;
}

/**Description: Este metodo asigna un empleado en un cubiculo
*@param nameEm String el nombre del empleado
*@param positionEm String el cargo del empleado
*@param emailEm String el email del empleado
*/
public void assigTheEmploInCub(String nameEm, String positionEm, String emailEm){

boolean t = false;
	for(int i = 0; i < tower.length && !t;i++){
		for(int k = 0; k < tower[0].length && !t;k++){
			if(tower[i][k].getDisponibility() == false){
				tower[i][k].setNameEmployeer(nameEm);
				tower[i][k].setPosition(positionEm);
				tower[i][k].setEmail(emailEm);
				tower[i][k].setDisponibility(true);
				t = true;
			}
		}
	}
}

/** Description: Este metodo hace el recorrido en L de la matriz
*@param nameEmpleado String el nombre del empleado
*@return String el nombre del empleado
*/
public String recorridoL(String nameEmpleado){
String msj = "";
int k = 0;
boolean abajoL = false;

for(int i = 0;  i < tower.length; i++){
    if(tower[i][k].getNameEmployeer().equals(nameEmpleado)){

      msj = "El empleado es:" + tower[i][k].getExtension();
      }
    abajoL = true;
  }

  if(abajoL == true){
    for(int m = 1; m  < tower[0].length; m++){
      if(tower[k][m].getNameEmployeer().equals(nameEmpleado)){

            msj = "El empleado es:" + tower[k][m].getExtension();
    }


  }

}

return msj;


}

/** Description: Este metodo hace el recorrido en Z de la matriz
*@param nombreEmpleado String el nombre del empleado
*@return String el nombre del empleado
*/
public String recorridoZ(String nombreEmpleado){

String msj = "";

for(int i =0; i < tower.length; i++){
    if(tower[0][i].getNameEmployeer().equals(nombreEmpleado)){
      msj += "El empleado es:" + tower[0][i].getExtension();
}
}

for(int k = 1; k < tower.length;k++){
      if(tower[k][tower.length-k].getNameEmployeer().equals(nombreEmpleado)){
          msj += "El empleado es:" + tower[k][tower.length-k].getExtension();
}

}

for(int j= 1; j < tower.length; j++){
  if(tower[tower.length-1][j].getNameEmployeer().equals(nombreEmpleado)){
    msj += "El empleado es:" + tower[tower.length][j].getExtension();
  }
}
return msj;
}

/** Description: Este metodo hace el recorrido en X de la matriz
*@param nombreEmpleado String el nombre del empleado
*@return String el nombre del empleado
*/
public String espiralXfila(String nombreEmpleado){
String msj ="";

//Diagonal principal
 for(int i = 0; i < tower.length;i++){
	 if(tower[i][i].getNameEmployeer().equals(nombreEmpleado)){
		 msj += "El empleado es:" + tower[i][i].getExtension();
	 }
 }

//Diagonal Inversa
  for(int k = 0; k < tower.length;k++){
	if((tower.length % 2 == 0) || (tower.length % 2 != 0 && k != tower.length/2)){
		if(tower[k][tower.length-1-k].getNameEmployeer().equals(nombreEmpleado)){
			msj += "El empleado es:" + tower[k][tower.length-1-k].getExtension();
		}
	}
  }

return msj;
}

/** Description: Este metodo hace el recorrido en E de la matriz
*@param nombreEmpleado String el nombre del empleado
*@return String el nombre del empleado
*/
public String espiralE(String nombreEmpleado){
String msj = "";
int m = 0;

for(int i = 0; i < tower.length;i+= 2){
	for(int j = 0; j < tower.length;j++){
		if(m % 2 == 0){
			if(tower[i][j].getNameEmployeer().equals(nombreEmpleado)){
			msj += "El empleado es:" + tower[i][j].getExtension();
			 }
			}else if(m % 2 != 0){
						if(tower[i][tower.length-j-1].getNameEmployeer().equals(nombreEmpleado)){
						msj += "El empleado es:" + tower[i][tower.length-j-1].getExtension();
				}
			}
		}
		if(m % 2 == 0 && i < tower.length-1){
			if(tower[i+1][tower.length-1].getNameEmployeer().equals(nombreEmpleado)){
				msj += "El empleado es:" + tower[i+1][tower.length-1].getExtension();
			}
		}else{
			if(tower[i+1][0].getNameEmployeer().equals(nombreEmpleado)){
				msj += "El empleado es:" + tower[i+1][0].getExtension();
			}
		}
		m++;
	}
		return msj;
}

/** Description: Este metodo hace el recorrido en O de la matriz
*@param nombreEmpleado String el nombre del empleado
*@return String el nombre del empleado
*/
public String espiralO(String nombreEmpleado){
String msj = "";

for(int i = 0; i < tower.length;i++){
  if(tower[0][i].getNameEmployeer().equals(nombreEmpleado)){
    msj += "El empleado es:" + tower[0][i].getExtension();
  }
}

for(int k = 0; k > tower[0].length; k++){
  if(tower[tower.length-1][k].getNameEmployeer().equals(nombreEmpleado)){
    msj += "El empleado es:" + tower[tower.length][k].getExtension();
  }
}

for(int o = 0; o < tower.length;o++){
 if(tower[o][0].getNameEmployeer().equals(nombreEmpleado)){
   msj += "El empleado es:" +tower[o][0].getExtension();
 }else if(tower[o][tower.length].getNameEmployeer().equals(nombreEmpleado)){
   msj += "El empleado es:" +tower[o][tower.length].getExtension();
 }
}
return msj;

}

/** Description: Este metodo hace el recorrido en espiral de la matriz
*@param cargo String el nombre del empleado
*@return String el cargo del empleado
*/
public String espiral(String cargo){

	String msj = "";
	int fila1 = 0;
	int fila2 = tower.length-1;
	int col1 = 0;
	int col2 = tower.length-1;

	while(fila1 < fila2 && col1 < col2){

		for(int i = fila1; i < fila2;i++){
			if(tower[i][col1].getPosition().equals(cargo)){
				msj += "El empleado:" + tower[i][col1].getEmail();
			}
		}

		col1++;
		for(int i = col1; i < col2;i++){
			if(tower[fila2][i].getPosition().equals(cargo)){
				msj += "El empleado:" + tower[fila2][i].getEmail();
			}
		}
		fila2--;

		for(int i = fila2; i >= fila1 ;i--){
			if(tower[i][col2].getPosition().equals(cargo)){
				msj += "El empleado:" + tower[i][col2].getEmail();
			}
		}
		col2--;

		for(int i = col2; i >= col1;i--){
			if(tower[fila1][i].getPosition().equals(cargo)){
				msj += "El empleado:" + tower[fila1][i].getEmail();
			}
		}
		fila1++;

	}
 return msj;
}

}
