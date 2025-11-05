class student{
    String name;
    int age;
    student(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Constructor called");
    }
    student (student s2){
        this.name=s2.name;
        this.age=s2.age;
        System.out.println("Copy Constructor called");
    }
    void printinfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}

public class Constructors {
    public static void main(String[] args) {
        
    
    student s1=new student("Alice", 20);
    student s2=new student(s1);
    s2.printinfo();

}}
