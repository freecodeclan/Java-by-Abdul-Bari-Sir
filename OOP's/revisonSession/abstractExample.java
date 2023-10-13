package revisonSession;

abstract class Super{
    public void super1(){
        System.out.println("Super Constuctor");
    }

    public void meth1(){
        System.out.println("Meth1 of super");
    }

    abstract public void meth2();
}

class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Sub meth2");
    }
}

public class abstractExample {
   public static void main(String[] args) {
    Super s = new Sub();
    s.meth1();
    s.meth2();
   }
}
