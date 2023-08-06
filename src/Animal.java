public class Animal {
    //Static variables are created when program is started and remain in the memory till Program is terminated
    //They can be accessed with both object name and class name
    //They are not associated with an particular object. They are common for all
    //Static Functions: Don't require an object to call them. Only static variables can be accessed inside them. Non static can't be accessed inside them.
    public Animal(){

    }
    protected int id;
    public Animal(int id){
        this.id=id;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId() {
        return id;
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
