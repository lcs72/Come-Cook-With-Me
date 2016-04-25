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
  public Ingredient(String name, String foodPic, String failPic){
    this.name = name;
    this.xCoor = 0;
    this.yCoor = 0;
    
    //creates the images from a file name
    this.foodPic = createImageIcon(foodPic, foodPic).getImage();
    this.failPic = createImageIcon(failPic, failPic).getImage();
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
  
  public String toString() {
    return name;
  }
  
  private static ImageIcon createImageIcon(String path, String description) {
    java.net.URL imgURL = Ingredient.class.getResource(path);
    if (imgURL != null) {
      return new ImageIcon(imgURL, description);
    } else {
      System.err.println("Couldn't find file: " + path);
      return null;
    }
  }
  
}