package revisonSession;

class Rectangle{
    //-> Properties 
    public int length;
    public int breadth;

    //-> Methods
    public int area (){
        return length * breadth;
    }

    public int perimeter (){
        return 2 * (length + breadth);
    }

    public boolean isSquare (){
        return length == breadth;
    }
}
public class classRectangle {
    public static void main(String[] args) {

        //-> Creating object of Rectangle
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.breadth = 5;

        System.out.println("Area of rectangle is : " + r1.area());
        System.out.println("Peimeter of rectangle is : " + r1.perimeter());
        System.out.println("Is it a square : " + r1.isSquare());
    }
    
}
