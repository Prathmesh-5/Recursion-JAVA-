// Given a number num ans a value n ; Print n multiples of num

package Recursion;
import java.util.Scanner;

public class RecMultiple {
     public static void multiple(int num,int n){
          if(n==0) return ;           // Base Case
          multiple(num,n-1);          // Recurrence relation : f(num,n-1)
          System.out.println(num*n);  // Self Work
      }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number :");
          int num=sc.nextInt();
          System.out.println("Enter number of terms: ");
          int n=sc.nextInt();
          System.out.println("The Multiple of "+num+" upto "+n+" terms : ");
          multiple(num,n);

          sc.close();
     }
}

/*
OUTPUT: 🚩

Enter number :
4
Enter number of terms: 
7
The Multiple of 4 upto 7 terms : 
4
8
12
16
20
24
28

*/
