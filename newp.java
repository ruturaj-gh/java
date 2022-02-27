

class employee{
    String name,email,adress;
    int mob_num;
    private String ns;
    private String gs;
      public  int salary(int sal){
        
       float da,hra;
       float pf,fund;
        da=(97/100)*sal;
        hra=(10/100)*sal;
        pf=(12/100)*sal;
        fund=(float) ((0.1/100)*sal);
       int gs=(int) (sal+da+hra+pf);
       int ns=(int) (gs-pf-fund);
    return ns;
      }
       public void display(String str,int num){
           employee pop =new employee();

           System.out.println("name-" + str);
           System.out.println("salary-" + num);
           System.out.println("gross value" +pop.gs);

           System.out.println("net value" + pop.ns);




       }

      


    


    

};
class programmer extends employee{
    public static void main(String[] args) {

    }
};

class apm extends employee{
    public static void main(String[] args) {
        
    }
};

class teamlead extends employee{
    public static void main(String[] args) {
        
    }
}
        





public class newp {

    public static void main(String[] args) {
       

        programmer obj=new programmer();
        
        apm obj1=new apm();
        System.out.println("enter the name of programmer"+"\n");
         
        System.out.println("enter the basic pay of programmer-"+"\n");              
        
        obj1.salary(sal1);
        obj1.display(name1, sal1);

        apm obj2=new apm();
        System.out.println("enter the name of apm"+"\n");
         
        System.out.println("enter the basic pay of apm-"+"\n");              
        
        obj1.salary(sal2);
        obj1.display(name2, sal2);

        teamlead obj3=new teamlead();
        System.out.println("enter the name of teamlead"+"\n");
        
        System.out.println("enter the basic pay of teamlead" + "\n");

        
        obj3.salary(sal3);
        obj1.display(name3, sal3);



        
    }
    
}








 
