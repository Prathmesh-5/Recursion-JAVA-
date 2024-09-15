// Print the sum if n=5 then 1-2+3-4+5=3 is your ans.

package Recursion;
import java.util.Scanner;
public class RecAlternateSum {

     public static int summing(int n){
          if(n==0) return 0;
          else if(n%2==0)
               return summing(n-1)-n;
          else
          return summing(n-1)+n;

     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number: ");
          int n=sc.nextInt();
          int ans=summing(n);
          System.out.println("ans is : ");
          System.out.println(ans);
          sc.close();
     }
}

/*
OUTPUT: 🚩

Enter number: 
5
ans is : 
3

*/
