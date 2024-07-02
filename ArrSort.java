import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        int[] arr={10,1,2,4,56,78,90};
        Arrays.sort(arr); //sorted using
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>0;i--)
        {
           for(int j=0;j<arr.length;j++)
           {
               if(arr[i]>arr[j])
               {
                   int temp;
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }

        }
        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}
