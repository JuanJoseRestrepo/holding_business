package model;

public class Building{

private Employeer[][] tower;
private int numberBuilding;


public Building(int numberBuilding){
this.numberBuilding = numberBuilding;
tower = new Employeer[numberBuilding][20];
}

public String recorridoL(String nameEmpleado){
String msj = "";
int k = 0;
boolean abajoL = false;

for(int i = 0;  i < tower.length; i++){
    if(tower[i][k].getNameEmployeer().equals(nameEmpleado)){

      msj = "El empleado es" + tower[i][k].getExtension();
      }
    abajoL = true;
  }

  if(abajoL == true){
    for(int m = 0; m  < tower.length; m++){
      if(tower[k][m].getNameEmployeer().equals(nameEmpleado)){

            msj = "El empleado es" + tower[k][m].getExtension();
    }


  }

}

return msj;


}


public String recorridoZ(String nombreEmpleado){

String msj = "";

for(int i =0; i < tower[0].length; i++){
    if(tower[0][i].getNameEmployeer().equals(nombreEmpleado)){
      msj = "El empleado es" + tower[0][i].getExtension();
}
}

for(int k = 1; k < tower.length;k++){
      if(tower[k][tower.length-k].getNameEmployeer().equals(nombreEmpleado)){
          msj = "El empleado es" + tower[k][tower.length-k].getExtension();
}

}

for(int j= 1; j < tower.length; j++){
  if(tower[tower.length][j].getNameEmployeer().equals(nombreEmpleado)){
    msj = "El empleado es:" + tower[tower.length][j].getExtension();
  }
}
return msj;
}


public String espiralXfila(String nombreEmpleado){
String msj ="";

//Diagonal principal
 for(int i = 0; i < tower.length;i++){
	 if(tower[k][tower.length-1-k].getNameEmployeer().equals(nombreEmpleado)){
		 msj += "El empleado es:" + tower[i][i].getExtension();
	 } 
 }

//Diagonal Inversa
  for(int k = 0; k < tower.length;k++){
	if((tower.length % 2 == 0) || (tower.length % 2 != 0 && k != tower)){
		if(tower[k][tower.length-1-k].getNameEmployeer().equals(nombreEmpleado)){
			msj += "El empleado es:" + tower[k][tower.length-1-k].getExtension();
		}
	}
  }

return msj;
}

public String espiralE(String nombreEmpleado){
String msj = "";
int m = 0;

for(int i = 0; i < tower.length;i+= 2){
	for(int j = 0; j < tower.length;j++){
		if(i % 2 == 0){
			if(tower[i][j].getNameEmployeer().equals(nombreEmpleado)){
			msj += "El empleado es:" + tower[i][j].getExtension();
			}
				}else if(i % 2 != 0){
						if(tower[i][k].getNameEmployeer().equals(nombreEmpleado)){
						msj += "El empleado es:" + tower[i][k].getExtension();
				}
			}

		}
		if(m % 2 == 0 && k < tower.length-1){
			if(tower[k+1][tower.length-1].getNameEmployeer().equals(nombreEmpleado)){
				msj += "El empleado es:" + tower[k+1][tower.length-1].getExtension();
			}
		}else{
			if(tower[k+1][0].getNameEmployeer().equals(nombreEmpleadoeEmpleado)){
				msj += "El empleado es:" + tower[k+1][0].getExtension();
			}
		}
	}
		return msj;
}

public String espiralO(String nombreEmpleado){
String msj = "";

for(int i = 0; i < tower.length;i++){
  if(tower[0][i].getNameEmployeer().equals(nombreEmpleado)){
    msj += "El empleado es:" + tower[0][i].getExtension();
  }
}

for(int k = tower[0].length-1; k > 0; k--){
  if(tower[tower.length][k].getNameEmployeer().equals(nombreEmpleado)){
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

public String espiral(String cargo){

	String msj = "";
	int fila1 = 0;
	int fila2 = tower.length-1;
	int col1 = 0;
	int col2 = tower.length-1;

	while(fila1 < fila2 && col1 < col2){
		
		for(int i = fila1; i < fila2;i++){
			if(tower[i][col1].get){
				
			}
			
		}
		
	}










}
