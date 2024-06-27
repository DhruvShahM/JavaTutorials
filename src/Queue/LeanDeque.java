package Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeanDeque {

    public static void main(String[] args) {
//        ArrayDeque<Integer> dq=new ArrayDeque<>();
//        dq.offer(10);
//        dq.offerLast(20);
//        dq.offerFirst(30);
//        dq.offer(50);
//        dq.offerFirst(60);
//        System.out.println(dq);
//
//        System.out.println(dq.poll());
//        System.out.println(dq.pollLast());
//
//        System.out.println(dq.peek());

        Queue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);

        System.out.println(pq);
        System.out.println(pq.poll());

        System.out.println("queue"+pq);
        System.out.println(pq.poll());
    }
}
