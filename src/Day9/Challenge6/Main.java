package Day9.Challenge6;

public class Main {
    public static void main(String[] args) {
        BinarySearch bS =new BinarySearch();
        int result = bS.binarySearch();
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}