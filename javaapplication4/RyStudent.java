/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
// A class to model a Ryerson Student

// Note: there are no getter and setter methods in class RyStudent. You do not need them to write the solution.
public class RyStudent
{
	private String firstName;
	private String lastName;
	private String id;
	
	public RyStudent(String firstName, String lastName, String id)
	{
		this.firstName = firstName;
		this.lastName  = lastName;
		this.id        = id;
	}
	
   //-----------Start below here. To do: approximate lines of code = 3
   // Write an equals method (i.e. override the equals method inherited from class Object)
	// that compares two RyStudent objects based on first name and last name and id 
   public boolean equals(RyStudent rs){
       if((this.firstName == rs.firstName )&& (this.lastName == rs.lastName) && (this.id == rs.id)){
           return true;
       }
       return false;
   }
   
   
   
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
