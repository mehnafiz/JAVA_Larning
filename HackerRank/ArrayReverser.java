import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverser {

    // Method to reverse the array
    public static int[] reverseArray(int[] a) {


        int start = 0;
        int end = a.length - 1;
        
        while (start < end) {
            // Swap elements
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            
            // Move pointers
            start++;
            end--;
        }
        
        return a;
    }

    // Main method to test the implementation
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        // Test case 1
        int[] arr1 = new int[size];
        for(int i = 0 ; i < size ; i ++){
            arr1[i] = sc.nextInt();
        }
        
        int[] reversed1 = reverseArray(arr1);
        System.out.println(Arrays.toString(reversed1));
        sc.close();
    }

}