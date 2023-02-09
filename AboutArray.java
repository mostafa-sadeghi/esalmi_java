import java.util.*;
class AboutArray{
    public static void main(String[] args)throws Exception{
        // double[] x= {1.2,2.3,5.6} ;
        // x[1] = 12.5;
        // for(int i = 0; i<x.length; i++){

        // System.out.println(x[i]);
        // }
        // System.out.println(x);
        // double[] y = x;
        // System.out.println(x);
        // System.out.println(y);
        // x[1] = 12.5;
        // System.out.println(y[1]);

        final int LENGTH = 3;
        double[] x = new double[LENGTH];
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextDouble()){
            if(counter<LENGTH){
                double temp = scanner.nextDouble();
                x[counter++] = temp;
            }
            else{
                break;
            }
        }

        for(int i =0 ; i< x.length; i++){
            System.out.println(x[i]);
        }



    }
}