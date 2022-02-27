
public class recursionproblems {
    public static void main(String[] args) {
        //summation of digits in number
        int ans=sumofn(1342);
        System.out.println(ans);

        
        
        
    }
    static int sumofn(int n){
        if(n==0){
            return 0;

        }
        

        return sumofn(n/10) +(n%10);
        
    }
    static int productof(int n){
        if(n%10==n){
            return n;

        }
        

        return productof(n/10)*(n%10);
        
    }



    
}
