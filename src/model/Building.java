package model;

public class Building{

private Employeer[][] tower;


public Building(){
tower = new Employeer[7][20];
}

public String recorridoL(String nameEmpleado){
String msj = "";
int k = 0;
boolean abajoL = false;

for(int i = 0;  i < tower.length; i++){
    if(tower[i][k].getNameEmployeer().equals(nameEmpleado)){

      msj = "El empleado es" + tower[i][k].getNameEmployeer();
      }
    abajoL = true;
  }

  if(abajoL == true){
    for(int m = 0; m  < tower[0].length; m++){
      int large = tower.length-1;
      if(tower[large][k].getNameEmployeer().equals(nameEmpleado)){

            msj = "El empleado es" + tower[large][k].getNameEmployeer();
    }


  }

}

return msj;


}


public String recorridoZ(String nombreEmpleado){

String msj = "";

for(int i =0; i < tower.length; i++){
    if(tower[0][i].getNameEmployeer().equals(nombreEmpleado)){
      msj = "El empleado es" + tower[0][i].getNameEmployeer();
}
}

for(int k = 1; k < tower[0].length;k++){
      if(tower[k][tower[0].length-k].getNameEmployeer().equals(nombreEmpleado)){
          msj = "El empleado es" + tower[k][tower[0].length-k].getNameEmployeer();
}

}

for(int j= tower[0].length -1; j >0 ; j--){
  if(tower[tower.length][j].getNameEmployeer().equals(nombreEmpleado)){
    msj = "El empleado es:" + tower[tower.length][j].getNameEmployeer();
  }
}
return msj;
}

public String espiralXfila(String nombreEmpleado){
String msj ="";
int b = tower[0].length-1;
//Diagonal principal
for(int i = 0; i < tower.length;i++,b--){
  for(int k = 0; k < tower[0].length;k++){
    if(i == k){
      if(tower[i][k].getNameEmployeer().equals(nombreEmpleado)){
      msj += "El empleado es:" + tower[i][k].getNameEmployeer();
    }else if(tower[i][b].getNameEmployeer().equals(nombreEmpleado)){
      msj += "El empleado es:" + tower[i][b].getNameEmployeer();
    }
    }
  }

}


return msj;
}

public String espiral(String cargo){

	String msj = "";
	boolean abajoDerecha = false;
	boolean ultimaArriba = false;
	boolean arribaIzquierda = false;
	int sumador = 0;
	int restador = 0;

	for(int i = 0; i < tower.length;i++){
		//Abajo
		for(int k = 0; i < tower[0].length-sumador; k++){
		if(tower[k][i].getPosition().equals(cargo)){
		    msj += tower[k][i].getEmail();
		}
		abajoDerecha = true;
	}
	//Abajo derecha
	if(abajoDerecha == true){
		for(int j = 1; j < tower[0].length-sumador; j++){
			if(tower[tower.length][j].getPosition().equals(cargo)){
			msj += tower[tower.length][j].getEmail();
			}
		ultimaArriba = true;
		}
	}

	if(ultimaArriba == true){
		for(int k = tower.length; k > sumador;k--){

			if(tower[k][tower.length].getPosition().equals(cargo)){
			msj += tower[k][tower.length].getEmail();
			}
			arribaIzquierda = true;
		}
	}

	if(arribaIzquierda == true){
		for(int m = tower.length-sumador; m > restador ; m--){
			if(tower[restador][m].getPosition().equals(cargo)){
			msj += tower[restador][m].getEmail();
			}
		}
	}

  abajoDerecha = false;
	ultimaArriba = false;
	arribaIzquierda = false;
	sumador++;
	restador++;



	}


	return msj;


}









}
