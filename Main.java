import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character obj1=new Character('A');
        char ch= obj1.charValue();
        System.out.println(ch);
        int x= obj1.compareTo(obj1);
        System.out.println(x);
        Integer obj3=new Integer(12);
        int a=obj3.intValue();
        System.out.println(a);
        boolean  b1=obj3==12?true:false;
        System.out.println(b1);

        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(13);
        hs.add(14);
        hs.add(15);
        hs.add(16);
        hs.add(17);
        System.out.println(hs);
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        list.remove(0);
        System.out.println(list);
        Queue<Integer> stt2=new ArrayDeque<>();
        stt2.add(12);
        stt2.add(1);
        stt2.add(13);
        stt2.add(5);
        System.out.println(stt2);

//public class demo {
//    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydb";
        String name="root";
        String password="password123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=java.sql.DriverManager.getConnection(url,name,password);
            System.out.println("Connection Successful");
        }
        catch(Exception e){
            System.out.println("Connection Failed: "+e);
        }
    }

}