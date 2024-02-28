import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arr[]={9,8,7,6,4,3,1};
        int[] sortedarray=merge.sort(arr);
        System.out.println(Arrays.toString(sortedarray));
        System.out.println("Hello world!");
        merge.sortinplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));



    }
}