
// Single inheritance
class parent {
	String hairtype="Curly";
	String eyecolor="Blue";
	void display() {
		System.out.println("Parent's features");
	}
}
class child extends parent{
	void add() {
		System.out.println("Child's features");
	}
}
public class inheritance {
	public static void main(String[] args) {
		
        Parent a = new Parent();
        System.out.println(a.eyes);
        System.out.println(a.bloodgroup);
        a.show();

        Child c = new Child();
        System.out.println(c.eyes);
        System.out.println(c.bloodgroup);
        c.show();
        c.display();
    }
}

class Parent {
    String eyes = "brown";
    String bloodgroup = "B+";
    String haircolor = "black";
    int height = 160;

    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class");
    }
}
