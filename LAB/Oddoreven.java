import java.util.*;
public class Oddoreven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER NUMBER : ");
        int a = scan.nextInt();
        if(a%2==0)
        {
            System.out.println(a+" is even");
        }
        else
        {
            System.out.println(a+" is odd");
        }
    }

    
}
