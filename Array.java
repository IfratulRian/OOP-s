import java.util.*;

//public class Array {
//    public static void main(String args[]){
//        int[] marks= new int[3];
//        marks[0] = 98;
//        marks[1]= 97;
//        marks[2] = 99;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//    }
//}

public class Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
