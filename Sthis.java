/*class A{
    A(){
        System.out.println("Hello world");
    }
    A(int d){
        this();
        System.out.println(d);
    }

}
public class Sthis {
    public static void main(String[] args) {
        A n=new A(3);

    }
    
}*/
class A{
    A(){
        this(5);
        System.out.println("Hello world");
       
    }
    A(int d){
       
        System.out.println(d);
    }

}
public class Sthis {
    public static void main(String[] args) {
        A n=new A();

    }
}