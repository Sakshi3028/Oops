package oops;

public class app {
    public static void main(String[] args) throws Exception{
        student A = new student(1,12,"rahul",3);
        //  A.id=1;
        //  A.age=14;
        //  A.name="rohan";
// System.out.println(A.name);
// System.out.println(A.id);
// System.out.println(A.age);

student B= new student(A);
System.out.println(B.name);
System.out.println(B.id);
System.out.println(B.age);
B.sleep();
    }
}
