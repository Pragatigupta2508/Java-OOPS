class Animal {
    private String name;

    public Animal() {
        System.out.println("Animal default constructor");
        this.name = "Unknown";
    }

    public Animal(String name) {
        System.out.println("Animal parameterized constructor");
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some animal sound");
    }

  
    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private int age;

    public Dog() {
        super();
        System.out.println("Dog default constructor");
        this.age = 0;
    }

    public Dog(String name, int age) {
        super(name);
        System.out.println("Dog parameterized constructor");
        this.age = age;
    }

    
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof!");
    }

    public void display() {
        System.out.println("Name: " + super.getName() + ", Age: " + age);
    }
}

public class SuperDemoanimal {
    public static void main(String[] args) {
        System.out.println("Creating dog with default constructor:");
        Dog dog1 = new Dog();
        dog1.display();
        dog1.makeSound();

        System.out.println("\nCreating dog with parameterized constructor:");
        Dog dog2 = new Dog("Buddy", 3);
        dog2.display();
        dog2.makeSound();
    }
}
