// Write a program to find nth FIBONACCI NUMBER by using RECURSION

package Recursion;
import java.util.Scanner;

public class RecFibonacci {
     public static int fib(int n){
          if(n==1 || n==2) return n-1;    // Base Case
          return fib(n-1)+fib(n-2);       // Recurrence Relation : f(n)=f(n-1)+f(n-2)

     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n: ");
          int n=sc.nextInt();
          int ans=fib(n);
          System.out.println("The "+n+"th wala fibnocci number hai : "+ans);

          sc.close();
     }
}
