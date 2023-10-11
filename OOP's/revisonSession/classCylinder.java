package revisonSession;

class Cylinder{

    //-> Properties 
    public double radius;
    public double height; 

    //-> Methods
    public double area (){
        return 2*Math.PI*radius*(radius+height);
    }

    public double circumference (){
        return (2*Math.PI*radius) * height;
    }

    public double volume (){
        return Math.PI * radius * radius * height;
    }

    public double totalSurfaceArea (){
        return 2*Math.PI * (height + radius);
    }

}
public class classCylinder {
    public static void main(String[] args) {
        
        //--> Creating object of cylinder 
        Cylinder c = new Cylinder();
        c.radius = 2;
        c.height = 6;

        System.out.println("Area of cylinder is: " + c.area());
        System.out.println("TotalSurfaceArea of cylinder is: " + c.totalSurfaceArea());
        System.out.println("Volume of cylinder is: " + c.volume());
        System.out.println("Cirumference of cylinder is: " + c.circumference());
    }
}
