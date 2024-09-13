// Write a program to find Sum Of Digits of a number by using RECURSION 

package Recursion;
import java.util.Scanner;

public class RecDigitSum {
     public static int digit(int n){
          if(n<10) return n;           // Base Case

          return (n%10)+digit(n/10);   // Recurrence Relation : f(n)=(n%10)+f(n/10
     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number: ");
          int n=sc.nextInt();
          int ans=digit(n);
          System.out.println("The sum all digits of "+n+" is : "+ans);

          sc.close();
     }
}

/*
OUTPUT: 🚩

Enter number: 
307033
The sum all digits of 307033 is : 16

Process finished with exit code 0
*/
