import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        // ArrayList<Integer> arrayList = new ArrayList<>();
        // arrayList.add(1);
        // arrayList.add(2);
        // arrayList.add(3);
        // arrayList.add(4);

        // for(Integer num: arrayList){
        //     System.out.println(num);
        // }

        // for(int i=0; i< arrayList.size(); i++){
        //     System.out.println(arrayList.get(i));
        // }

        // arrayList.forEach((n)->{System.out.println(n);});


        ArrayList<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("python");
        languages.add("c#");
        languages.add("c++");
        languages.add("c");

        languages.replaceAll((element)->element.toUpperCase());
        System.out.println(languages);
    }
}