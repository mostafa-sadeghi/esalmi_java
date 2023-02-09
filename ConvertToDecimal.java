class Main{

    public static void main(String[] args){
        long number = 110110111;
        // String num_str = Long.toString(number);
        // char[] num_ch_arr = num_str.toCharArray();
        // int result = convertBinaryToDecimal(num_ch_arr);
        // System.out.printf("Decimal value of %d is %d",number, result);
        int result = convertBinaryToDecimal(number);
        System.out.printf("decimal number of %d is %d", number, result);

    }
    // private static int convertBinaryToDecimal(char[] num_ch){
    private static int convertBinaryToDecimal(long num){
        int result = 0;
        int j = 0;
        // for(int i = num_ch.length - 1; i>=0 ; i--){
        //     result += Character.getNumericValue(num_ch[i])*Math.pow(2,j);
        //     j++;
        // }
        while(num !=0){
            long remainder = num % 10;
            num /=10;
            result += remainder * Math.pow(2,j);
            j++;
        }

        return result;

    }
}