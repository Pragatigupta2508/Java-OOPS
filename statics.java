class s1{
    static String school;
    String name;
}

public class statics {
    public static void main(String[] args) {
        s1.school="ABC High School";
        s1 student1=new s1();
        student1.name="John";
        s1 student2=new s1();
        student2.name="Alice";

        System.out.println(student1.name+" studies at "+s1.school);
        System.out.println(student2.name+" studies at "+s1.school);
    }

}
