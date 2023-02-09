import java.io.FileOutputStream;
public class OutputStreamExample{
    public static void main(String[] args){
        try{
        FileOutputStream fs = new FileOutputStream("./1.txt");
        fs.write(12);
        fs.close();}
        catch(Exception e){System.out.println(e);}
    }
}