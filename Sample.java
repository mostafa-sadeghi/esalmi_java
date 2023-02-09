class Sample{
    public static void main(String[] args)throws Exception{
        int[] x = {1,2,3,4,5};
        for(int i = 0; i<x.length;i++){

        System.out.print(x[i]);
        }
        System.out.println();
        for(int i = x.length-1; i>=0;i--){

        System.out.print(x[i]);
        }
    }
}