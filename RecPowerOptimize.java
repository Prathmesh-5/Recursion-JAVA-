// OPTIMIZE SOLUTION
// Write a program to find p^q using Recursive Function 

package Recursion;
import java.util.Scanner;

public class RecPowerOptimize {
     public static int pow(int p,int q){
          if(q==0) return 1;
          else if(q%2==0) return pow(p,q/2)*pow(p,q/2);
          else return p*pow(p,q/2)*pow(p,q/2);
     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter p and q : ");
          int p=sc.nextInt();
          int q=sc.nextInt();
          int ans=pow(p,q);
          System.out.println(p+" raise to the power "+q+" is : "+ans);
          sc.close();
     }
}

/*
OUTPUT: 🚩

Enter p and q : 
4 3
4 raise to the power 3 is : 64

Process finished with exit code 0
*/
