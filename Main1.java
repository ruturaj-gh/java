class employee{
    String name,add,mail;
    float id,mobile,basic;
    void salary()
    {
        float da,cf,gs,hra,pf;
        da=basic*97/100;
        hra=basic*10/100;
        pf=basic*12/100;
        cf=(float) (basic*0.1/100);
        gs=basic+da+hra-pf-cf;
        System.out.print("name"+name);
        

        
    }
}



public class Main1 {
    public static void main(String[] args) {
         
    }
    
}
