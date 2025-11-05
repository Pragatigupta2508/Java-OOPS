class account {
    private String name;
    protected String email;
    private String password;

    
    public void setName(String name) {
        this.name = name;
    }

   
    public void setPassword(String pwd) {
        this.password = pwd;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}

public class mofifiers {
    public static void main(String[] args) {
        account acc1 = new account();
        acc1.setName("college");
        acc1.setPassword("mypassword123");
        acc1.email = "hello@gmail.com";  
        acc1.displayInfo();
    }
}
