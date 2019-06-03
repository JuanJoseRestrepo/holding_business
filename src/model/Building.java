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

for(int i = 0;  i < tower[0].length; i++){
    if(tower[k][i].getNameEmployeer().equals(nameEmpleado)){

      msj = "El empleado es" + tower[i][k].getNameEmployeer();
      }
    abajoL = true;
  }

  if(abajoL == true){
    for(int m = 0; m  < tower.length; m++){
      if(tower[tower.length-1-m][k].getNameEmployeer().equals(nameEmpleado)){

            msj = "El empleado es" + tower[tower.length-1-m][k].getNameEmployeer();
    }


  }

}

return msj;


}


public String recorridoZ(String nombreEmpleado){

String msj = "";

for(int i =0; i < tower.length; i++){
    if(tower[0][i].getNameEmployeer().equals(nameEmpleado)){
      msj = "El empleado es" + tower[0][i].getNameEmployeer();
}
}

for(int k = tower.length-1; k > 0;k--){
  for(int o = tower[0].length-1; o > 0; o--){
      if(tower[k][o].getNameEmployeer().equals(nameEmpleado)){
          msj = "El empleado es" + tower[0][i].getNameEmployeer();
  }

}

}

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
