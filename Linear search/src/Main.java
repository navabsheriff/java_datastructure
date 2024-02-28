import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr={1,2,3,4,5,8};
        String str="hello";
        System.out.println(linear.find(arr,0));
        System.out.println(linear.contail(arr,1));
        System.out.println(linear.find(str,'h'));
        int[][] two={
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };
        System.out.println(Arrays.toString(linear.find(two,3)));

    }

}