package Day9.Challenge2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1. Initialize an ArrayList with some String values.
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Samir", "Farid", "Wahid"));
        // 2. Add a new element to the end of the ArrayList.
        names.add("Ayman");
        names.add("Abdelilah");
        names.add("Choukri");
        //3. Remove an element from the ArrayList.
        names.remove(2);
        //4. Check if a specific element exists in the ArrayList.
        String checkName = "Ayman";
        boolean exist = names.contains(checkName);
        System.out.println("Q:Does "+checkName+" exist in the names list?\n A: "+exist);
        //5. Print all elements of the ArrayList.
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}