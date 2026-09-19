package src;

public class Autoboxing {
    public static void main(String[] args) {
        int x=10;
        Integer y= x;//autoboxing
        System.out.println(y);
        System.out.println(x);//unboxing

        //unboxing
        Integer a= new Integer(20);//autoboxing
        int b=a;//unboxing
        System.out.println(a);
        System.out.println(b);

    }
}
