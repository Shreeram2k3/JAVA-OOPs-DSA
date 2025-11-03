
public class sumOfdigits {

    public static int sod(int n )
    {
        if(n==0)return n;

        return n%10 + sod(n/10);
    }

    public static void main(String[] args) {

        int n = 12345;

        System.out.println(sod(n));
    }
}