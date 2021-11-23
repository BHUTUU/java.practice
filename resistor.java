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

    \033[1;37m██████╗░███████╗░██████╗██╗░██████╗████████╗░█████╗░██████╗\033[0;00m
    \033[1;36m██╔══██╗██╔════╝██╔════╝██║██╔════╝╚══██╔══╝██╔══██╗██╔══██╗\033[0;00m
    \033[1;32m██████╔╝█████╗░░╚█████╗░██║╚█████╗░░░░██║░░░██║░░██║██████╔╝\033[0;00m
    \033[1;33m██╔══██╗██╔══╝░░░╚═══██╗██║░╚═══██╗░░░██║░░░██║░░██║██╔══██╗\033[0;00m
    \033[1;31m██║░░██║███████╗██████╔╝██║██████╔╝░░░██║░░░╚█████╔╝██║░░██║\033[0;00m
    \033[1;31m╚═╝░░╚═╝╚══════╝╚═════╝░╚═╝╚═════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝\033[0;00m
    \033[4;34m <<<--------------colour coder and decoder---------------->>>\033[0;00m

    """);
    System.out.println("""This program contains following options:

        01. value to colour code.
        02. colour code to value.""");
    System.out.print("Enter your option=> ");
    String opt=bhu.nextInt();
    if (opt == '01') {
      System.out.print("Enter the value of your resistor in ohm (only float)=> ");
      String value=bhu.nextFloat();
      //first=

    }
  }
}



/*
logic;
for value to colour code!
pahle hm vlaue lenge user se then uska firstt difit dekhnege.






   */
