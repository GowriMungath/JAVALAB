import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int p=0;
        int r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        while(n!=0)
        {
          r = n%10;
          p=p*10+r;
          n=n/10;

        }
        System.out.println(p);
    }

}
