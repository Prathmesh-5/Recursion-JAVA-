//BEST SOLUTION:
// Write a program to find p raise to the power q :
// Time Complexity = O(log(q)) 

package Recursion;
import java.util.Scanner;

public class RecBestOfPower {
     public static int power(int p,int q){
          if(q==0) return 1;
          int x=power(p,q/2);
          if(q%2==0)
               return x*x;
          else
               return p*x*x;
     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter p and q : ");
          int p=sc.nextInt();
          int q=sc.nextInt();
          int ans=power(p,q);
          System.out.println(p+" raise to the power "+q+" is : "+ans);
          sc.close();
     }
}

/*
OUTPUT: 🚩

Enter p and q : 
4 4
4 raise to the power 4 is : 256

*/
