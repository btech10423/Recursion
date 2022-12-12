import java.util.*;
public class Friendspairing {
    public static int friendspairing(int n) {
        if (n==1||n==2) {
            return n;
        }
        int fnm1 = friendspairing(n-1);
        int fnm2 = friendspairing(n-2);
        
        return fnm1 + (fnm2*(n-1));
    }
    public static void main(String args[]) {
        System.out.print(friendspairing(3));
    } 
}
