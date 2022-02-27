class test<T>{
    T obj;
    test(T obj){
        this.obj=obj;


    }
    public T getobject(){
        return this.obj;

    }

}

public class learngenerics {
    public static void main(String[] args) {
        test<Integer> obj2=new test<Integer>(40);
        System.out.println(obj2.getobject());

        test<String> obj3=new test<String>("hello");
        System.out.println(obj3.getobject());

        test<Character> obj4=new test<Character> ('h');
        System.out.println(obj4.getobject());



    }
    
}
