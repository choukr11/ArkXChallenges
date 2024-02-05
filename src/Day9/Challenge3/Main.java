package Day9.Challenge3;


import java.sql.SQLOutput;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> boxes = new Stack<String>();
        //1. Push (add an element to the top of the stack).
        boxes.push("Shirts");
        boxes.push("Pants");
        boxes.push("Watches");
        boxes.push("Underwear");
        boxes.push("Shoes");
        boxes.push("Miscellaneous");
        //2. Pop (remove the element from the top of the stack).
        System.out.println("The boxes in the stack:");
        System.out.println(boxes);
        System.out.println("Removing the top box: " +boxes.pop());
        System.out.println("The boxes left: ");
        System.out.println(boxes);
        //3. Peek (get the element at the top of the stack without removing it).

        System.out.println("Q: What's in the Box? \nA: " +boxes.peek());
        //4. Check if the stack is empty.
        System.out.println("Q: Is the stack empty? \nA: " +boxes.empty());
    }
}