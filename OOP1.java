class Animal{
    String color;
    int age;
    void initObj(String c,int a){
        color = c;
        age = a;
    }
    void Display(){
        System.out.println(color + " " + age);
    }
}
public class OOP1 {
    public static void main(String args[]){
        Animal dog = new Animal();
        dog.initObj("Black",20);
        dog.Display();
    }
}
