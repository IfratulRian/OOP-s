class D extends A{
    void showD(){
        System.out.println("d class method");
    }
}

class E extends A{
    void showE(){
        System.out.println("e class method");
    }
}

public class HierarchicalInheritance {
    public static void main(String args[]){
        D ob4 = new D();
        ob4.showA();
        ob4.showD();
        E ob5 = new E();
        ob5.showA();
        ob5.showE();
    }
}
