import java.util.Scanner;
abstract class shape{
    
abstract void compute_area();
};


class triangle extends shape{
double a,b;
void compute_area(){
double area=0.5*44.2*22.34;
System.out.println("area of triangle is"+ area);

}

};
class rectangle extends shape{
double a,b;
void compute_area(){
double area=44.2*22.34;
System.out.println("Area of rectangle is " + area);
}

};

public class assignments4 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();

shape obj=new triangle();
shape obj2=new rectangle();
//
// a=obj.a;
// b=obj.b;

obj.compute_area();

obj2.compute_area();

}
}