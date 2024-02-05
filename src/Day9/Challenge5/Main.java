package Day9.Challenge5;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("Quartier Habous");
        linkedList.offer("Ain Diab");
        linkedList.offer("Derb Ghallef");
        linkedList.offer("Anfa");
        linkedList.offer("Hay Mohammadi");
        linkedList.offerFirst("Sour Jdid");
        System.out.println(linkedList);
        //1. Add a node to the end of the linked list.
        linkedList.offerLast("Ancienne Médina");
        System.out.println(linkedList);
        //2. Remove a node from the linked list.
        linkedList.poll();
        System.out.println(linkedList);
        //3. Find and print the length of the linked list.
        System.out.println(linkedList.size());
        //4. Reverse the linked list.
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.add(i, linkedList.pollLast());
        }
        System.out.println(linkedList);
        //5. Print all elements of the linked list.
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}