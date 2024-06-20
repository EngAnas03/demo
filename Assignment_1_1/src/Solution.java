import java.io.*;
        import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] array = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // Your code starts here
        int insertPos = 0;

        for (int num : array) {
            if (num != 0) {
                array[insertPos++] = num;
            }
        }

        while (insertPos < n) {
            array[insertPos++] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        // Your code ends here

        bufferedReader.close();
    }
}