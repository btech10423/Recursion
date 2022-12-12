import java.util.*;
public class  Assignment7problem2{
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printdigits(int n) {
        if (n==0) {
            return;
        }
        int ld = n%10;
        printdigits(n/10);
        System.out.print(digits[ld]+" ");
    }
    public static void main(String args[]) {
        printdigits(1234);
     System.out.println();
    }
}