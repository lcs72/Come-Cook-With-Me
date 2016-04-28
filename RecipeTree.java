/** Cynthia Chen and Laura Scanlon
  * 4/24/16
  * CS 230 Final Project 
  * RecipeTree Class **/

import java.util.Scanner;  // for reading from keyboard for testing
import javafoundations.LinkedBinaryTree; // for the LinkedBinaryTree and all
import javafoundations.ArrayQueue;
import java.util.Scanner;
import java.io.*;

public class RecipeTree {
  
  private LinkedBinaryTree<String> theTree;
  private LinkedBinaryTree<String> current;
  
  // sets up 'expert' database
  public RecipeTree(){
    String a1 = "Option 1: Baking     Option 2: Drink";
    String b1 = "Option 1: Sweet     Option 2: Savory";
    String b2 = "Option 1: Hot     Option 2: Cold";
    String c1 = "Option 1: Chocolate Chip Cookies     Option 2: Apple Pie";
    String c2 = "Option 1: Banana Bread     Option 2: Bacon Wrapped Shrimp";
    String c3 = "Option 1: Hot Chocolate     Option 2: Chai Tea";
    String c4 = "Option 1: Berry Blast Smoothie     Option 2: Chocolate Milkshake";
    String d1 = "Chocolate Chip Cookie";
    String d2 = "Apple Pie";
    String d3 = "Banana Bread";
    String d4 = "Bacon Wrapped Shrimp";
    String d5= "Hot Chocolate";
    String d6 = "Chai Tea";
    String d7 = "Berry Blash Smoothie";
    String d8 = "Chocolate Milkshake";
    
    //create the LinkedBinaryTree
    LinkedBinaryTree<String> recipe1 = new LinkedBinaryTree<String>(d1);
    LinkedBinaryTree<String> recipe2 = new LinkedBinaryTree<String>(d2);
    LinkedBinaryTree<String> recipe3 = new LinkedBinaryTree<String>(d3);    
    LinkedBinaryTree<String> recipe4 = new LinkedBinaryTree<String>(d4);
    LinkedBinaryTree<String> recipe5 = new LinkedBinaryTree<String>(d5);
    LinkedBinaryTree<String> recipe6 = new LinkedBinaryTree<String>(d6);
    LinkedBinaryTree<String> recipe7 = new LinkedBinaryTree<String>(d7);
    LinkedBinaryTree<String> recipe8 = new LinkedBinaryTree<String>(d8);
    
    LinkedBinaryTree<String> sweet = new LinkedBinaryTree<String>(c1, recipe1, recipe2);
    LinkedBinaryTree<String> savory = new LinkedBinaryTree<String>(c2, recipe3, recipe4);
    LinkedBinaryTree<String> hot = new LinkedBinaryTree<String>(c3, recipe5, recipe6);    
    LinkedBinaryTree<String> cold = new LinkedBinaryTree<String>(c4, recipe7, recipe8);
    
    LinkedBinaryTree<String> bake = new LinkedBinaryTree<String>(b1, sweet, savory);
    LinkedBinaryTree<String> drink= new LinkedBinaryTree<String>(b2, hot, cold);
    
    theTree = new LinkedBinaryTree<String>(a1, bake, drink);
    
    current = theTree;
  }
  
  
  //define any other methods
  
  public LinkedBinaryTree<String> getTree() {
    return theTree;
  }
  
  public LinkedBinaryTree<String> getCurrent() {
    return current;
  }
  
  public String toString() {
    return theTree.toString();
  }
  
  // decides which recipe to make according to tree
  // returns recipe if get to end of tree
  public Recipe answerQuestion(String dir) {
    if (dir.equals("left")) {
      current = current.getLeft();
      if (current.getRight().isEmpty()) {
        return createRecipe(current.getRootElement());
      }
    } 
    else {
      current = current.getRight();
      if (current.getRight().isEmpty()) {
        return createRecipe(current.getRootElement());
      }
    }
    return null;
  }
  
  public static Recipe createRecipe(String inFileName){
    
    String foodPic = null;
    ArrayQueue<Ingredient> rqueue = new ArrayQueue<Ingredient>();
    
    try {
      
      Scanner scan = new Scanner(new File(inFileName + ".txt"));
      
      while (scan.hasNext()) {
        String s = scan.next();
        if(s.equals("*")){
          foodPic = scan.next();
        }
        else{
<<<<<<< HEAD
          rqueue.enqueue(new Ingredient(s, scan.next(), scan.next()));
=======
          rqueue.enqueue(new Ingredient(s, "pictures/" + scan.next(), "pictures/" + scan.next()));
>>>>>>> Cynthia's-branch
        }
      }
      scan.close();
    }
    // catch exception such as file doesn't exist
    catch (IOException e) {
      System.out.println("error");
    }
    return new Recipe(rqueue, inFileName, foodPic);
  }
  
  //add a main()
  public static void main (String[] args) {
    RecipeTree rt = new RecipeTree();
    
    System.out.println(rt.getCurrent());
    System.out.println(rt.answerQuestion("left"));
    System.out.println(rt.getCurrent());
    System.out.println(rt.answerQuestion("left"));
    System.out.println(rt.getCurrent());
<<<<<<< HEAD
    System.out.println(rt.answerQuestion("left"));
=======
    System.out.println(rt.answerQuestion("right"));
>>>>>>> Cynthia's-branch
    System.out.println(rt.getCurrent());
  
    //System.out.println(createRecipe("Chocolate Chip Cookie"));
    
  }
  
}

