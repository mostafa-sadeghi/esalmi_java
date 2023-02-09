public class AddNumber{

    public static void main(String[] args){
        int number = 10;
        int result = addNumbers(number);
        System.out.printf("sum of numbers lower than %d is %d",number,result );

    }

    private static int addNumbers(int number){
        if(number != 0){
            return number + addNumbers(number-1);
        }
        else{
            return number;
        }
    }
}