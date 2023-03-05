/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
public class Course {
    private String name;
    private String teacherName;
    private int score;
    public Course(String name, String teacherName, int score){
        this.name = name;
        this.teacherName = teacherName;
        this.score = score;
    }
    
    public int getScore(){
        return this.score;
    }
}
