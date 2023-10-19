package Queue;
import java.util.*;
public class ArrayDeque_Demo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offer(30);
        dq.offer(40);

        System.out.println(dq);
     }
}
