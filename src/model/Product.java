package model;
import java.util.ArrayList;

public class Product{

private String nameProduct;
private long identify;
private double waterAmount;
private int numberUnities;

private Invima invima;
private ArrayList<FoodCompany> registrationFood;

public Product(String nameProduct, long identify, double waterAmount, int numberUnities,Invima invima){
  this.nameProduct = nameProduct;
  this.identify = identify;
  this.waterAmount = waterAmount;
  this.numberUnities = numberUnities;
  this.invima = invima;
  registrationFood = new ArrayList<registrationFood>();
}




}
