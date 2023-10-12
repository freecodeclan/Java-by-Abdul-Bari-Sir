/* USING get() & set() method to access private class */
package revisonSession;

class Rectangle1{
    
    //--> Properties
    private int length;
    private int breadth;

    //--> Create method to access private method
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
    public void setlength(int l){
        if (l >= 0){
            length = l;
        }
        else{
            length = 0;
        }
    }
    public void setbreadth(int b){
        if (b >= 0){
            breadth = b;
        }
        else{
            breadth = 0;
        }
    }

    //--> Methods
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }
} 

public class dataHiding {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        r1.setlength(10);
        r1.setbreadth(5);

        System.out.println("Area of rectangle: " + r1.area());
        System.out.println("Perimeter of rectangle: " + r1.perimeter());
        
    }
    
}
