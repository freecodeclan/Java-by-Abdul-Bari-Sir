public class constructor {
    public static void main(String[] args) {

        // Passing no parameter 
        Rectangle r = new Rectangle();

        // Here passing the parameter 
        Rectangle r1 = new Rectangle(10, 2);

        System.out.println(r1.getLength());
        System.out.println("area of r: "+ r.area());
        System.out.println("Area of r1: " + r1.area());
  
    }
    static class Rectangle{
        
        private int length;
        private int breadth;

        public int getLength(){
            return length;
        }

        public int getBreadth(){
            return breadth;
        }

        // Non-Parameter Constructer don not pass return type.
        public Rectangle(){
            length = 5;
            breadth = 2;
        }

        // Parameterize Constructer do not pass return type.
        public Rectangle(int l, int b){
            length = l;
            breadth = b;
        }

        public int area(){
            return getLength()*getBreadth();
        }
    }
}
