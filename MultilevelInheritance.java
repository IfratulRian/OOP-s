class C extends B{
    void showC(){
        System.out.println("c class method");
    }
}

public class MultilevelInheritance {
    public static void main(String args[]){
        C ob3 = new C();
        ob3.showA();
        ob3.showB();
        ob3.showC();
    }
}
