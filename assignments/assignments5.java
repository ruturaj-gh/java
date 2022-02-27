interface bike{
    void model();
    void gearchange();
    void maxspeed();
    };
    class yamaha implements bike{
    public void model(){
    System.out.println("the bike model is yamaha" + "\n");
    }
    public void gearchange(){
    System.out.println("this model has 2 up and 2 down gears" + "\n");
    }
    public void maxspeed(){
    System.out.println("its maximum speed is 150km/hr"+ "\n");
    }
    //System.out.println("\n");
    };
    class splendor implements bike{
    public void model(){
    System.out.println("the bike model is splendor" + "\n");
    }
    public void gearchange(){
    System.out.println("this model has 3 up and 1 down gears" + "\n");
    }
    public void maxspeed(){
    System.out.println("its maximum speed is 100km/hr"+ "\n");
    }
    //System.out.println("\n");
    
    };
    class passion implements bike{
    
    public void model(){
    System.out.println("the bike model is passion" + "\n");
    }
    public void gearchange(){
    System.out.println("this model 4 down and all the way up gears" + "\n");
    }
    public void maxspeed(){
    System.out.println("its maximum speed is 120km/hr"+ "\n");
    }
    //System.out.println("\n");
    };
    
    public class assignments5 {
    public static void main(String[] args) {
    yamaha obj1=new yamaha();
    obj1.model();
    obj1.gearchange();
    obj1.maxspeed();
    splendor obj2=new splendor ();
    obj2.model();
    obj2.gearchange();
    obj2.maxspeed();
    passion obj3=new passion ();
    obj3.model();
    obj3.gearchange();
    obj3.maxspeed();
    
    }
    }