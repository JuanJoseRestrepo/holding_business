package model;
import java.util.ArrayList;

public class Product{

private String nameProduct;
private long identify;
private double waterAmount;
private int numberUnities;


public Product(String nameProduct, long identify, double waterAmount, int numberUnities){
  this.nameProduct = nameProduct;
  this.identify = identify;
  this.waterAmount = waterAmount;
  this.numberUnities = numberUnities;
}

public String getNameProduct(){
  return nameProduct;
}

public void setNameProduct(String nameProduct){
  this.nameProduct = nameProduct;
}

public long getIdentify(){
  return identify;
}

public void setIdentify(long identify){
  this.identify = identify;
}

public double getWaterAmount(){
  return waterAmount;
}

public void setWaterAmount(double waterAmount){
  this.waterAmount = waterAmount;
}

public int getNumberUnities(){
  return numberUnities;
}

public void setNumerUnities(){
  this.numberUnities = numberUnities;
}

}
