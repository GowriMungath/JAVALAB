import java.util.*;
public class Primeornot {
    public static void main(String[] args) {
        int flag=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a = scan.nextInt();
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                flag=0;
                break;

            }
            
        }
        if(flag==1)
        {
            System.out.println("PRIME NUMBER");
        }
        else if(flag==0)
        {
            System.out.println("NOT A PRIME NUMBER");
        }
    }
    
}
