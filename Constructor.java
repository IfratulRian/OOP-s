class employee{
    String name;
    int id;
    employee(String name, int id){
        this.name=name;
        this.id=id;
    }
}

public class Constructor {
    void print(employee e){
        System.out.println(e.name+" "+e.id);
    }
    public static void main(String args[]){
        employee e1 = new employee("Sabbir",101);
        employee e2 = new employee("Adib",102);
        Constructor obj = new Constructor();
        obj.print(e1);
        obj.print(e2);
    }
}
