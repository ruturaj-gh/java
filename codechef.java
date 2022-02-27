/* package codechef; // don't place package name! */

import java.util.*;

import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a; i++){
            System.out.println("enter the size of the array ");
            int size=sc.nextInt();
            int[] arr=new int[size];
            for(int j=0;j<size;j++){
                arr[j]=sc.nextInt();

            }
            System.out.println(fun(arr)); 




        }
		
	}
    static int fun(int arr[]){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]%2==0 && arr[j]%2==1){
                    cnt++;
                }
                else if(arr[i]%2==0 && arr[j]%2==0){
                    cnt=cnt+3;
                }
                else if(arr[i]%2==1 && arr[j]%2==0){
                    cnt=cnt+2;
                }
                
                
            }

        }
        return cnt;
    }
}
