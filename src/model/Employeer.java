package model;

public class Employeer{

private String nameEmployeer;
private String extension;
private String position;
private String email;
private boolean disponibility;

/** Description: El constructor inicializa las variables
*@param nameEmployeer String el nombre del empleado
*@param extension String la extension del cubiculo
*@param position String el cargo del empleado
*@param email String el email del empleado
*@param disponibility boolean la disponibilidad del cuarto
*/
public Employeer(String nameEmployeer,String extension,String position, String email,boolean disponibility){

this.nameEmployeer = nameEmployeer;
this.extension = extension;
this.position = position;
this.email = email;
this.disponibility = disponibility;

}

/** Description: Este metodo obtiene el nombre del empleado
*@return String el nombre del empleado
*/
public String getNameEmployeer(){
  return nameEmployeer;
}

/** Description: este metodo estable el nombre del empleado
*@param nameEmployeer String el nombre del empleado
*/
public void setNameEmployeer(String nameEmployeer){
  this.nameEmployeer = nameEmployeer;
}

/**Description: Este metodo obtiene la extension
*@return String la extension
*/
public String getExtension(){
  return extension;
}

/** Description: Este metodo establece la extension
*@param extension String la extension del cubiculo
*/
public void setExtension(String extension){
  this.extension = extension;
}

/** Description: Este metodo obtiene la posicion
*@return String la poscion del empleado
*/
public String getPosition(){
  return position;
}

/** Description: Este metodo establece la posicion
*@param position String la poscion del empleado
*/
public void setPosition(String position){
  this.position = position;
}

/** Description: Este metodo obtiene el email
*@return String el email del empleado
*/
public String getEmail(){
  return email;
}

/** Description: Este metodo establece el email
*@param email String el email del empleado
*/
public void setEmail(String email){
  this.email = email;
}

/** Description: Este metodo obtiene la disponibilidad
*@return boolean la disponibilidad
*/
public boolean getDisponibility(){
  return disponibility;
}

/** Description: Este metodo establece la disponibilidad
*@param disponibility boolean la disponibilidad
*/
public void setDisponibility(boolean disponibility){
  this.disponibility = disponibility;
}

}
