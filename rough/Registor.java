package io.github.bhutuu.resistor.rough;
import java.util.Scanner;
public class Resistor {
  public static void main(String[] args) {
    int band;
    String firstColor, secondColor, thirdColor, fourthColor;
    Scanner sc=new Scanner(System.in);
    Scanner bhu=new Scanner(System.in);
    System.out.print("Enter no. of bands: ");
    band=bhu.nextInt();
    sc.nextLine();
    if (band == 4) {
      System.out.print("first color: ");
      firstColor=sc.nextLine();
      System.out.print("second color: ");
      secondColor=sc.nextLine();
      System.out.print("third color: ");
      thirdColor=sc.nextLine();
      fourthColor="null";
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor);
      decodeMain(band, firstColor, secondColor, thirdColor, fourthColor);
      decodeMain(4, "red", "green", "yellow", "null");
    } else if (band == 5) {
      System.out.print("first color: ");
      firstColor=sc.nextLine();
      System.out.print("second color: ");
      secondColor=sc.nextLine();
      System.out.print("third color: ");
      thirdColor=sc.nextLine();
      System.out.print("fourth color: ");
      fourthColor=sc.nextLine();
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
      decodeMain(band, firstColor, secondColor, thirdColor, fourthColor);
      decodeMain(band, "red", "green", "yellow", "orange");
    }
  }
  public static int decodeMain(int band, String firstColor, String secondColor, String thirdColor, String fourthColor) {
    String colorName="null"; //here i have given value "null" just to initialise the variables
    int firstDigit, secondDigit;
    if (band == 4) {
      colorName=firstColor;
      firstDigit=significantDigit(colorName);
      colorName=secondColor;
      secondDigit=significantDigit(colorName);
      colorName=thirdColor;
      String thirdDigit=multiplierDigit(colorName);
      //calculations------->
      String var1=Integer.toString(firstDigit);
      String var2=Integer.toString(secondDigit);
      String var3=var1+var2;
      long significantDigit=Long.valueOf(var3);
      if (thirdDigit == "p" || thirdDigit == "pp") {
        System.out.println("[!] Sorry but this program is under developement!");
      } else {
        long multiplierDigit=Long.valueOf(thirdDigit);
        String resistorValue=resistorValue(significantDigit, multiplierDigit);
        //graphicalViewFourColorBand(firstColor, secondColor, thirdColor);
        System.out.println("RESISTOR VALUE: "+resistorValue);
      }
    } else if (band == 5) {
      colorName=firstColor;
      firstDigit=significantDigit(colorName);
      colorName=secondColor;
      secondDigit=significantDigit(colorName);
      colorName=thirdColor;
      int thirdDigit=significantDigit(colorName);
      colorName=fourthColor;
      String fourthDigit=multiplierDigit(colorName);
      //calculation------->
      String var1=Integer.toString(firstDigit);
      String var2=Integer.toString(secondDigit);
      String var3=Integer.toString(thirdDigit);
      String var4=var1+var2+var3;
      long significantDigit=Long.valueOf(var4);
      if (fourthDigit == "p" || fourthDigit == "pp") {
        System.out.println("[!] sorry but this program is under development");
      } else {
        long multiplierDigit=Long.valueOf(fourthDigit);
        String resistorValue=resistorValue(significantDigit, multiplierDigit);
        //graphicalViewFiveColorBand(firstColor, secondColor, thirdColor, fourthColor);
        System.out.println("RESISTOR VALUE: "+resistorValue);
      }
    }
    return 0;
  }
  public static int significantDigit(String colorName) {
    int digitValue=0; // here i have given value 0 just to initialise the variable digitValue.
    if (colorName == "black") {
      digitValue=0;
    } else if (colorName == "brown") {
      digitValue=1;
    } else if (colorName == "red") {
      digitValue=2;
    } else if (colorName == "orange") {
      digitValue=3;
    } else if (colorName == "yellow") {
      digitValue=4;
    } else if (colorName == "green") {
      digitValue=5;
    } else if (colorName == "blue") {
      digitValue=6;
    } else if (colorName == "violet") {
      digitValue=7;
    } else if (colorName == "grey") {
      digitValue=8;
    } else if (colorName == "white") {
      digitValue=9;
    }
    return digitValue;
  }
  public static String multiplierDigit(String colorName) {
    String digitValue="0"; //here i have given value 0 just to initialise the variable digitvalue.
    if (colorName == "black") {
      digitValue="1";
    } else if (colorName == "brown") {
      digitValue="10";
    } else if (colorName == "red") {
      digitValue="100";
    } else if (colorName == "orange") {
      digitValue="1000";
    } else if (colorName == "yellow") {
      digitValue="10000";
    } else if (colorName == "green") {
      digitValue="100000";
    } else if (colorName == "blue") {
      digitValue="1000000";
    } else if (colorName == "violet") {
      digitValue="10000000";
    } else if (colorName == "silver") {
      digitValue="pp";
    } else if (colorName == "gold") {
      digitValue="p";
    }
    return digitValue;
  }
  public static String resistorValue(long significantDigit, long multiplierDigit) {
    String resistorValue="a"; //i have given here the value "a" just to initialise the variable
    long var1;//similaraly here :)
    if (multiplierDigit == 1) {
      var1=significantDigit*multiplierDigit;
      resistorValue=Long.toString(var1)+" Ohm";
    } else if (multiplierDigit == 10) {
      var1=significantDigit*multiplierDigit;
      resistorValue=Long.toString(var1)+" Ohm";
    } else if (multiplierDigit == 100) {
      var1=significantDigit*multiplierDigit;
      resistorValue=Long.toString(var1)+" Ohm";
    } else if (multiplierDigit == 1000) {
      var1=significantDigit;
      resistorValue=Long.toString(var1)+" KiloOhm";
    } else if (multiplierDigit == 10000) {
      var1=significantDigit*10;
      resistorValue=Long.toString(var1)+" KiloOhm";
    } else if (multiplierDigit == 100000) {
      var1=significantDigit*100;
      resistorValue=Long.toString(var1)+" KiloOhm";
    } else if (multiplierDigit == 1000000) {
      var1=significantDigit;
      resistorValue=Long.toString(var1)+" MegaOhm";
    } else if (multiplierDigit == 10000000) {
      var1=significantDigit*10;
      resistorValue=Long.toString(var1)+" MegaOhm";
    } else {
      System.out.println("[!] Out of range!");
    }
    return resistorValue;
  }
}

