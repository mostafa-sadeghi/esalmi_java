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
public class StudentReportCard extends Report{
    
/*
 * 
 * A Student Report Card is a Report. An student report card keeps track of the student name and
 * a list of courses the student completed as well as the grade in each course
 */
//-----------Start below here. To do: approximate lines of code = 1
// make class StundetReportCard a subclass of Report

//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

	private String name;
	private ArrayList<String> courses;
	private ArrayList<Integer> grades;

	public StudentReportCard(String title, String author, String date, String name)
	{
		super(title,author,date);
		this.name = name;
		courses = new ArrayList<String>();
		grades = new ArrayList<Integer>();
	}

	//Overrides the print() method in class Document
	public void print()
	{
		//-----------Start below here. To do: approximate lines of code = 4
		// Set the first section string in the inherited array list sections to the string:
		// "Student Name: " followed by the student name followed by "\n"
		// Then set each subsequent string in the sections arraylist to the course name (from courses array list) followed by
		// " " followed by the grade for that course (from grades array list)
		// Then finally print the expense report by properly calling the print() method in the superclass Report
		
		String output = "";
                output += this.name+ "\n";
                for (int i = 0; i < courses.size(); i++) {
                   output += courses.get(i) + " " + grades.get(i) + "\n";
                
            }
		
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
	
	//-----------Start below here. To do: approximate lines of code = 3
	// Create a method void addCourse(String courseName, int grade) that adds the course name to the array list of 
	// courses and adds the grade to the array list of grades
	
	
	
	
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}

