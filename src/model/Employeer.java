package model;

public class Employeer{

private String nameEmployeer;
private String extension;
private String position;
private String email;
private boolean disponibility;

public Employeer(String nameEmployeer,String extension,String position, String email,boolean disponibility){

this.nameEmployeer = nameEmployeer;
this.extension = extension;
this.position = position;
this.email = email;
this.disponibility = disponibility;

}

public String getNameEmployeer(){
  return nameEmployeer;
}

public void setNameEmployeer(String nameEmployeer){
  this.nameEmployeer = nameEmployeer;
}

public String getExtension(){
  return extension;
}

public void setExtension(String extension){
  this.extension = extension;
}

public String getPosition(){
  return position;
}

public void setPosition(String position){
  this.position = position;
}

public String getEmail(){
  return email;
}

public void setEmail(String email){
  this.email = email;
}

public boolean getDisponibility(){
  return disponibility;
}

public void setDisponibility(boolean disponibility){
  this.disponibility = disponibility;
}

}
