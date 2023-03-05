/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
/**
 * For this problem you will write a method which, given a string, will return
 * true or false whether or not the String consists of all numbers and each digit of the number
 * is a valid digit for the given base
 * For example, if the base = 3 then a valid digit is either 0, 1, or 2
 *
 * Hint: The method Character.isDigit(Char c) will return true or false if
 * the character c is a digit. Look up class String method charAt()
 * Keep in mind that type char in Java is different than type String
 */
public class QB3 
{
	public static void main(String[] args) {
		System.out.println(isBase("0122122", 3));
		System.out.println("Expected:\ntrue");
		System.out.println(isBase("0132122", 3));
		System.out.println("Expected:\nfalse");
		System.out.println(isBase("0143122", 5));
		System.out.println("Expected:\ntrue");

	}

    
	/**
	 * The method isBase returns true or false whether
	 * the given input String contains all digits and each digit
	 * is a valid number for the given base
	 * For example, for base 3 each digit should be 0 or 1 or 2
	 *              for base 7 each digit should be 0, 1, 2, 3, 4, 5, 6
	 * Your method must use a loop!!             
	 * Hint: make use of Integer.parseInt()           
	 * @param number The input String for the method
	 * @param base The integer base
	 * @return true or false if the String contains all digits and each digit is valid for the given base 
	 */
	//-----------Start below here. To do: approximate lines of code = 7
	// Write the static method boolean isBase(String s, int base)
	
	private static boolean isBase(String string, int i) {
//            int base[] = new int[i];
//            for (int k = 0; k < i; k++) {
//                
//            }
            
        for (int j = 0; j < string.length(); j++) {
            Character ch = string.charAt(j);
            int temp = Integer.parseInt(ch.toString());
            
            if(! (Character.isDigit(ch)) || temp>=i){
               return false; 
            }
        }
        return true;
    }

	
	
	
	
	
	
	
	
	
	
	
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
