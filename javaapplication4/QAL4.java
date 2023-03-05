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

public class QAL4
{
	public static void main(String[] args)
  {  
     ArrayList<RyCourse> courses = new ArrayList<RyCourse>();
     
     courses.add(new RyCourse("Computer Science I", "CPS109"));      
     courses.add(new RyCourse("Computer Organization", "CPS213"));    
     courses.add(new RyCourse("Data Structires", "CPS305"));    
     courses.add(new RyCourse("Computer Science II", "CPS209"));    
     courses.add(new RyCourse("Computer Graphics", "CPS511"));    
     courses.add(new RyCourse("Virtual Reality", "CPS643"));    
     courses.add(new RyCourse("Software Security Fundamentals", "CPS471"));    
     
     
     // Check if courses contains Computer Science II CPS209. If so, print the array index  
     // where it occurs. Hint: make use of the equals method in class RyCourse and its constructor method
     // Note: there are no getter and setter methods in class RyCourse. You do not need them to write the solution.
     //-----------Start below here. To do: approximate lines of code = 4
     //
     
      for (int i = 0; i < courses.size(); i++) {
          if(courses.get(i).equals(new RyCourse("Computer Science II", "CPS209"))){
              System.out.println(i);
              break;
          }
      }
     
     
     
     
     
     
     
     //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
     System.out.println("Expected:\nIndex: 3");
  }
}
