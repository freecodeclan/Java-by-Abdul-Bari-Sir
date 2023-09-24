package Inheritance;

public class thisVSsuper {
    public static void main(String[] args) {
        
    }
    //Creating class Rectangle
    static class Rectangle{
        public int length;
        public int breadth;

        // Parameter Constructer
        public Rectangle(int l, int b){
            /* We use (this) keyword bcoz not to create name conflict between parameters and properties. */
            this.length = l;
            this.breadth = b;
        }

        // Creating Property
        public void Display(){
            System.out.println("Length : "+this.length);
            System.out.println("Breadth : "+this.breadth);
        }
    }
}
