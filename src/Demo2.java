package src;

public class Demo2 {
    public static void main(String[] args) {
     Student_1 s1= new Student_1 ("rohit",23,54,"dy patil");

      System.out.println(s1.name);
      System.out.println(s1.age);
      System.out.println(s1.roll_no);
      System.out.println(s1.college);
    }
    
}
class Student_1 {
    String name;
    int age;
    int roll_no;
    String college;

    // Student_1(){
    //     name="sakshi";
    //     age=23;
    //     roll_no=58;
    //     college="MIT";
    // }

    //default constructor

    Student_1(){

    }
    Student_1(String n, int a, int rn,String c){
        name=n;
        age = a;
        roll_no=rn;
         college=c;
    }
    void markAttendence(){
        System.out.println("Attendence is marked" + name);
    }
   
}