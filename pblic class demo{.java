public class demo{
    int a;
    int b;
    public void setData(int a,int b){
        this.a=a;
        this.b=b;
        
    }

public void showData(){
    System.out.println("value of a"+ a);
    System.out.println("value of b" +b);
}


public static void main(Strings[] args){
    demo d =new demo;
    d.setData(10,29);
    d.showData();
}
}

