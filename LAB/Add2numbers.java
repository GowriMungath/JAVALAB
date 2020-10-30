import java.util.*;
public class Add2numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 Numbers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
        System.out.println("Sum = "+c);
    }
}
