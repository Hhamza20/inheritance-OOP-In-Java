public class Bird extends Animal{
    public Bird(){
        this.id=2;
        System.out.println("Bird class default constructor called");
    }
    public Bird(int id){
        super(id);
        System.out.println("Bird class parametrized constructor called");
    }
    public void tellAboutself(){
        if (id==1){
            System.out.println("Reptile");
        }
        else if(id==2){
            System.out.println("Bird");
        }
        else {
            System.out.println("Mammal");
        }
    }
    public void speak(){
        if (id==0){
            System.out.println("I can't speak. I am an animal");
        }
        else if (id==1){
            System.out.println("I can't Speak. I am Reptile.");
        }
        else if(id==2){
            System.out.println("I can't Speak. I am Bird.");
        }
        else {
            System.out.println("I can't Speak. I am Mammal.");
        }
    }
}
