import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file_handling {
    public static void main(String[] args) throws IOException {
        File f=new File("D:just_randomtxt.txt");
        if(f.exists()){
            System.out.println(f.getName());
            System.out.println();
            FileWriter fw=new FileWriter("D:just_randomtxt.txt");
            String s= "we are adding the text using java language";
            fw.append(s, 0,42);
        }

        


    }
    
}
