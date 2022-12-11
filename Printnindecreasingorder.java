import java.util.*;

public class Printnindecreasingorder {
    public static void decn(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        decn(n - 1);
    }
    public static void main(String args[]) {
        int n = 10;
        decn(n);
    }
}
