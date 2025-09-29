import java.util.*;

class Stu implements Comparable<Stu> {
    String name;
    int rollno;

    Stu(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return name + " " + rollno;
    }

    @Override
    public int compareTo(Stu that) {
        return Integer.compare(this.rollno, that.rollno); // safer than subtraction
    }
}

public class classroom {
    public static void main(String[] args) {
        List<Stu> list = new ArrayList<>();
        list.add(new Stu("Rahul", 21));
        list.add(new Stu("Raj", 45));
        list.add(new Stu("Anany", 61));
        list.add(new Stu("Shurbhi", 15));

        Collections.sort(list);
        System.out.println("Ascending by rollno: " + list);

        // For descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending by rollno: " + list);
    }
}
