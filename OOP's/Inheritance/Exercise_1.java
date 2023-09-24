package Inheritance;

public class Exercise_1 {
    public static void main(String[] args) {

        Child c = new Child(10, 20);
       
        // GrandChild gdc = new GrandChild();
        /* Here GrandChild class is inheriting from its Child class and Child class is inheriting from Parent Class  */
      
    }
    // PARENT CLASS
    static class Parent{
        // Non-Parameter Constructor
        public Parent(){
            System.out.println("Parent Constructor");
        }
        // Parameter Constructor
        public Parent(int x){
            System.out.println("Param of Parent");
        }
    }
    //CHILD CLASS
    static class Child extends Parent{
        public Child(){
            System.out.println("Child Constructor");
        }
        public Child(int y){
            System.out.println("Param of Child");
        }
        public Child(int x, int y){
            super(x);   // Here we are using super() keyword to call parameter constructor of Parent Class 
            System.out.println("Hello I am your builder!!!");
        }
    }
    // GrandChild Class 
    static class GrandChild extends Child{
        public GrandChild(){
            System.out.println("Grand Child is here!!!");
        }
    }
}
