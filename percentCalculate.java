package io.github.bhutuu.calculator;
import java.util.Scanner;
public class percentCalculate {
  public static void main(String[] args) {
    Float a, b, c, d, e, f ,g, h;
    Scanner input=new Scanner(System.in);
    System.out.print("Your marks in Maths: ");
    a=input.nextFloat();
    System.out.print("Your marks in Science: ");
    b=input.nextFloat();
    System.out.print("Your marks in English: ");
    c=input.nextFloat();
    System.out.print("Your marks in Hindi: ");
    d=input.nextFloat();
    System.out.print("Your marks in Social Science: ");
    e=input.nextFloat();
    g=a+b+c+d+e;
    h=(g/5); //here its calculating percentage i.e, (g/500)*100=(g/5)
    System.out.println("Total marks: "+g);
    System.out.println("Total percentage: "+h+"%");
  }
}
