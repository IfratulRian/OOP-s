import java.util.*;

class Employee{
    int id;
    String name;
    public void printdet(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+name);
    }
}

public class CustomClass {
    static void main(String args[]) {
        Employee rian = new Employee();
        rian.id = 807;
        rian.name = "Md. Ifratul Islam Rian";
//        System.out.println(rian.id);
//        System.out.println(rian.name);
        rian.printdet();
    }
}
