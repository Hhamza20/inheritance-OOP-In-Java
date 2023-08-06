public class Parrot extends Bird{
    public Parrot(){
//        this.id=5;
        System.out.println("Parrot class default constructor called");
    }
    public Parrot(int id){
        super(id);
        System.out.println("Parrot class parametrized constructor called");
    }
    public int getFamily(){
        return getId();
    }
    public void speak(){
        if (id==0){
            System.out.println("I can't speak. I am an animal");
        }
        else if (id==1){
            System.out.println("I can't Speak. Family of Reptile. Shhh");
        }
        else if(id==2){
            System.out.println("I can't Speak. Family of Bird. Trrr...");
        }
        else {
            System.out.println("I can't Speak. I am Mammal.");
        }
    }
}
