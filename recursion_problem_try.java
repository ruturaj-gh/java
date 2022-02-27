

public class recursion_problem_try {
    static void fun(int[] arr){
        int[] arr2=new int[arr.length-1];
        if(arr.length==1){
            return;
        }
        

        for(int i=0;i<arr.length-1;i++){
            
            int j=i+1;
            
            arr2[i]=arr[i]+arr[j];
            
            
            
            

        }
        for(int i=0;i<arr.length-1;i++){
            
            System.out.println(" " + arr2[i] + " ");

        }
        fun(arr2);
        
        
    }
    static void findmaxmin(){
        

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        
        
        fun(arr);
        System.out.println("this is the end");
        
        



    }
    
}
