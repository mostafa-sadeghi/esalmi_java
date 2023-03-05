/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Random;

/**
 *
 * @author msa
 */
public class RollDie {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        
        int frequency6 = 0;

        int face;
        
        
        
        for (int i = 0; i <= 1000_000_000; i++) {
            face = 1 + randomNumbers.nextInt(6);
            switch(face){
                case 1:
                    ++frequency1;
                    break;
                case 2:     
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
                    
            }//end of switch case statement
        }// end of for loop
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);
        
    }//end of main method 
}
