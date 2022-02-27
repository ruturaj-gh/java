import java.util.Scanner;


public class simple_ques {
    static void fun(String hello,int i){
        if(i==-1){
            return;
            
        }
        System.out.print(hello.charAt(i));
        
        fun(hello, --i);
        
        
        
    

        
        


    }
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        String hello=sc.next();
        //char[] ch=new char[hello.length()];
        int i=hello.length();

        fun(hello,i-1);
        
        



        
    }
    
}
