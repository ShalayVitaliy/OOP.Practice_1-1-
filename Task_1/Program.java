package Task_1;

public class Program {
    public static void main(String[] args) {

        Cat cat_1 = new Cat("Betty", 15);
        Owner owner_1 = new Owner("Pitter");

        cat_1.Greeting();
        System.out.println("My owner name is: " + owner_1.getOwner_name());
    }
}
