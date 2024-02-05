package Day9.Challenge6;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    Scanner sc = new Scanner(System.in);

    char letter;
    int result;
    public int binarySearch() {
        char[] a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        System.out.println(a);
        Arrays.sort(a);
        System.out.println(a);
        System.out.print("Enter a Letter: ");
        letter = sc.next().charAt(0);
        int low = 0;
        int high = a.length-1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (a[mid]>letter){
                high = mid - 1;
            }else if(a[mid]<letter){
                low = mid + 1;
            }
            else{
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }
    public void result(int result) {
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}