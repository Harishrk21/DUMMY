public class arrays {
    public static void main(String[] args) {
        int[] a = {10, 50, 45, 67, 80};
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        // Printing the sorted array
       
        for(int pr :a)
        {
            System.out.println(pr);
        }
    }
}
