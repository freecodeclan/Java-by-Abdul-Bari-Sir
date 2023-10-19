package Queue;

import java.util.*;

public class PriorityQueue_Demo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        
        System.out.println(pq.peek());      //-- To know the head we use ( .peek() )
        pq.poll();  //-- ( .poll() ) is used to delete an element
        System.out.println(pq);
    }
}
