// Write a program to print first n-Natural number upto n by using RECURSION 

package Recursion;
import java.util.Scanner;

public class RecPrinting1TOn {
     public static void print(int n){
          if(n<1)
               return ;

          print(n-1);
          System.out.print(n+" ");
     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n: ");
          int n=sc.nextInt();

          print(n);
          sc.close();
     }
}

/*
OUTPUT : 🚩

Enter n: 
7
1 2 3 4 5 6 7 

Process finished with exit code 0
*/
