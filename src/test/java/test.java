import java.util.Scanner;

/**
 * Created by xjl on 2017/2/15.
 */
public class test {
    public static void main(String[] args) {
        separateIntoItems(new Scanner(System.in).nextLong());
    }
    public static void separateIntoItems(long n) {
        if (n <= 2) {
            System.out.println("NULL");
            return;
        }
        double max = Math.pow(2, 64);
        if ((double) n > max) {
            System.out.println("NULL");
            return;
        }
        boolean isExist = false;
        // a1 is the first number
        for (int a1 = 1; a1 <= n / 2; a1++) {
            // a2 is the last number
            for (int a2 = a1 + 1; a2 < n; a2++) {
                // if exist output the result
                if ((a1 + a2) * (a2 - a1 + 1) == n * 2) {
                    isExist = true;
                    System.out.print(a1);
                    for (int t = a1 + 1; t <= a2; t++) {
                        System.out.print(" " + t);
                    }
                    System.out.println();
                }
            }
        }
        if (!isExist) {
            System.out.println("NULL");
        }
    }
}
