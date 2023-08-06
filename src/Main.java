public class Main {
    public static void main(String[] args) {
       Animal A1=new Animal();
       A1.tellAboutself();
       A1.speak();
System.out.println("\n\n");
        Reptile R1=new Reptile();
        R1.tellAboutself();
        R1.speak();
     System.out.println("\n\n");
        Mammal M1=new Mammal();
        M1.tellAboutself();
        M1.speak();
     System.out.println("\n\n");
        Bird B1 = new Bird();
        B1.tellAboutself();
        B1.speak();
     System.out.println("\n\n");
        Snake S1=new Snake();
        S1.tellAboutself();
        S1.speak();
        System.out.println(S1.getFamily());
     System.out.println("\n\n");
        Parrot P1=new Parrot();
        P1.tellAboutself();
        P1.speak();
        System.out.println(P1.getFamily());
     System.out.println("\n\n");
        Horse H1=new Horse();
        H1.tellAboutself();
        H1.speak();
        System.out.println(H1.getFamily());
    }

}