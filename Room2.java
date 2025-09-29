import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AB implements Comparator<String> {
    @Override
    public int compare(String i, String j) {
        int len1 = i.length();
        int len2 = j.length();
        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Room2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Dhruv");
        names.add("Radhika");
        names.add("Raj");
        names.add("Sanskriti");

        // Default sorting (alphabetical)
        Collections.sort(names);
        System.out.println("Alphabetical: " + names);

        // Custom sorting (by length)
        Collections.sort(names, new AB());
        System.out.println("By length: " + names);
    }
}
