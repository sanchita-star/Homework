//program to swap adjacent numbers from 1 to 9
import java.util.Arrays;

public class July1 {
    public static void swap(int arr[]) {
        int i = 0;
        while (i < arr.length - 1) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i =i + 2; 
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
