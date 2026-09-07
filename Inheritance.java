class Inheritance{
    void eat(){
        System.out.println("I am Eating");
    }
    void run(){
        System.out.println("I am Running");
    }
}
class Dog extends Inheritance{
    void bark(){
        System.out.println("I am Barking");
    }
    public static void main(String args[]){
        Dog muffin = new Dog();
        muffin.eat();
        muffin.run();
        muffin.bark();
    }
}