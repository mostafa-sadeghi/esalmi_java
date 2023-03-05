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
public class Craps {
    private Random randomNumbers = new Random();

    private int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
        return sum;
    }
    private enum Status{CONTINUE, WON, LOST};
    private final static int Two = 2;
    private final static int three = 3;
    private final static int seven = 7;
    private final static int eleven = 11;
    private final static int twoelve = 12;
    
    public void play(){
        int myPoint = 0;
        Status gameStatus;
        int sumofDice = rollDice();
        switch(sumofDice){
            case seven:
            case eleven:
                gameStatus = Status.WON;
                break;
            case Two:
            case three:
            case twoelve:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumofDice;
                System.out.printf("Point is %d\n", myPoint);
                
        }
        while(gameStatus == Status.CONTINUE){
            sumofDice = rollDice();
            if(sumofDice == myPoint){
                gameStatus = Status.WON;
            }
            else{
                if(sumofDice == seven){
                    gameStatus = Status.LOST;
                }
            }
        }
        
        
        if(gameStatus == Status.WON){
            System.out.println("Player wins!");
        }
        else{
          System.out.println("Player loses!");  
        }
    }

}
