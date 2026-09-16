package src;

public class Inheritance_types {
    public static void main(String[] args) {
        
        System.out.println();
    }
}
//Simple inheritance
class Student{
    String name;
    int age;

    void markAttendence(){
        System.out.println("attendance marked");
    }
}
class EngineeringStudent extends Student{
    void attendLab(){
        System.out.println("lab marked");
    }
}
//multilevel inheitance
class CSEEngineeringStudent extends  EngineeringStudent{
    void attendCseLab(){
        System.out.println(" Cse lab marked");
    }
}
