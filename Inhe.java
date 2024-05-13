class A {
    public A() {
        System.out.println("in A");
    }
}

class B extends A {

    public B() {
        System.out.println("in B");
    }
    public B(int n){
        System.out.println("in int ");
    }
}

public class Inhe {
    public static void main(String[] args) {
        B obj = new B();
    }
}

