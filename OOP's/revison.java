class Circle{
    public double radius;

    public double area(){
        return radius * radius * Math.PI;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
public class revison {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.radius = 5;
        c2.radius = 2;

        System.out.println("Area of circle " + c1.area());
        System.out.println("Perimeter of circle " + c1.perimeter());

        System.out.println("Area of circle 2 " + c2.area());
        System.out.println("Perimeter of circle 2 " + c2.perimeter());
    }
}
