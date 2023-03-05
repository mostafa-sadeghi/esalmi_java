/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author msa
 */
public class GradeBook {
    private String courseName;
    private int total;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;
    
    
    public GradeBook(String name){
        courseName = name;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String name){
        courseName = name;
    }
    
    public void displayMessage(){
        System.out.printf("Welcome to the grade book for\n%s\n\n",getCourseName());
    }
    public void inputGrades(){
        Scanner input = new Scanner(System.in);
        int grade;
        System.out.printf("enter the integer grades in teh range 0-100");
        while(input.hasNext()){
            System.out.println("to exit enter -1");
            
            grade = input.nextInt();
            if (grade == -1){
                break;
            }
            total += grade;
            ++gradeCounter;
            incrementLetterGradeCounter(grade);
        }
    }

    public void incrementLetterGradeCounter(int grade) {
        switch(grade/10){
            case 9:
            case 10:
                ++aCount;
                break;
                
            case 8:
                ++bCount;
                break;    
            case 7:
                ++cCount;
                break;    
            case 6:
                ++dCount;
                break;
            default:
                ++fCount;
                break;
        }
    }
    
    
    public void displayGradeReport(){
        System.out.println("\nGrade Report:");
        if (gradeCounter !=0){
            double average = (double) total/gradeCounter;
            
            System.out.printf("average is: %.2f",average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n","Class Average:","A:",aCount,"B:",bCount,"C:",cCount,"D:",dCount,"F:",fCount);
        }
        else{
            System.out.println("No grades");
        }
    }
    
    
}
