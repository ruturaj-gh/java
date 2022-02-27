public class car{
    void carFactory(){};
    void carType(){};
    public static void main(String[] args) {
        luxurycar obj=new luxurycar();
        obj.carFactory();
        
    }
}
class luxurycar extends car{
    
    @Override
    void carFactory() {
        System.out.println("the car factory must be expensive");
        super.carFactory();
    }
}
class smallcar extends car{
    @Override
    void carFactory() {
      
        super.carFactory();
    }


}

class sedancar extends car{
    @Override
    void carFactory() {
        //TODO Auto-generated method stub
        super.carFactory();
    }
}