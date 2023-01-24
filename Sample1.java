import java.util.Scanner;
class Sample1{
    public static void main(String[] args){
        String sentence = "the quick brown fox jumps over the lazy dog";
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        int aCount, eCount,iCount,oCount,uCount ;
        aCount= eCount=iCount=oCount=uCount=0 ;
        // for(int j = 0 ; j < sentence.length(); j++){
        //     if(sentence.charAt(j) == a){aCount++;}
        //     else if(sentence.charAt(j) == e){eCount++;}
        //     else if(sentence.charAt(j) == i){iCount++;}
        //     else if(sentence.charAt(j) == o){oCount++;}
        //     else if(sentence.charAt(j) == u){uCount++;}
        // }
        // System.out.printf("a = "+aCount+"\n");
        // System.out.printf("e = "+eCount+"\n");
        // System.out.printf("i = "+iCount+"\n");
        // System.out.printf("o = "+oCount+"\n");
        // System.out.printf("u = "+uCount+"\n");

        // aCount = (int)sentence.chars().filter(ch -> ch == 'a').count();
        // eCount = (int)sentence.chars().filter(ch -> ch == 'e').count();
        // iCount = (int)sentence.chars().filter(ch -> ch == 'i').count();
        // oCount = (int)sentence.chars().filter(ch -> ch == 'o').count();
        // uCount = (int)sentence.chars().filter(ch -> ch == 'u').count();
        // System.out.printf("a = "+aCount+"\n");
        // System.out.printf("e = "+eCount+"\n");
        // System.out.printf("i = "+iCount+"\n");
        // System.out.printf("o = "+oCount+"\n");
        // System.out.printf("u = "+uCount+"\n");

        String values = "32.5 217.3 12.98 63.44 77.4 185.2";
		Scanner in = new Scanner(values);
        double max = -1.0;
        while(in.hasNext()){
            double temp =Double.parseDouble(in.next());
            if(temp > max){
                    max = temp;
            }

        }
        System.out.println(max);

    }
}