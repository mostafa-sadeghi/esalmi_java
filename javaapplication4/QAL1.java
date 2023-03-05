/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
import java.util.ArrayList;

public class QAL1
{
	public static void main(String[] args)
  {  
     ArrayList<Shoes> shoeList = new ArrayList<Shoes>();
     
     shoeList.add(new Shoes("Prada", 8, "Red"));      
     shoeList.add(new Shoes("AleanderMcQueen", 6, "Red"));    
     shoeList.add(new Shoes("AlexanderWang", 5, "Red"));    
     shoeList.add(new Shoes("ManoloBlahnik", 9, "Red"));    
     shoeList.add(new Shoes("Prada", 6, "Red"));    
     shoeList.add(new Shoes("ManoloBlahnik", 7, "Red"));    
     shoeList.add(new Shoes("Ganni", 7, "Black"));    
     shoeList.add(new Shoes("Armani", 6, "Red"));    
     shoeList.add(new Shoes("JimmyChoo", 5, "Red"));    
     
     // Check if shoeList contains Prada brand in color Red. If so, print all array list indices 
     // where it occurs. Hint: make use of the equals method in class Shoes and its constructor method
     // Note: there are no getter and setter methods in class Shoes. You do not need them to write the solution.
     //-----------Start below here. To do: approximate lines of code = 4
     //
      for (int i = 0; i < shoeList.size(); i++) {
          if(shoeList.get(i).equals(new Shoes("Prada", 8, "Red")))
              System.out.println(i);

          
      }
     
     
     
     
     
     
     
     //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
     System.out.println("Expected:\nIndex: 0\nIndex: 4");
  }
}