package Day9.Challenge4;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();
        //1. Enqueue (add an element to the back of the queue).
        line.offer("Toyota");
        line.offer("Hyundai");
        line.offer("Dacia");
        line.offer("BMW");
        System.out.println(line);
        //2. Dequeue (remove the element from the front of the queue).
        System.out.println("Element removed: " +line.poll());
        System.out.println(line);

        //3. Peek (get the element at the front of the queue without removing it).
        System.out.println("Peek the front of the line: " +line.peek());
        System.out.println(line);

        //4. Check if the queue is empty.
        System.out.println("Is the line empty: " +line.isEmpty());
        System.out.println(line);


    }
}