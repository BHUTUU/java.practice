package com.bhutuu;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   double a, b, c, d, e, mean, zero, kine, simpl;
   Scanner bhu = new Scanner(System.in);
   System.out.print("Enter a: ");
   a = bhu.nextInt();
   System.out.print("Enter b: ");
   b = bhu.nextInt();
   System.out.print("Enter c: ");
   c = bhu.nextInt();
   System.out.print("Enter v or d: ");
   d = bhu.nextInt();
   System.out.print("Enter u: ");
   e = bhu.nextInt();
   mean=a/2-b/2;
   System.out.println("a-b/2 is equal to: " + mean );
   zero=b*b/2/a-2*c;
   System.out.println("((bsq-4ac)/2a) "+ zero);
   kine=d*d-e*e;
   System.out.println("v^2 - u^2 is equal to: "+ kine);
   simpl=a*b-d;
   System.out.println("ab - d is: "+ simpl);
  }
}
