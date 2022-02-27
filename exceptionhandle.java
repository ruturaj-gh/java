import java.util.Scanner;

public class exceptionhandle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        
        if(num2==0){
            try {
                int div=num1/num2;
                System.out.println(div);
                
                
            } catch (ArithmeticException e) {
                System.out.println("arithmetic exception occur");
            }
            
            
        }
        else{
            int div=num1/num2;
            System.out.println(div);

        }
    
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.err.println("enter the element's index you want to print");
        int n=sc.nextInt();
        if(n>arr.length-1){
            try {
                System.out.println(arr[n]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("array index of out bound exception occured");
            }

        }

        


        


        
    }
    
}
