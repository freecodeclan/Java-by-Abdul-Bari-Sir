package Inheritance;

public class methodOverriding {
    public static void main(String[] args) {
        
        Super sup = new Sub();
        sup.display();

        
    }
    static class Super{
        public void display(){
            System.out.println("Hello I am Super");
        }
    }
    static class Sub extends Super{
        public void display(){
            System.out.println("Hello I am Child");
        }
    }
}
