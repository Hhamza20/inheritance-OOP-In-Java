public class Horse extends Mammal{
    public Horse(){
//        this.id=6;
        System.out.println("Horse class default constructor called");
    }
    public Horse(int id){
        super(id);
        System.out.println("Horse class parametrized constructor called");
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
            System.out.println("I can't Speak. I am Bird.");
        }
        else {
            System.out.println("I can't Speak. Family of Mammal. Hurrr...");
        }
    }
}
