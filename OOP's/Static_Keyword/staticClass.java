package Static_Keyword;

class Test{
    static int x = 10;
    int y = 20;
    void show(){
        System.out.println(x + " " + y);
    }

    static void display(){
        System.out.println(x);
    }

}

public class staticClass {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();

        Test t2 = new Test();
       
    }
}
