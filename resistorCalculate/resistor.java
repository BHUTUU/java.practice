/*By     : Suman kumar ~BHUTUU
  Date   : 21-oct-2021
  Aim    : Resistor color code encoder and decoder.
           values must be taken from the user(through keyboard)
*/
package com.bhutuu;
import java.util.Scanner;

public class ResistorColorCode {
  public static void main(String[] args) {
    int a, back=0, brown=1, red=2, orange=3, yellow=4, green=5, blue=6, violet=7, grey=8, white=9;
    String firstColor, secondColor, thirdColor, fourthColor,  stValue, value;
    Scanner bhu = new Scanner(System.in);
    System.out.println("""

      Welcome to ~

	|    \033[1;37m██████╗░███████╗░██████╗██╗░██████╗████████╗░█████╗░██████╗\033[0;00m      |
	|    \033[1;36m██╔══██╗██╔════╝██╔════╝██║██╔════╝╚══██╔══╝██╔══██╗██╔══██╗\033[0;00m     |
	|    \033[1;32m██████╔╝█████╗░░╚█████╗░██║╚█████╗░░░░██║░░░██║░░██║██████╔╝\033[0;00m     |
	|    \033[1;33m██╔══██╗██╔══╝░░░╚═══██╗██║░╚═══██╗░░░██║░░░██║░░██║██╔══██╗\033[0;00m     |
	|    \033[1;31m██║░░██║███████╗██████╔╝██║██████╔╝░░░██║░░░╚█████╔╝██║░░██║\033[0;00m     |
	|    \033[1;31m╚═╝░░╚═╝╚══════╝╚═════╝░╚═╝╚═════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝\033[0;00m     |
	|    \033[4;34m <<<--------------colour coder and decoder---------------->>>\033[0;00m    |

    """);
    System.out.println("""
        This program contains following options:

        01. value to colour code.
        02. colour code to value.
    """);
    System.out.print("Enter your option=> ");
    int opt=bhu.nextInt();
    encoder(opt);
  }
  public static int encoder(int opt) {
    String firstColor, secondColor, thirdColor, fourthColor,  stValue, value;
    Scanner st= new Scanner(System.in);
    if (opt == 1) {
      System.out.print("Enter the value of your resistor(specify M or k or o)=> ");
      value=st.nextLine();
      int n=value.length();
      char ex=value.charAt(n-1);
      long numericalValue=Long.valueOf(value.substring(0, n-1));
      if (ex == 'M') {
        Long two=(numericalValue*1000000);
        stValue=Long.toString(two);
        evaluatColor(stValue);
      } else if (ex == 'k' || ex == 'K') {
        Long two=(numericalValue*1000);
        stValue=Long.toString(two);
        evaluatColor(stValue);
      } else if (ex == 'o' || ex == 'O') {
        stValue=Long.toString(numericalValue);
        evaluatColor(stValue);
      } else {
        System.out.println("Enter with a valid unit! either o or k");
      }
    }
    return 0;
  }
  public static String evaluatColor(String stValue) {
    int a, back=0, brown=1, red=2, orange=3, yellow=4, green=5, blue=6, violet=7, grey=8, white=9;
    String firstColor, secondColor, thirdColor, fourthColor, thirdColorI="null", fourthColorI="null";
    if (stValue.length() == 1) {
      a=Integer.valueOf(stValue);
      firstColor="black";
      secondColor=colorDigit(a);
      thirdColor="black";
      fourthColor="null";
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
    } else if (stValue.length() == 2) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a); //never black
      a=Integer.valueOf(stValue.substring(1));
      secondColor=colorDigit(a);
      thirdColor="black";
      fourthColor="null";
    } else if (stValue.length() == 3) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a); //never black
      a=Integer.valueOf(stValue.substring(1, 2));
      secondColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(2, 3));
      if (a == 0) {
        thirdColor="brown";
        fourthColor="null";
      } else {
        thirdColor=colorDigit(a);
        fourthColor="black";
      }
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
    } else if (stValue.length() == 4) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a); //never black
      a=Integer.valueOf(stValue.substring(1, 2));
      secondColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(3, 4));
      if (a > 0) {
        firstColor="Error";
        secondColor="Error";
        thirdColor="Error";
        fourthColor="Error";
      } else {
        a=Integer.valueOf(stValue.substring(2, 3));
        if (a == 0) {
          //for fourBand resistors! fourth band is of tolerance (not consideres in this program)
          thirdColor="red";
          fourthColor="null";
          //for fiveBand resistors! fifth band is of tolerance (not considered in this program)
          thirdColorI=colorDigit(a);
          fourthColorI="brown";
        } else {
          thirdColor=colorDigit(a);
          fourthColor="brown";
        }
      }
      System.out.println("fourBand resistor:\n"+firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
      System.out.println("\n\nfiveBand resistor:\n"+firstColor+"\t"+secondColor+"\t"+thirdColorI+"\t"+fourthColorI);
    } else if (stValue.length() == 5) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(1, 2));
      secondColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(3, 5));
      if (a > 0) {
        firstColor="Error";
        secondColor="Error";
        thirdColor="Error";
        fourthColor="Error";
      } else {
        a=Integer.valueOf(stValue.substring(2, 3));
        if (a == 0) {
          thirdColor="orange";
          fourthColor="null";
          //for fiveBand resistors! fifth band is of tolerance (not considered in this program)
          thirdColorI=colorDigit(a);
          fourthColorI="red";
        } else {
          thirdColor=colorDigit(a);
          fourthColor="red";
        }
      }
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
      System.out.println("\n\nfiveBand resistor:\n"+firstColor+"\t"+secondColor+"\t"+thirdColorI+"\t"+fourthColorI);
    } else if (stValue.length() == 6) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(1, 2));
      secondColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(3, 6));
      if (a > 0) {
        firstColor="Error";
        secondColor="Error";
        thirdColor="Error";
        fourthColor="Error";
      } else {
        a=Integer.valueOf(stValue.substring(2, 3));
        if (a == 0) {
          thirdColor="yellow";
          fourthColor="null";
          //for fiveBand resistors! fifth band is of tolerance (not considered in this program)
          thirdColorI=colorDigit(a);
          fourthColorI="orange";
        } else {
          thirdColor=colorDigit(a);
          fourthColor="orange";
        }
      }
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
      System.out.println("\n\nfiveBand resistor:\n"+firstColor+"\t"+secondColor+"\t"+thirdColorI+"\t"+fourthColorI);
    } else if (stValue.length() == 7) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(1, 2));
      secondColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(3, 7));
      if (a > 0) {
        firstColor="Error";
        secondColor="Error";
        thirdColor="Error";
        fourthColor="Error";
      } else {
        a=Integer.valueOf(stValue.substring(2, 3));
        if (a == 0) {
          thirdColor="green";
          fourthColor="null";
          //for fiveBand resistors! fifth band is of tolerance (not considered in this program)
          thirdColorI=colorDigit(a);
          fourthColorI="yellow";
        } else {
          thirdColor=colorDigit(a);
          fourthColor="yellow";
        }
      }
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
      System.out.println("\n\nfiveBand resistor:\n"+firstColor+"\t"+secondColor+"\t"+thirdColorI+"\t"+fourthColorI);
    } else if (stValue.length() == 8) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(1, 2));
      secondColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(3, 8));
      if (a > 0) {
        firstColor="Error";
        secondColor="Error";
        thirdColor="Error";
        fourthColor="Error";
      } else {
        a=Integer.valueOf(stValue.substring(2, 3));
        if (a == 0) {
          thirdColor="blue";
          fourthColor="null";
          //for fiveBand resistors! fifth band is of tolerance (not considered in this program)
          thirdColorI=colorDigit(a);
          fourthColorI="green";
        } else {
          thirdColor=colorDigit(a);
          fourthColor="green";
        }
      }
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
      System.out.println("\n\nfiveBand resistor:\n"+firstColor+"\t"+secondColor+"\t"+thirdColorI+"\t"+fourthColorI);
    } else if (stValue.length() == 9) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(1, 2));
      secondColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(3, 9));
      if (a > 0) {
        firstColor="Error";
        secondColor="Error";
        thirdColor="Error";
        fourthColor="Error";
      } else {
        a=Integer.valueOf(stValue.substring(2, 3));
        if (a == 0) {
          thirdColor="violet";
          fourthColor="null";
          //for fiveBand resistors! fifth band is of tolerance (not considered in this program)
          thirdColorI=colorDigit(a);
          fourthColorI="blue";
        } else {
          thirdColor=colorDigit(a);
          fourthColor="blue";
        }
      }
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
      System.out.println("\n\nfiveBand resistor:\n"+firstColor+"\t"+secondColor+"\t"+thirdColorI+"\t"+fourthColorI);
    } else if (stValue.length() == 10) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(1, 2));
      secondColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(3, 10));
      if (a > 0) {
        firstColor="Error";
        secondColor="Error";
        thirdColor="Error";
        fourthColor="Error";
      } else {
        a=Integer.valueOf(stValue.substring(2, 3));
        if (a == 0) {
          thirdColor="grey";
          fourthColor="null";
          //for fiveBand resistors! fifth band is of tolerance (not considered in this program)
          thirdColorI=colorDigit(a);
          fourthColorI="violet";
        } else {
          thirdColor=colorDigit(a);
          fourthColor="violet";
        }
      }
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
      System.out.println("\n\nfiveBand resistor:\n"+firstColor+"\t"+secondColor+"\t"+thirdColorI+"\t"+fourthColorI);
    } else if (stValue.length() == 11) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(1, 2));
      secondColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(3, 11));
      if (a > 0) {
        firstColor="Error";
        secondColor="Error";
        thirdColor="Error";
        fourthColor="Error";
      } else {
        a=Integer.valueOf(stValue.substring(2, 3));
        if (a == 0) {
          thirdColor="white";
          fourthColor="null";
          //for fiveBand resistors! fifth band is of tolerance (not considered in this program)
          thirdColorI=colorDigit(a);
          fourthColorI="grey";
        } else {
          thirdColor=colorDigit(a);
          fourthColor="grey";
        }
      }
      System.out.println(firstColor+"\t"+secondColor+"\t"+thirdColor+"\t"+fourthColor);
      System.out.println("\n\nfiveBand resistor:\n"+firstColor+"\t"+secondColor+"\t"+thirdColorI+"\t"+fourthColorI);
    } else if (stValue.length() == 12) {
      a=Integer.valueOf(stValue.substring(0, 1));
      firstColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(1, 2));
      secondColor=colorDigit(a);
      a=Integer.valueOf(stValue.substring(3, 12));
      if (a > 0) {
        firstColor="Error";
        secondColor="Error";
        thirdColor="Error";
        fourthColor="Error";
      } else {
        a=Integer.valueOf(stValue.substring(2, 3));
        if (a == 0) {
          thirdColor="null";
          fourthColor="null";
          //for fiveBand resistors! fifth band is of tolerance (not considered in this program)
          thirdColorI=colorDigit(a);
          fourthColorI="white";
        } else {
          thirdColor=colorDigit(a);
          fourthColor="white";
        }
      }
    } else {
      System.out.println("Out of range........!!");
    }
    return stValue;
  }
  public static String colorDigit(int a) {
    String colorDigit="a"; //i put here "a" just to initialise the variable colorDigit.
    if (a == 0) {
      colorDigit="black";
    } else if (a == 1) {
      colorDigit="brown";
    } else if (a == 2) {
      colorDigit="red";
    } else if (a == 3) {
      colorDigit="orange";
    } else if (a == 4) {
      colorDigit="yellow";
    } else if (a == 5) {
      colorDigit="green";
    } else if (a == 6) {
      colorDigit="blue";
    } else if (a == 7) {
      colorDigit="violet";
    } else if (a == 8) {
      colorDigit="grey";
    } else if (a == 9) {
      colorDigit="white";
    } else {
      System.out.println("This situation doesn't exists lol!!");
    }
    return colorDigit;
  }
}
