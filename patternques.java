

/**
 * trytrashjava
 */
public class patternques {

    public static void main(String[] args) {
        //pattern(4);
        //pattern2(4);
        //pattern3(5);
        //pattern4(4);
        //pattern5(4);
        recursivefunction(4, 0);
        recursivefunction2(4, 0);
        

    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            //for every row run the column
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
        
        for(int i=1;i<=n;i++){
            //for every row run the column
            for(int j=1;j<=i;j++){
                System.out.print(j);
                

            }
            System.out.println();

        }

    }
    static void pattern4(int n){
        for(int i=0;i<2*n;i++){
            int cols=i>n ? 2*n-i: i;
            for(int j=0;j<cols;j++){
                System.out.print("* ");
                if(j>n){
                    j=j-n+1;
                }
                

            }
            
            System.out.println();
        }

    }
    static void pattern5(int n){
        for(int i=0;i<2*n;i++){
            int cols=i>n ? 2*n-i: i;
            int spaces=n-cols;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=0;j<cols;j++){
                System.out.print("* ");
                if(j>n){
                    j=j-n+1;
                }
                

            }
            
            System.out.println();
        }

    }
    static void recursivefunction(int r,int c){
        if(r==0){
            return ;
        }
        
        if(c<r){
            System.out.print("* ");
            recursivefunction(r, c+1);
        }else{
            System.out.println();
            recursivefunction(r-1, 0);
        }
        
    }
    static void recursivefunction2(int r,int c){
        if(r==0){
            return ;
        }
        
        if(c<r){
            
            recursivefunction2(r, c+1);
            System.out.print("* ");
        }else{
            
            recursivefunction2(r-1, 0);
            System.out.println();
        }
        
    }
}
      



