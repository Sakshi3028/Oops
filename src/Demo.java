package src;

public class Demo {
    public static void main(String[] args) {
        Student_1 s1= new Student_1 ();
       Student_1 s2= new Student_1 ();

       s1.name=" sakshi";
       s1.age=21;
       s1.roll_no=58;
       s1.college="MIT";
        
        s2.name=" sonal";
       s2.age=24;
       s2.roll_no=56;
       s2.college="MIT";

       s1.print();
       s2.print();
        
    }
}
class Student_1 {
    String name;
    int age;
    int roll_no;
    String college;

    void markAttendence(){
        System.out.println("Attendence is marked" + name);
    }
    void  print(){
        System.out.println(name + " , " + age  + ", " + roll_no +  " , "  + college);
    }
}
