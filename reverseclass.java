public class reverseclass {

    static int sum=0;

    static void reverse(int n){
        if(n==0){
            return ;

        }
        int rem=n%10;
        sum= sum*10+rem;
        reverse(n/10);
        
        

        
    }
    static int reverse2(int n){
        int digits=(int)(Math.log10(n))+1;
        
        return helper(n,digits);
    }

    private static int helper(int n, int digits){
        if(n%10==n){
            return n;

        }
        int rem=n%10;

        return rem*(int)Math.pow(10,digits-1)+helper(n/10, digits-1);

    }

    static boolean palin(int n){
        return n==reverse2(n);
    }

    static int count (int n){
        return helper2(n,0);
    }
    private static int helper2(int n,int c){
        if (n==0){
            return c;
        }
        int remainder=n%10;
        if(remainder==0){
            return helper2(n/10, c+1);
        }
        return helper2(n/10, c);




    }
        
    



    public static void main(String[] args) {
        reverse(187);
        
        System.out.println(sum);
        System.out.println(reverse2(12345));
        System.out.println(palin(1221));
        System.out.println(count(787900));
        
    }
    
}
    

