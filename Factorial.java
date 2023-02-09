public class factorial{

    public static void main(String[] args){
        int number = 3;
        int output = mul(number);
        System.out.printf("Factorial of %d is %d", number, output);

    }
    private static int mul(int num){
        if (num >= 1)
            return num * mul(num-1);
        else
            return 1;
    }
}