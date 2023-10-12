package revisonSession;

class Super{
    public void display(){
        System.out.println("Super Class display");
    }
}
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub Class display");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Super su = new Sub();

        su.display();
    }
}
