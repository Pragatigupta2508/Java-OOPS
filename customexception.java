class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class customexception {
  
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not valid for voting!");
        } else {
            System.out.println("Age " + age + " is valid. You can vote ✅");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);  
            checkAge(21);  
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
