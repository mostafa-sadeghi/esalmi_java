/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
import java.util.Arrays ;
import java.util.Random ;
/**
   The method you write looks at an integer array and finds the number 
   of elements which are evenly divisible by a given constant.  For example,
   if the given constant is 5 and the array contains 5, 3, 10, 15, it has three numbers that are evenly
   divisible by 5, since 5 goes evenly into 5 and 10 and 15.
 */
public class QA4
{
	public static void main(String[] args)
	{
		int[] a = {2, 4, 6, 8, 8, 6, 4, 2} ;
		System.out.println("Divisor: 3 " + Arrays.toString(a)) ;
		int number = numberDivisible(a, 3) ;
		System.out.printf("Count: %d\n", number) ;
		System.out.println("Expected:\nCount: 2") ;
		System.out.println() ;
		a = randomArray(10, 10000) ;
		System.out.println("Divisor: 6 " +Arrays.toString(a)) ;
		number = numberDivisible(a, 6) ;
		System.out.printf("Count: %d\n", number) ;
		System.out.println("Expected:\nCount: 4") ;
		System.out.println() ;
		a = randomArray(10, 10000) ;
		number = numberDivisible(a, 0) ;
		System.out.println("Divisor: 0 " +Arrays.toString(a)) ;
		System.out.printf("Count: %d\n", number) ;
		System.out.println("Expected:\nCount: -1") ;
		System.out.println() ;
		a = randomArray(10, 10000) ;
		number = numberDivisible(a, -10) ;
		System.out.println("Divisor: -10 " +Arrays.toString(a)) ;
		System.out.printf("Count: %d\n", number) ;
		System.out.println("Expected:\nCount: -1") ;
		System.out.println() ;
		a = randomArray(10, 6) ;
		number = numberDivisible(a, 4) ;
		System.out.println("Divisor: 4 " +Arrays.toString(a)) ;
		System.out.printf("Count: %d\n", number) ;
		System.out.println("Expected:\nCount: 5") ;
	}
	/**
       This method looks at an integer array and finds the
       number of elements which are divisible evenly by a given divisor.
       @param a the array to search
       @param divisor the value to divide by
       @return the number of the array elements that are divisible by
         divisor, provided divisor is greater than zero, 
         otherwise, return -1
	 */
	public static int numberDivisible(int[] a, int divisor)
	{
		//-----------Start below here. To do: approximate lines of code = 7
		// fill in this method
		int count = 0;
                if (divisor <= 0)
                    return -1;
                for (int i = 0; i < a.length; i++) {
                if(a[i] % divisor == 0){
                    count++;
                }
                    
            }
	return count;	
		
		
		
		
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
	/**
       Make a random array of a given size with values up to a given value.
       @param size the size of the array
       @param limit a value such that the array elements are from 0 to limit - 1
       @return an array holding size values from 0 to limit - 1.
	 */
	public static int[] randomArray(int size, int limit)
	{
		Random random = new Random(1) ;
		int[] result = new int[size] ;
		for (int i = 0 ; i < size ; i++) {
			result[i] = random.nextInt(limit) ;
		}
		return result ;
	}
}
