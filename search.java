public class search {
    static int linearsearch(int[] arr, int size,int element){
        for (int i=0;i<size;i++){
            if (arr[i]==element){
                return i;

            }
        }
        return 0;
    };
 static int binarysearch(int[] arr, int size,int element){
    int mid,high,low;
    

    low=0;
    high=arr.length-1;

    while (low<=high){
    
    mid=(low+high)/2;
    if (arr[mid]==element){
        return mid;
    }
    if (arr[mid]<element){
        low=mid+1;


    }
    else{
        high=mid-1;
    }
    //searching ends
    //return -1;
}
return 0;

 

}
    public static void main(String[] args) {
        //sorted array for binary search
        int[] arr={10,45,66,77,87,239,458,673,885};


        int size=arr.length;
        int element=87;
        int searchindex=binarysearch(arr,size,element);
        int linsearch=linearsearch(arr, size, element)
        System.out.println("the given element is found at  " + searchindex);
        System.out.println("by the linear search " + linsearch);
      

        
    }
    
}
