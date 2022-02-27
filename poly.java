class animal{
    public void sound(){
        System.out.println("the sound of animal can be anything");
    };

};

class dog extends animal{
    public void sound(){
        System.out.println("the sound of the dog is woo-woo");
        
        

   
    }
};
class tiger extends animal{
    public void sound(){
        System.out.println("the tiger sound is whaaao whaaaao");

    }
}


public class poly {

    public static void main(String[] args) {
        animal obj=new animal();
        animal obj2=new dog();
        animal obj3=new tiger();
        obj.sound();
        obj2.sound();
        obj3.sound();




        
    }
}