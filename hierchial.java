class car{
    void go(){
        System.out.println("the car is going burrr" + "\n");
    }
}
class model extends car{
    model(){
        System.out.println("the car model is volvo" + "\n");

    }
    void stop(){
        System.out.println("the car is stopped" + "\n");
    }
}
class mechanic extends car{
    void fun(){
        System.out.println("the car needs a mechanic" + "\n");
    }
    
}






public class hierchial {
    public static void main(String[] args) {
        mechanic obj=new mechanic();
        obj.go();
        
        
    }
    
}
