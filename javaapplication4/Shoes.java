/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
// A class to model a pair of Shoes

// Note: there are no getter and setter methods in class Shoes. You do not need them to write the solution.

public class Shoes
{
	private int size;
	private String color;
	private String brand;
	
	public Shoes(String brand, int size, String color)
	{
		this.brand = brand;
		this.size = size;
		this.color = color;
	}
	//-----------Start below here. To do: approximate lines of code = 3
	// Write an equals method (i.e. override the equals method inherited from class Object)
	// that compares two Shoe objects based on brand and color. 
	public boolean equals(Shoes sh){
            if((this.color == sh.color) && (this.brand == sh.brand))
                return true;
            return false;
        }
	
	
	
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}