public interface emp{
    String getName();
}



public class abstraction {
    public static void main(String[] args) {
        emp e=()->"Software engineer";
         System.out.println(e.getName());
        System.out.println("This is a placeholder for abstraction.java");
    }

}
