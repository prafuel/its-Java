

// Method Overloading -> compile_time polymorphism
class Check {
    public int method(int x) {
        return x;
    }
    public int method(int x, int y) {
        return x + y;
    }
    public String method(int x, int y, String c) {
        return "String Captured";
    }
}

// Method Overriding -> runtime polymorphism
class Parent {
    public String method() {
        return "Hello From Parent";
    }
}

class Child extends Parent{
    @Override
    public String method(){
        return "Hello From Child";
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        // Check obj1 = new Check();
        // System.out.println(obj1.method(10,20, "Prafull"));

        Parent obj2 = new Parent();
        System.out.println(obj2.method());

        Child obj3 = new Child();
        System.out.println(obj3.method());
    }
}