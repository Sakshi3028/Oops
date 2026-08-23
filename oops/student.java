package oops;

public class student {

    public int id;
     public int age;
      public String name;
       public int nos;

       public student(){
          System.out.println("Student default constructor called ");

       }
       public student (int id,int age, String name,int nos){
        System.out.println("Student Parametriezd constor called");
        this.id=id;
        this.age=age;
        this.name=name;
        this.nos=nos;
       }
       public student (student srcobj){
        System.out.println("Student cpoy constor called");
        this.id=srcobj.id;
        this.age= srcobj.age;
        this.name=srcobj.name;
        this.nos=srcobj.nos;
       }

       public void study(){
        System.out.println(name + "Studing");
       }
       public void sleep(){
        System.out.println(name + "Sleeping");
       }
       public void bunk(){
        System.out.println(name + "bunking");
       }
}

