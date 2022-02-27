import java.util.Scanner;

class Publication{
    String Title="mrityunjay";
    int Price=300;
    int Copies=500;
    int Total=0;
    void saleCopy(String author, int Tprice, int numberOfCopies, int x){
        System.out.println("Order placed for Book '"+Title+"' ~ by "+author+" ! You Have To Pay : "+Tprice+"("+Price+" each)\n Copies ordered : "+numberOfCopies+"\n Copies remaining : "+x);
    }

}

class Book extends Publication{
    String author="shivaji sawant";
    void ordercopies(int numberOfCopies){
        int x = Copies-numberOfCopies;
        int price = numberOfCopies*Price;
        saleCopy(author,price,numberOfCopies,x);
        Total=+x;
    }
}

class Magazine extends Publication{
    int orderQty,Currentissue=1116;
    
}

public class assignments2{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Book b = new Book();
            Magazine m = new Magazine();
            System.out.println("How many copies you want to order ?\t:");
            int num = sc.nextInt();
            b.ordercopies(num);

            System.out.println("Do You Want To Check Total Sale Of Publication ? [1/0] \n\t yes=1\tno=0");
            int n = sc.nextInt();
            if(n==1){
                System.out.println("Total Sale Of Publication : "+(b.Total+m.Currentissue)+" only.");
            }else{return;}
        }
        
    }
}