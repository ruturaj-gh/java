class employee{
    String name;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
}
public class encpsulation {
    public static void main(String[] args) {
        employee obj=new employee();
        obj.setname("ruturaj");
        obj.getname();
        System.out.println(obj.name);
        System.out.println(obj.getname());
    }
}


    
    


    

