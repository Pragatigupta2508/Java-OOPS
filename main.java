class stu{
    String name;
    int rollno;
    stu(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    void read(){
        System.out.println("Reading");
    }
    void write(){
        System.out.println();
    }

}
public class main{
    public static void main(String[] args){
        stu s1 = new stu("Rahul",1);
        s1.read();
        s1.write();
    }
}