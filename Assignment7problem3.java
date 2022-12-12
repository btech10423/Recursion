import java.util.*;
public class  Assignment7problem3{
    public static int length(String str) {
        if (str.length()==0) {
            return 0;
        }
        return 1+length(str.substring(1));
    }
    public static void main(String args[]) {
     System.out.println(length("abcd"));
    }
}
