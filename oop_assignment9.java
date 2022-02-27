
import java.util.Scanner;
class Bank{
    String name;
    int balance;
    Bank(String name,int balance){
        this.name=name;
        this.balance=balance;
    }
    

    boolean createacc(String name,int balance){
        System.out.println("account has been created succesfully");
        return true;
        
    }
    void details(String name){
        if(createacc(name, balance)==true){
            System.out.println("name: "+ name);
            System.out.println("balance: "+ balance);
        }
        else{
            return;
        }
    }

    void withdraw(String name,int withdrawamount){
        System.out.println("The amount " +withdrawamount+" has been withdrawed sucessfully");
        balance=balance-withdrawamount;
        System.out.println("account balance is "+ balance);


    }
    void deposit(int money){
        System.out.println("The amount " + money+ "has been sucessfully deposited");
        balance=balance+money;
        System.out.println("The account balance is "+ balance);
    }

};


public class oop_assignment9 {
    public static void main(String[] args) {
        while(true){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account holder name :");
        
        String name=sc.nextLine();
        
        

        System.out.println("Enter the amount for deposit :");
        int balance=sc.nextInt();
        Bank obj=new Bank(name,balance);
        obj.createacc(name, balance);
        System.out.println();
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        
        

        System.out.println("Enter the operation \n 1. for account details \n 2.for withdrawing amount \n 3.for deposing money");
        int op=sc.nextInt();
        
        
        switch (op) {
            case 1:
            obj.details(name);
                
            
            case 2:
            System.out.println("Enter the withdraw amount:(if you dont want just enter 0 )");

            int withdrawamount=sc.nextInt();
            
            obj.withdraw(name, withdrawamount);
            
            

            case 3:
            System.out.println("Enter the amount you want to deposit:(if you dont want just enter 0 )K");

            int money=sc.nextInt();
            obj.deposit(money);
            

            

        
            default:
                break;
        }
    
    }

        
}
    
}
