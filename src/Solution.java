import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        // populate
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextLong();
        }
        long[] results = new long[5];
        for (int i = 0; i < 5; i++) {
            long holder = arr[i]; // place holder to save array value
            arr[i] = 0; // zero out element to exclude from calculation
            results[i] = LongStream.of(arr).sum();
            arr[i] = holder;
        }
        Arrays.sort(results);
        for (long big :
                results) {
            //System.out.println(big);
        }
        System.out.println(results[0] + " " + results[4]);


    }
}