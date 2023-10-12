package revisonSession;

class Square{
    //--> Poperties
    public int length;
    public int width;

    //--> Constructor
    public Square(int l, int w){
        length = l;
        width = w;
    }

    //--> Method
    public int area(){
        return length * width;
    }
    public int perimeter(){
        return 4 * length;
    }
}

public class constructorCreation {
    public static void main(String[] args) {
        Square sq = new Square(5, 5);

        System.out.println("Area of square: " + sq.area());
        System.out.println("Perimeter of square: " + sq.perimeter());
    }
    
}
