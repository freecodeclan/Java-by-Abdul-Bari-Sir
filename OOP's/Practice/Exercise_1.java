/* Make a class of Cylinder and find the surface area of Cyclinder  */
public class Exercise_1 {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(10, 5); 

        System.out.println(c1.surfaceArea());
        System.out.println(c2.surfaceArea());
        
    }
    static class Cylinder{

        // Data hiding by using private keyword
        private double radius;
        private double height;

        // get() & set() property to access private properties where get() property is used to read and set() property is used to  write.
        public double getRadius(){
            return radius;
        }
        public double getHeight(){
            return height;
        }

        // Non-parameterized constructor
        public Cylinder(){
            radius = 5;
            height = 2;
        }
        // parameterized constructor
        public Cylinder(double r, double h){
            radius = r;
            height = h;
        }

        public double surfaceArea(){
            return 2 * 3.142 * (height+radius);
        }

    }
}
