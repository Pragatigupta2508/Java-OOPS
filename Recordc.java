record Alien(int id, String name) {
    public Alien(int id, String name) {
        if(id==0)
            throw new IllegalArgumentException("ID cannot be zero");
            this.id = id;
            this.name = name;
        
    }
}



public class Recordc {
    public static void main(String[] args) {
        Alien a1=new Alien(1,"Alien");
        Alien a2=new Alien(2,"Monster");
        System.out.println(a1);
        System.out.println(a1.equals(a2));
    }

}
