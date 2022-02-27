import java.util.Scanner;
public class multiplecatchblock {
    public static void main(String[] args) {
        /*int a=30;
        int b=0;
        int n=3;*/
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array\n");
        int n=sc.nextInt();


        int arr[]=new int[n];
        System.out.println("enter the elements\n");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the out of bound number\n");
        int b=sc.nextInt();


        
        
        
        

        
        try {
            
            
            System.out.println(arr[b]);
        } 
        catch (ArithmeticException e) {
            
            //TODO: handle exception
            System.out.println("arithmetic exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index of bound exception occur");

        }
    }
    
}








 

