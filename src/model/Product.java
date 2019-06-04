package model;
import java.util.ArrayList;

public class Product{

private String nameProduct;
private int waterAmount;
private long identify;
private int numberUnities;


public Product(String nameProduct,int waterAmount, long identify, int numberUnities){
  this.nameProduct = nameProduct;
  this.waterAmount = waterAmount;
  this.identify = identify;
  this.numberUnities = numberUnities;
}

public String getNameProduct(){
  return nameProduct;
}

public void setNameProduct(String nameProduct){
  this.nameProduct = nameProduct;
}

public int getWaterAmount(){
  return waterAmount;
}

public void setWaterAmount(int waterAmount){
  this.waterAmount = waterAmount;
}

public long getIdentify(){
  return identify;
}

public void setIdentify(long identify){
  this.identify = identify;
}

public int getNumberUnities(){
  return numberUnities;
}

public void setNumerUnities(){
  this.numberUnities = numberUnities;
}


public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre del producto es:"+ nameProduct;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La identificacion es:"+ identify;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero de unidades es:"+ numberUnities;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}



}
