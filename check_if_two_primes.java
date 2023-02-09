public class Main {

  public static void main(String[] args) {

    int number = 34;
    boolean flag = true;
    for(int i=2; i<= number/2 ; i++){
        if(isPrime(i)){
            if(isPrime(number-i)){
                System.out.printf("%d = %d + %d\n", number, i, number - i);
            }
        }
    }


   

  // Function to check prime number
  }
  private static boolean isPrime(int number){

    boolean flag = true;
    for(int i = 2; i< number /2 ; i++){
        if(number % i == 0){
            flag = false;
        }
    }

    return flag;


  }

}