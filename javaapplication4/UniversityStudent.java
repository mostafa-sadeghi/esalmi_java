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

/**
   A student has a name, total quiz score and number of quizzes
 */
public class UniversityStudent
{  
	private String name ; // the name of the student
	private ArrayList<Course> courses = new ArrayList<Course>();

	/**
       Constructor method: initialize name with given name1,
	   set other instance variables to 0
       @param name1 the name of the student
	 */
	public UniversityStudent(String name1)
	{   
		name = name1 ;
	}

	/**
       Computes the average mark in all courses
       @return the average mark
	 */
	public double getAverageScore()
	{  
                double total = 0;
		//-----------Start below here. To do: approximate lines of code = 6
		// Complete this method
		          for (int i = 0; i < courses.size(); i++) {
                              total += courses.get(i).getScore();
                
            }
		
                          return total/courses.size();
		
		
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	/**
       Adds another course to the courses array list
       @param course - a reference to a Course object
	 */
	public void addCourse(Course course)
	{   
		//-----------Start below here. To do: approximate lines of code = 1
		// Complete this method
		courses.add(course);
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	/**
       Prints the student transcript
       print "Name: " followed by name followed by " Courses:" followed by information about each course
       on separate lines. See class Course

	 */
	public void printTranscript()
	{   
		//-----------Start below here. To do: approximate lines of code = 3
		// Complete this method
		
		
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
	/**
       Gets the name of the student
       @return the name
	 */
	public String getName() 
	{   
		return name ;
	}
}


