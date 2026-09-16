package src;

public class inheritance {
    public static void main(String[] args) {
        EngineeringStudent es= new EngineeringStudent();
        es.attendLab();
        es.markAttendence();
    }
}
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