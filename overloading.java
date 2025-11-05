class student{
    String name;
    int age;
    student(){}
    public void displayinfo(String name){
        System.out.println("Name: "+name);
    }
    public void displayinfo(int age){
        System.out.println("Age: "+age);
    }
}

public class overloading {
    public static void main(String[] args) {
        student s1=new student();
        s1.displayinfo("Bob");
        s1.displayinfo(22);
    }

}
