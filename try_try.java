import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class try_try {

    public static void main(String[] args) {
        try {
            File f=new File("D:/newfile.txt");
            System.out.println(f.canRead());
            
                
                FileWriter writer1=new FileWriter(f);
                writer1.write("hello there this text is directly coming from compiler");
                PrintWriter obj=new PrintWriter(new FileWriter(f,true));
                obj.append("*******");
                obj.write("hello world");
                obj.close();
                writer1.close();
                


                try (Scanner datareader = new Scanner(f)) {
                    while (datareader.hasNextLine()) {
                        String data=datareader.nextLine();
                        System.out.println(data);
                        
                    }
                    datareader.close();
            }
            
        } catch (Exception e) {
            
            System.out.println("unexpected error occured");
            e.printStackTrace();
        }
    }
}