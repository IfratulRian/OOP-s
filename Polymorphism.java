public class Polymorphism {
    // No. of arguments
    void show(){
        System.out.println("There is no number");
    }
    void show(int n){
        System.out.println("The number is "+ n);
    }

    public static void main(String args[]){
        Polymorphism x = new Polymorphism();
        x.show();
        x.show(10);
    }
}
