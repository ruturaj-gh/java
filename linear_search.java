/**
 * linear_search
 */
import java.util.Scanner;  
public class linear_search {

    public static void main(String[] args) {
        
        Scanner scnr =new Scanner(System.in);

        int num=scnr.nextInt();
        int[] arr=new int[num];
        for (int i=0;i<num;i++){
            arr[i]=scnr.nextInt();

            
        }
        for (int i=0;i<num;i++){
            System.out.println(arr[i]);

        }



        
    }
}