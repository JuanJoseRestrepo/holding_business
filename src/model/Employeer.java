package model;

public class Employeer{

private String nameEmployeer;
private String extension;
private String position;
private String email;

public Employeer(String nameEmployeer,String extension,String position, String email){

this.nameEmployeer = nameEmployeer;
this.extension = extension;
this.position = position;
this.email = email;

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
}
