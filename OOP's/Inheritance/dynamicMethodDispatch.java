package Inheritance;

public class dynamicMethodDispatch {
    public static void main(String[] args) {

        // Dynamic Dispatch
        Super sup = new Sub();  // Here reference is of Super class and Super class is holding Sub Class Object
        /* In Dynamic Dispatch always object methods will be called over-riding methods. */
        sup.meth2();
        
    }
    static class Super{
        public void meth1(){
            System.out.println("Super Meth1");
        }
        public void meth2(){
            System.out.println("Super Meth2");
        }
    }
    static class Sub extends Super{
        public void meth2(){
            System.out.println("Sub meth2");
        }
        public void meth3(){
            System.out.println("Sub Meth3");
        }
    }
}
