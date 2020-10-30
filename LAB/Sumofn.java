import java.util.*;
public class Sumofn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum = "+sum);
    }
    
}
