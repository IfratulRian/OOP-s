import java.util.*;

public class function1{
    public static void printName(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        String name = sc.next();
        printName(name);
    }
}
