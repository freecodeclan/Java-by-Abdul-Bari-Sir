public class data_hiding {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        // To access private property we use these getLength() & setLength() property methods  
        r1.setLength(10.5);
        r1.setBreadth(5.5);

        System.out.println("Area " + r1.area());
        System.out.println("Is it square: " + r1.isSquare());
        
        
        
    }
    static class Rectangle{
        // Private properties of class Rectangle
        private double length;
        private double breadth;

        // To access these private properties we use getLength() & setLength() property
        public double getLength(){
            return length;
        }

        public double getBreadth(){
            return breadth;
        }

        public void setLength(double l){
            if (l > 0){
                length = l;
            }
            else{
                length = 0;
            }
            
        }

        public void setBreadth(double b){
            if (b > 0){
                breadth = b;
            }
            else{
                breadth = 0;
            }
        }

        public double area(){
            return length*breadth;
        }
        
        public boolean isSquare(){
            if(length == breadth){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
}
