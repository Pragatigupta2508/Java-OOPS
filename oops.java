class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printcolor(){
    System.out.println(this.color);
}
}

public class oops {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.color="blue";
        p1.type="gel";
        p1.printcolor();
      
        p1.write();
    }
}

