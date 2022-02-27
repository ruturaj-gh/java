import java.lang.annotation.Target;
import java.util.ArrayList;

public class recursion_problems {

    static boolean function(int[] arr,int index){
        if (index==arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1]) && function(arr, index+1);
    }

    static boolean linearsearch(int[] arr,int target,int index){
        if (index==arr.length){
            return false;
        }
        return arr[index]==target || linearsearch(arr, target, index+1);    
        
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void findallindex(int[] arr,int target, int index){
        if(index==arr.length){
            return;

        }
        if(arr[index]==target){
            list.add(index);
        }
        findallindex(arr, target, index+1);
    }
    static ArrayList<Integer> list2 =new ArrayList<>();
    static ArrayList<Integer> findallindex2(int[] arr,int target, int index,ArrayList<Integer> list2){
        if(index==arr.length){
            return list2;

        }
        if(arr[index]==target){
            list2.add(index);
        }
        return findallindex2(arr, target, index+1,list2);
    }    
    static ArrayList<Integer> findallindex3(int[] arr,int target, int index){
        ArrayList<Integer> list3=new ArrayList<>();

        if(index==arr.length){
            return list3;

        }
        //this will contain the answer for that function call only
        if(arr[index]==target){
            list3.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls= findallindex3(arr , target, index+1);
        list3.addAll(ansfrombelowcalls);
        return list3;
    }    

    public static void main(String[] args) {

        //is array sorted or not using recurrsion
        int[] arr={4,2,3,4,4};
        //System.out.println(function(arr, 0));

        //System.out.println(linearsearch(arr, 1, 0));
        findallindex(arr,4,0);
        //System.out.println(list);

        //search using arraylist return type method
        findallindex2(arr, 4, 0, list2);
        //System.out.println(list2);

        //search using arraylist creating arraylist in the recursive function

        System.out.println(findallindex3(arr, 4, 0));


        
    
    }
    
}
