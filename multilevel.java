

class one{
    void first(){

        System.out.println("first class");
    }
};
class two extends one{
    void second(){
        System.out.println("second class");
    }
}
class three extends two{
    void third(){
        System.out.println("third class");
    }
}






public class multilevel {
    public static void main(String[] args) {
        three obj=new three();
        obj.first();
        obj.second();
        obj.third();

        
    }
    
}
