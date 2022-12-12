import java.util.*;
public class Tilingfloor {
    public static int tilingfloor(int n) {
        if (n==0||n==1) {
            return 1;
        }
        int fnm1 = tilingfloor(n-1);
        int fnm2 = tilingfloor(n-2);
        
        return fnm1+fnm2;
    }
    public static void main(String args[]) {
        System.out.print(tilingfloor(4));
    } 
}
