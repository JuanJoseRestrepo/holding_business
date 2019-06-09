package model;
import java.util.ArrayList;

public class Product{

private String nameProduct;
private int waterAmount;
private long identify;
private int numberUnities;

/**Description: El constructor inicializa las variables
*@param nameProduct String nombre del producto
*@param waterAmount int la cantidad de agua
*@param identify long la identificacion
*@param numberUnities int la cantidad de unidades
*/
public Product(String nameProduct,int waterAmount, long identify, int numberUnities){
  this.nameProduct = nameProduct;
  this.waterAmount = waterAmount;
  this.identify = identify;
  this.numberUnities = numberUnities;
}

/** Description:Este metodo obtiene el nombre del producto
*@return String el nombre del producto
*/
public String getNameProduct(){
  return nameProduct;
}

/**Description: este metodo modifica el nombre del producto
@param nameProduct String el nombre del producto
*/
public void setNameProduct(String nameProduct){
  this.nameProduct = nameProduct;
}

/** Description:Este metodo obtiene la cantidad de agua
*@return String la cantidad de agua
*/
public int getWaterAmount(){
  return waterAmount;
}

/**Description: este metodo modifica la cantidad de agua
@param waterAmount int la cantidad de agua
*/
public void setWaterAmount(int waterAmount){
  this.waterAmount = waterAmount;
}

/** Description:Este metodo obtiene la identificaicon
*@return long la identificaicon
*/
public long getIdentify(){
  return identify;
}

/**Description: este metodo modifica la identificaicon
@param identify long la identificaicon
*/
public void setIdentify(long identify){
  this.identify = identify;
}

/** Description:Este metodo obtiene el numero de unidades
*@return int la informacion de la companhia de comida
*/
public int getNumberUnities(){
  return numberUnities;
}

/**Description: este metodo modifica el numero de unidades
@param numberUnities int la expiracion
*/
public void setNumerUnities(int numberUnities){
  this.numberUnities = numberUnities;
}

/** Description:Este metodo obtiene la informacion de los productos
*@return String la informacion de los productos
*/
public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El nombre del producto es:"+ nameProduct + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "La identificacion es:"+ identify + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El numero de unidades es:"+ numberUnities + "\n";
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";

return msj;


}



}
