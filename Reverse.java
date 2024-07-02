public class Reverse {
    public static void main(String[] args) {
        StringBuilder a =new StringBuilder("harish is a good boy");
        System.out.println(a);
        StringBuilder b=new StringBuilder();
        for(int i= a.length()-1;i>=0;i--)
        {
          b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
