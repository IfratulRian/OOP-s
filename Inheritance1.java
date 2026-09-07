class Animalll{
    void eat(){
        System.out.println("I am Eating");
    }
    void run(){
        System.out.println("I am Running");
    }
}
class Doggy extends Animalll{
    void bark(){
        System.out.println("I am Barking");
    }
}

public class Inheritance1 {
    public static void main(String args[]){
        Doggy muffin = new Doggy();
        muffin.eat();
        muffin.run();
        muffin.bark();
    }
}
