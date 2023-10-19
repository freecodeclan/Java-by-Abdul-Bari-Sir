package Inner_Class;

class Outer_new{
   
    //--> Outerclass Method
    public void display(){
        
        //--> Inner class 
        class Inner_new{
            
            //--> Ineer class method
            public void show(){
                System.out.println("hello");
            }
        }
        new Inner_new().show(); 

        //--> Inner Class Object inside outer class method
        Inner_new i = new Inner_new();
        i.show();
    }
}

public class localClass {
    public static void main(String[] args) {
        Outer_new o = new Outer_new();
        o.display();
        

    }
    
}
