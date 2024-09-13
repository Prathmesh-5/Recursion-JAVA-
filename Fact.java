// Factorial Program by using RECURSION
package Recursion;
import java.util.Scanner;

public class Fact {
     public static int factorial(int n){
          if(n==0) return 1;          // Base Case 
          return n*factorial(n-1);    // f(n)=n*f(n-1) ; Recurrence Relation

     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n: ");
          int n=sc.nextInt();
          int ans=factorial(n);
          System.out.println("The Factorial of "+n+" is : "+ans);

          sc.close();
     }
}
