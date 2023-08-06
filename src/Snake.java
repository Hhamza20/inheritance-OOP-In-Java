public class Snake extends Reptile{
    public Snake(){
//        this.id=4;
        System.out.println("Snake class default constructor called");
    }
    public Snake(int id){
        super(id);
        System.out.println("Snake class parametrized constructor called");
    }
    public int getFamily(){
        return getId();
    }
    public void speak(){
        if (id==0){
            System.out.println("I can't speak. I am an animal");
        }
        else if (id==1){
            System.out.println("I can't Speak. Family of Reptile. Shhh...");
        }
        else if(id==2){
            System.out.println("I can't Speak. I am Bird.");
        }
        else {
            System.out.println("I can't Speak. I am Mammal.");
        }
    }
}
