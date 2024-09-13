// Write a program to all fibonacci number fom n1 term to n2 term , where n1 and n2 are taken from user by using RECURSION 

package Recursion;
import java.util.Scanner;

public class RecursionFibonacci {
     public static int fib(int i){
          if(i==1 || i==2) return i-1;
          return fib(i-1)+fib(i-2);
     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n1 and n2 : ");
          int n1=sc.nextInt();
          int n2=sc.nextInt();
          for(int i=n1;i<=n2;i++){
               System.out.print(fib(i)+" ");
          }

          sc.close();
     }
}
