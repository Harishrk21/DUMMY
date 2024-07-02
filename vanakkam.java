import java.util.Arrays;

public class vanakkam
{
    public static void main(String[] args) {
        int[] arr=new int[]{22,3,45,6,78,21};
        System.out.println("before sorting"+Arrays.toString(arr));
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        System.out.println("after sorting:"+Arrays.toString(arr));
        if(arr.length>1)
        {
            int Secondsmallest= arr[1];
            System.out.println("The second smallest element is :"+Secondsmallest);
        }
    }
}