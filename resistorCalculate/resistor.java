/*By     : Suman kumar ~BHUTUU
  Date   : 21-oct-2021
  Aim    : Resistor color code encoder and decoder.
           values must be taken from the user(through keyboard)
*/
package com.bhutuu;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int back=0, brown=1, red=2, orange=3, yellow=4, green=5, blue=6, violet=7, grey=8, white=9;
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
    if (opt == 1) {
      System.out.print("Enter the value of your resistor in ohm (only integer)=> ");
      int value=bhu.nextInt();
      String stValue=Integer.toString(value);
      if (stValue.length() == 1) {
        int a = value;
        String firstColor=colorDigit(a);
      } else if (stValue.length() == 2) {
        int a=Integer.valueOf(stValue.substring(0));
        String firstColor=colorDigit(a);
        a=Integer.valueOf(stValue.substring(1));
        String secondColor=colorDigit(a);
        System.out.println(firstColor+"\t"+secondColor);
      }
    }
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



/*
logic;
for value to colour code!
pahle hm vlaue lenge user se then uska firstt difit dekhnege.






   */
