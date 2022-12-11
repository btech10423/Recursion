import java.util.*;

public class Lastoccurence {
    public static int lasttoccurence(int arr[],int key,int i) {
        if (i==arr.length) {
            return -1;
        }
        int isfound = lasttoccurence(arr,key,i+1);
        if (isfound==-1 && arr[i]==key) {
            return i;
        }
        return isfound;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,3,5};
        System.out.print(lasttoccurence(arr,3,0));
    }
}


