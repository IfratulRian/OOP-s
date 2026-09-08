public class Polymorphism {
    // No. of arguments
    void show(){
        System.out.println("There is no number");
    }
    void show(int n){
        System.out.println("The number is "+ n);
    }
    void show(long n){
        System.out.println("The number is "+n); // type of arg.
    }
    // No. of sequence
    void show(int n, String s){
        System.out.println("The number is "+n+" & the string is "+s);
    }
    void show(String s, int n){
        System.out.println("The string is "+s+" & the number is "+n);
    }

    public static void main(String args[]){
        Polymorphism x = new Polymorphism();
        x.show();
        x.show(10);
        x.show(10,"Hello World");
        x.show("Hello World",10);
    }
}
