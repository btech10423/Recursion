import java.util.*;
public class Optimizedpower {
    public static int optimizedpower(int x,int n) {
        if (n==0) {
            return 1;
        }
        int hp = optimizedpower(x,n/2);
        int hq = hp*hp;
        if(n%2!=0){
            hq = hq*x;
        }
        return hq;
    }
    public static void main(String args[]) {
        System.out.print(optimizedpower(3,2));
    } 
}