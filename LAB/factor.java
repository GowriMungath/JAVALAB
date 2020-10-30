import java.util.*;
public class factor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = scan.nextInt();
        System.out.println("Factors:");
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.println(i);
            }
        }
    }
}