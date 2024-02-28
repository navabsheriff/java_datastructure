import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr={9,7,6,5,4,3,2,1};
        quicksort.quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}