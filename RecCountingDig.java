// Write a program to count all digits of an number by using Recursion

package Recursion;
import java.util.Scanner;

public class RecCountingDig {
     public static int counting(int count,int n){
          if(n<10) return count+1;          // Base Case
          return counting(count+1,n/10);    // Recurrence Relation : f(n)=f(n/10)
     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number : ");
          int n=sc.nextInt();
          int ans=counting(0,n);
          System.out.println("The number of digit in "+n+" is : "+ans);
          sc.close();
     }
}

/*
OUTPUT: 🚩

Enter number : 
25609
The number of digit in 25609 is : 5

Process finished with exit code 0
*/

