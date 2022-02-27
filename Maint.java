import java.util.Scanner;
public class Maint{
    public static void main(String[] args){
        int temp;
        int[] arr= {34,21,89,56,8};
        for (int i=0;i<4;i++){
            for (int j=i+1;j<5;j++){
                if (arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }
            }
        }
        System.out.println("sorted array is--");

        for (int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        


        
        }
        


        // System.out.println("enter two numbers respectively-->");
        // Scanner scnr=new Scanner(System.in);
        // int n=scnr.nextInt();
        // int n2=scnr.nextInt();
        // int prdct=n*n2;
        // System.out.println("the product of these two numbers is--" + prdct);
    

    }
