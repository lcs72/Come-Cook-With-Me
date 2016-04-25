/** Cynthia Chen and Laura Scanlon
  * 4/24/16
  * CS 230 Final Project 
  * Recipe Class **/

import javafoundations.ArrayQueue;
import javax.swing.*;
import java.awt.*;

// Recipe class represents a recipe which include ingredients
public class Recipe {
  
  // instance variables
  private ArrayQueue<Ingredient> ingre;
  private String name;
  private Image pic;
  
  
  // constructor to create recipe
  public Recipe(ArrayQueue<Ingredient> ingre, String name, String foodPic) {
    this.ingre = ingre;
    this.name = name;
    this.pic = (new ImageIcon(foodPic)).getImage();
  }
  
  // getter method for ingredients queue
  public ArrayQueue getIngredients() {
    return ingre;
  }
  
  
  // getter method for next ingredient
  public Ingredient getNextIngredient() {
    return ingre.first();
  }
  
  
  // getter method for name of recipe
  public String getName() {
    return name;
  }
  
  
  // determines if all ingredients are collected
  public boolean ingredientsCollected() {
    return ingre.isEmpty();
  }
  
  
  // checks if ingredient is the same as the front of queue
  public boolean matchTopIngredient (Ingredient element) {
    return (element.equals(ingre.dequeue()));
  }
    
  
  // toString method to return recipe in string
  public String toString() {
    String s = ingre.toString();
    s.replace("<front of queue>", "<html>");
    s.replace("\n", "<br>");
    s.replace("<rear of queue>", "</html>");
    return s;
  }
  
  
  // main method for testing
  public static void main (String[] args) {
  }
}