import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int f=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            f = f*i;
        }
        System.out.println("Factorial = "+f);
    }
}
