package PracticePrograms;

class A {
    public A() {
        System.out.println("Hello Pavan");
    }
}
class B extends A {
    public B() {
        System.out.println(" I am in class B");
    }
}

public class C {
    public static void main(String[] args) {
        B b1 = new B();
        A a1 = new A();
        System.out.println(b1);
        System.out.println(a1);
    }
}
