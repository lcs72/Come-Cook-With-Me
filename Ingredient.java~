/*Ingredient Class
 * Represents an ingredient.
 * 
 * Cynthia and Laura Final Project
 * Written by Laura, 4/24/16
 */


import javax.swing.*;
import java.awt.*;


public class Ingredient{
  
  //instance variables
  private String name;
  private Image foodPic;
  private Image failPic;
  private int xCoor;
  private int yCoor;
 
  
  //Constructor sets the instance variables.
  public Ingredient(String name, String foodPic, String failPic, int xCoor, int yCoor){
    this.name = name;
    this.xCoor = xCoor;
    this.yCoor = yCoor;
    
    //creates the images from a file name
    this.foodPic = (new ImageIcon(foodPic)).getImage();
    this.failPic = (new ImageIcon(failPic)).getImage();
  }
  
  
  //Equals method
  //checks if the ingredients are the same ingredient
  //returns a boolean
  public boolean equals(Ingredient other){
   return this.name.equals(other.name); 
  }
  
  //getters and setter
  public String getName(){
   return name; 
  }
  
  public Image getPicture(){
   return foodPic; 
  }
  
  public Image getFailPicture(){
   return failPic; 
  }
  
  public int getX(){
   return xCoor; 
  }
  
  public int getY(){
   return yCoor; 
  }
  
  public void setX(int x){
   xCoor = x; 
  }
  
  public void setY(int y){
   yCoor = y; 
  }
  
}