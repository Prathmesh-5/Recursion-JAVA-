// BRUTE FORCE APPROACH
// Finding GCD by Recursive function
// Time Complexity = O(min.(n1,n2))

package Recursion;
import java.util.Scanner;

public class RecGcd1 {
     public static int find(int x,int n1,int n2){
          if(n1%x==0 && n2%x==0)
               return x;
          return find(x-1,n1,n2);
     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n1 and n2");
          int n1=sc.nextInt();
          int n2=sc.nextInt();
          int x;
          if(n1<=n2) x=n1;
          else x=n2;
          int ans=find(x,n1,n2);
          System.out.println(ans);

          sc.close();
     }
}

/*
OUTPUT: 🚩
Enter n1 and n2
16 12
4
*/
