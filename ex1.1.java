/*By       :  Suman kumar ~BHUTUU
  Date     :  16-10-2021
  Exercise :  1.1
  Aim      :  To find the percentage of marks in 5 subjects each
              of total marks 100. Obtained marks must be taken
	      from user (input through keyboard)
*/
package com.bhutuu;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    int sci, mat, hin, ss, eng, total=500, obt, per, con=100;
    String nam, stat;
    Scanner bhu = new Scanner(System.in);
    System.out.print("\n\033[37mEnter your name: ");
    nam = bhu.nextLine();
    System.out.println("\033[37mWelcome "+ nam +" in percentage calculator\033[00m\n");
    System.out.print("\n\033[32mEnter your marks in Science: \033[34m");
    sci = bhu.nextInt();
    System.out.print("\033[32mEnter your marks in Maths: \033[34m");
    mat = bhu.nextInt();
    System.out.print("\033[32mEnter your marks in Hindi: \033[34m");
    hin = bhu.nextInt();
    System.out.print("\033[32mEnter your marks in Social Science: \033[34m");
    ss = bhu.nextInt();
    System.out.print("\033[32mEnter your marks in English: \033[34m");
    eng = bhu.nextInt();
    obt = obt(sci, mat, hin, ss, eng);
    per = per(obt, total, con);
    if (per<33) {
      stat = "fail";
    } else {
      stat = "pass";
    }
    System.out.println("\033[32m_________________________________________________\033[00m");
    System.out.println("\033[32m|\033[36mSubjects\033[32m|\033[36m Total marks\033[32m|\033[36mObtained marks\033[32m|\033[36mPercentage\033[32m|\033[00m");
    System.out.println("\033[32m|\033[33m-----------------------------------------------\033[32m|\033[00m");
    System.out.println("\033[32m|\033[34mEnglish \033[32m|\033[37m    100     \033[32m|\033[37m    "+eng+"        \033[32m|\033[31m "+eng+"\033[35m%      \033[32m|\033[00m");
    System.out.println("\033[32m|        |            |              |          |\033[00m");
    System.out.println("\033[32m|\033[34mHindi   \033[32m|\033[37m    100     \033[32m|\033[37m    "+hin+"        \033[32m|\033[31m "+hin+"\033[35m%      \033[32m|\033[00m");
    System.out.println("\033[32m|        |            |              |          |\033[00m");
    System.out.println("\033[32m|\033[34mMaths   \033[32m|\033[37m    100     \033[32m|\033[37m    "+mat+"        \033[32m|\033[31m "+mat+"\033[35m%      \033[32m|\033[00m");
    System.out.println("\033[32m|        |            |              |          |\033[00m");
    System.out.println("\033[32m|\033[34mScience \033[32m|\033[37m    100     \033[32m|\033[37m    "+sci+"        \033[32m|\033[31m "+sci+"\033[35m%      \033[32m|\033[00m");
    System.out.println("\033[32m|        |            |              |          |\033[00m");
    System.out.println("\033[32m|\033[34mS.Sci   \033[32m|\033[37m    100     \033[32m|\033[37m    "+ss+"        \033[32m|\033[31m "+ss+"\033[35m%      \033[32m|\033[00m");
    System.out.println("\033[32m|\033[33m-----------------------------------------------\033[32m|\033[00m");
    System.out.println("\033[32m|\033[36mTotal marks:\033[35m "+obt+"     \033[32m|\033[36m Total percent:\033[35m"  +per+"\033[32m%       |\033[00m");
    System.out.println("\033[32m|\033[33m-----------------------------------------------\033[32m|\033[00m");
    System.out.println("\033[32m|\033[36mStatus: \033[35m"+ stat +"                                   \033[32m|\033[00m");
    System.out.println("\033[32m|———————————————————————————————————————————————|\033[00m");
  }
  public static int obt(int sci, int mat, int hin, int ss, int eng) {
    int obt = sci + mat + hin + ss + eng;
    return obt;
  }
  public static int per(int obt, int total, int con) {
    int per = (obt*con)/total;
    return per;
  }
}
