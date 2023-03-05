/*
 * Smooth an array of double numbers by replacing each number in the array with average of itself and its two neighbors
 * Example: array[1 5 6 2 9 3 7] then array[1] = (array[0] + array[1] + array[2])/3.0
 *                                    array[2] = (array[1] + array[2] + array[3])/3.0
 *                                    
 * There are two special cases at the first element (0th) and the last element (array[length-1]):
 * array[0] = (array[0] + array[1])/2.0 
 * In the example, length = 7 and array[6] = (array[5] + array[6])/2.0
 */

public class QA3
{
   /**
      Smoothes out an array by averaging values with its neighbors.
      @param values an array
      
   */
   public static void smooth(double[] values)
   {
  	 //-----------Start below here. To do: approximate lines of code = 7
  	 // Hint: do the special case separately. Do the other cases in a for loop. Create
  	 // a double variable called previous that is set equal to values[i] before overwriting values[i] with the average 
  	//if length of array is less than 2 then return from function
        if(values.length < 2)
            return;
        //declare previous and initalize it with value at first index
        double previous = values[0];
        
        //perform the operations
        //special case
        values[0] = (values[0] + values[1])/2.0;
        
        //other cases
        for(int i = 1; i < values.length-1; i++)
        {
            double v = (previous+values[i]+values[i+1])/3.0;
            previous = values[i]; // save before overwriting
            values[i] = v; 
        }
        
        //special case
        values[values.length-1] = (previous + values[values.length-1])/2.0; 
  	 
  	 
  	 
  	 
  	 
  	 
  			
  	 
  	 
  	 
  	 
  	 //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }
   
   /**
      Prints an array.
      @param a an array
   */
   public static void print(double[] a)
   {
      for (int i = 0; i < a.length; i++)
      {
         System.out.printf("%2.2f ",a[i]);
      }
      System.out.println();
   }
   
   public static void main(String[] args)
   {
      double[] a = {2, 5, 1, 13, 6, 8, 2, 4, 6, 8, 9};
     
      print(a);
      smooth(a);
      print(a);
      System.out.println("Expected:\n3.50 2.67 6.33 6.67 9.00 5.33 4.67 4.00 6.00 7.67 8.50");
      
      double[] b = {2, 5, 1};
      System.out.println();
      print(b);
      smooth(b);
      print(b);
      System.out.println("Expected:\n3.50 2.67 3.00");
      
      double[] c = {5};
      System.out.println();
      print(c);
      smooth(c);
      print(c);
      System.out.println("Expected:\n5.00");
   }
}