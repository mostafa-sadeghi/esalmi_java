/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
import java.util.Scanner;	
/**
		   Computes the average number of words per sentence in a paragraph.  
		   To find the end of a sentence, check to see if the last character
		   of a word is equal to a '.' character. 
		   
		   Example: in the paragraph above there are 2 sentences (two words end with a '.')
		   The number of words in sentence 1 is: 11 and the number of words in sentence 2 is: 23
		   The average is (11+23)/2.0 
 */
public class QB1
{
	public static void main(String[] args) 
	{
		String sentences = "Legendary assassin John Wick retired from "
				+ "his violent career after marrying the love of his life. "
				+ "Her sudden death leaves John in deep mourning. "
				+ "A sadistic mobster and his thugs steal John's prized "
				+ "car and kill the puppy that was a last gift from his wife. "
				+ "John unleashes the remorseless killing machine within and seeks vengeance. "
				+ "Meanwhile, the mobster's father, John's former colleague, puts a huge bounty on John's head.";
		
		Scanner scanner = new Scanner(sentences);   
		
		//-----------Start below here. To do: approximate lines of code = 13
		// Use a while loop to read words from scanner. Increment a word count variable for this sentence.
		// If the current word has a '.' character as its last character (Hint: use charAt() of class String), 
		// increment the number of sentences, add the word count to a total, and reset the word count  to zero.
		// Repeat the loop until there are no more words.
                int total = 0;
                int sentence_number=0;
                int word_count = 0;
		while(scanner.hasNext()){
                    String word = scanner.next();
                    boolean status= true;
                    for (int i = 0; i < word.length(); i++) {
                        if(word.charAt(i)=='.'){
                            status = false;
                        }
                    }
                    if(status){
                        word_count++;
                    }
                    else{
                        word_count++;
                        sentence_number++;
                    }
                }
                System.out.println(sentence_number);
                System.out.println(word_count);
                System.out.println(word_count/sentence_number);
		
		// Print "Average number of words per sentence: " followed by the average word count.
				//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		System.out.println("Expected:\nAverage number of words per sentence: 14.0");
	}
}

