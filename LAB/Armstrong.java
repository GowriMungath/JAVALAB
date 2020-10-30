import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     System.out.println("Enter a number : ");
     int n = scan.nextInt();
          int c=0,r,temp;  
          temp=n;  
          while(n>0)  
          {  
          r=n%10;  
          n=n/10;  
          c=c+(r*r*r);  
          }  
          if(temp==c)  
          System.out.println("armstrong number");   
          else  
              System.out.println("Not armstrong number");   
         }  
      } 
    

