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
 * Given an array of integers and given a number from 1-9, write a
   method occurrence() that returns the list of indices at which that
   number occurred in the ArrayList.
 * For example: occurrence([9 2 5 5 3 2 4 3 2 2 2 3 6 1 1 6 1 3], 2)
 * will return an ArrayList with the following values [1, 5, 8, 9, 10]
 * i.e. the given number is 2, and a 2 occurs at index 1, 5, 8, 9, 10 in the array
 */

import java.util.ArrayList;
import java.util.Random;

public class QA5 
{

	static Random r;

	public static void main(String[] args) {
		r = new Random(3);
		int numbers[] = fillInt();
		int example[] = {9, 2, 5, 5, 3, 2, 4, 3, 2, 2, 2, 3, 6, 1, 1, 6, 1, 3};

		int n = r.nextInt(9);
		ArrayList<Integer> indices = occurrence(example, 2);

		System.out.print("in array: [");
		for(int i = 0; i < example.length; i++){
			if(i == example.length - 1){
				System.out.println(example[i] + "]");
			}else{
				System.out.print(example[i] + ", ");
			}
		}
		System.out.println("\n2 occurs at index: " + indices);
		System.out.println("Expected:\n2 occurs at index: [1, 5, 8, 9, 10]");

		System.out.println();

		indices = occurrence(numbers, n);
		System.out.print("in array: [");
		for(int i = 0; i < numbers.length; i++){
			if(i == numbers.length - 1){
				System.out.println(numbers[i] + "]");
			}else{
				System.out.print(numbers[i] + ", ");
			}
		}
		System.out.println("\n" + n + " occurs at index: " + indices);
		System.out.println("Expected:\n1 occurs at index: [7, 10, 12, 14, 18, 21]");


	}

	/** Method that stores all the indices where n occurs in the numbers array
	 *  in an ArrayList and returns that ArrayList
	 * 
	 * @param numbers list of integers used to find indices
	 * @param n, number to search for in the array numbers
	 * @return an ArrayList containing all the indices at which n occurs
	 */
	public static ArrayList<Integer> occurrence(int numbers[], int n){
		//-----------Start below here. To do: approximate lines of code = 5
		//  return an ArrayList that has the indices at which n occurs in numbers
		//Hint: first create an ArrayList of Integer to hold the indices
		
		ArrayList<Integer> indices = new ArrayList<Integer>();
		          for (int i = 0; i < numbers.length; i++) {
                              if (numbers[i] == n) {
                                  indices.add(i);
                              }
                              
                            
                
            }
		
	  return indices;	
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	/** Method that returns a filled array of integers
	 *  from 1 to 9.
	 * 
	 * @return arrays of integers from 1 to 9
	 */
	public static int[] fillInt(){
		int numbers[] = new int[r.nextInt(10) + 20];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = r.nextInt(9);
		}
		return numbers;
	}

}
