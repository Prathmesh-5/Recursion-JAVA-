// Given two numbers p and q , find the value of p^q using recursive function:

package Recursion;
import java.util.Scanner;

public class RecPower {
     public static int power(int p,int q){
         if(q==0) return 1;
          return p*power(p,q-1);
     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter p and q: ");
          int p=sc.nextInt();
          int q=sc.nextInt();

          int ans=power(p,q);
          System.out.println(p+" raise to the power "+q+" is : "+ans);

          sc.close();
     }
}

/*
OUTPUT: 🚩

Enter p and q: 
3 4
3 raise to the power 4 is : 81

Process finished with exit code 0
*/
