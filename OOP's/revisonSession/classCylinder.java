/* CREATING CYLINDER CLASS */
package revisonSession;

class Cylinder{

    //-> Properties 
    public double radius;
    public double height; 

    //-> Methods
    public double lidArea (){
        return Math.PI * radius * radius;
    }

    public double circumference (){
        return 2 * Math.PI * radius;
    }

    public double volume (){
        return lidArea() * height;
    }

    public double totalSurfaceArea (){
        return 2 * lidArea() + circumference() * height;
    }

}
public class classCylinder {
    public static void main(String[] args) {
        
        //--> Creating object of cylinder 
        Cylinder c = new Cylinder();
        
        //-> Initilising properties
        c.radius = 2;
        c.height = 6;

        System.out.println("Area of cylinder is: " + c.lidArea());
        System.out.println("TotalSurfaceArea of cylinder is: " + c.totalSurfaceArea());
        System.out.println("Volume of cylinder is: " + c.volume());
        System.out.println("Cirumference of cylinder is: " + c.circumference());
    }
}
