
public class abstractclss {
    public static void main(String[] args) {
        vehicle v1 = new Car();
        vehicle v2 = new bike();
        v1.start();
        v2.start();
        v1.brake();
        v2.brake();
    }
}

abstract class vehicle{
    abstract void start();
    abstract void brake();
}
class Car extends vehicle{
    void start() {
        System.out.println("Car is starting");}
    void brake(){
        System.out.println("Car is braking");
    }
    }

class bike extends vehicle{
    void start() {
        System.out.println("Bike is starting");
    }   
    void brake(){
        System.out.println("Bike is braking");
    }
}