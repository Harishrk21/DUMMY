import java.util.Arrays;

public class ArrReverseOrder {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] rev =new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            rev[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(rev));
    }
}
