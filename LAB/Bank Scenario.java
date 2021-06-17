import java.io.*;
import java.util.*;
public class Main
{
    public static void main (String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        customer c = new customer();
        auditor a = new auditor();
        System.out.println("INDIAN OVERSEAS BANK");
        System.out.println("Enter choice : \n1.Customer\n2.Auditor\n ");
        int ch = sc.nextInt();
        if(ch==1)
        {
            System.out.print("Amount to be deposited : ");
            float am = sc.nextFloat();
            c.deposit(am);
            System.out.print("Amount to be withdrawn : ");
            float wt = sc.nextFloat();
            c.withdraw(wt);
        }
        else if(ch==2)
        {
            a.verify();
        }
        
    }
}
class customer
{
    float amount = 0;
    float account = 0;
    void deposit(float amt)
    {
        account+=amt;
        balance(account);
    }
    void withdraw(float amt)
    {
       account = account - amt;
        balance(account);
    }
    void balance(float amo)
    {
        System.out.printf("Balance : %f\n",amo);
    }
}
class auditor
{
    int asset = 10000000;
    void verify()
    {
        System.out.printf("ASSET : %d",asset);
    }
}
