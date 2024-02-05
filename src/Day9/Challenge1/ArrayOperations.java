package Day9.Challenge1;

import java.util.Arrays;
public class ArrayOperations {
    //1. Initialize an array with values.
    int[] num = {47, 21, 313};
    //2. Find and print the sum of all elements in the array.
    int sum;
    public void sum() {
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }
    int max=num[0];
    int min=num[0];
    public void minMax(){
        for (int i = 1; i < num.length; i++) {
            if (num[i]>max) {
                max=num[i];
            }
            if (num[i]<min) {
                min=num[i];
            }
        }
        System.out.println("Maximum value in the array: "+max);
        System.out.println("Minimum value in the array: "+min);
    }
    public void reverseArray(){
        int i=0;
        int j=num.length-1;
        while(i<j){
            int  empty=num[i];
            num[i]=num[j];
            num[j]=empty;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(num));
    }
}