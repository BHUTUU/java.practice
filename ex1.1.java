/*By       :  Suman kumar ~BHUTUU
  Date     :  16-10-2021
  Exercise :  1.1
  Aim      :  To find the percentage of marks in 5 subjects each
              of total marks 100. Obtained marks must be taken
	      from user (input through keyboard)
*/
package com.bhutuu;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String args[]) {
    int sci, mat, hin, ss, eng, total=500, obt, per, con=100, lnam, gap, lin=31;
    float cgcon=9.5f, cgpa, cgpf;
    String nam, stat, mpp, spp, sspp, epp, hpp, vobt, vper, vcgpa;
    ExecuteShellCommand com = new ExecuteShellCommand();
    Scanner bhu = new Scanner(System.in);
    System.out.print("\n\033[37mEnter your name: ");
    nam = bhu.nextLine();
    lnam=nam.length();
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
    cgpa = cgpa(per, cgcon);
    gap = lin - lnam;
    spp="";
    hpp="";
    epp="";
    sspp="";
    mpp="";
    vobt="";
    vper="";
    vcgpa=" ";
    if (sci<10) {
      spp="00";
    }
    if (mat<10) {
      mpp="00";
    }
    if (eng<10) {
      epp="00";
    }
    if (hin<10) {
      hpp="00";
    }
    if (ss<10) {
      sspp="00";
    }
    if (sci>=10) {
      if (sci<100) {
        spp="0";
      } else if (sci==100) {
        spp="";
        }
    }
    if (mat>=10){
      if (mat<100) {
        mpp="0";
      } else if (mat==100) {
        mpp="";
        }
    }
    if (eng>=10) {
      if (eng<100) {
        epp="0";
      } else if (eng==100) {
        epp="";
        }
    }
    if (hin>=10) {
      if (hin<100) {
        hpp="0";
      } else if (hin==100) {
        hpp="";
        }
    }
    if (ss>=10) {
      if (ss<100) {
        sspp="0";
      } else if (ss==100){
        sspp="";
        }
    }
    if (per<33) {
      stat = "fail";
    } else {
      stat = "pass";
    }
    if (obt<10) {
    vobt="00";
    } else if (obt>=10) {
      if (obt<100) {
      vobt="0";
      }
    }else {
      vobt="";
    }
    if (per<10) {
    vper="00";
    } else if (per>=10) {
      if (per<100) {
      vper="0";
      }
    }else {
      vper="";
    }
    if (cgpa>=10) {
      cgpa=10.00000f;
      vcgpa="";
    }
    System.out.print("\n\n\033[35mPreparing result sheet.");
    System.out.print(com.executeCommand("sleep 0.25"));
    System.out.print("\033[35m.");
    System.out.print(com.executeCommand("sleep 0.25"));
    System.out.print("\033[35m.");
    System.out.print(com.executeCommand("sleep 0.25"));
    System.out.print("\033[35m.");
    System.out.print(com.executeCommand("sleep 0.25"));
    System.out.print("\033[35m.");
    System.out.print(com.executeCommand("sleep 0.25"));
    System.out.print("\033[35m.");
    System.out.print(com.executeCommand("sleep 0.25"));
    System.out.print("\033[35m.");
    System.out.println(com.executeCommand("sleep 0.25"));
    System.out.print(com.executeCommand("clear"));
    System.out.println("\033[32m—————————————————————————————————————————————————\033[00m");
    System.out.print("\033[32m| \033[36mStudent's Name:\033[37m "+nam);
    int i = 1;
    while(i<gap) {
    System.out.print(" ");
    i +=1;
    }
    System.out.println("\033[32m|");
    System.out.println("\033[32m_________________________________________________\033[00m");
    System.out.println("\033[32m|\033[36mSubjects\033[32m|\033[36m Total marks\033[32m|\033[36mObtained marks\033[32m|\033[36mPercentage\033[32m|\033[00m");
    System.out.println("\033[32m|\033[33m-----------------------------------------------\033[32m|\033[00m");
    System.out.println("\033[32m|\033[34mEnglish \033[32m|\033[37m    100     \033[32m|\033[37m    "+epp+eng+"       \033[32m|\033[31m "+epp+eng+"\033[35m%     \033[32m|\033[00m");
    System.out.println("\033[32m|        |            |              |          |\033[00m");
    System.out.println("\033[32m|\033[34mHindi   \033[32m|\033[37m    100     \033[32m|\033[37m    "+hpp+hin+"       \033[32m|\033[31m "+hpp+hin+"\033[35m%     \033[32m|\033[00m");
    System.out.println("\033[32m|        |            |              |          |\033[00m");
    System.out.println("\033[32m|\033[34mMaths   \033[32m|\033[37m    100     \033[32m|\033[37m    "+mpp+mat+"       \033[32m|\033[31m "+mpp+mat+"\033[35m%     \033[32m|\033[00m");
    System.out.println("\033[32m|        |            |              |          |\033[00m");
    System.out.println("\033[32m|\033[34mScience \033[32m|\033[37m    100     \033[32m|\033[37m    "+spp+sci+"       \033[32m|\033[31m "+spp+sci+"\033[35m%     \033[32m|\033[00m");
    System.out.println("\033[32m|        |            |              |          |\033[00m");
    System.out.println("\033[32m|\033[34mS.Sci   \033[32m|\033[37m    100     \033[32m|\033[37m    "+sspp+ss+"       \033[32m|\033[31m "+sspp+ss+"\033[35m%     \033[32m|\033[00m");
    System.out.println("\033[32m|\033[33m-----------------------------------------------\033[32m|\033[00m");
    System.out.println("\033[32m|\033[36mTotal marks:\033[35m "+vobt+obt+"     \033[32m|\033[36m Total percent:\033[35m "  +vper+per+"\033[32m%     |\033[00m");
    System.out.println("\033[32m|\033[33m-----------------------------------------------\033[32m|\033[00m");
    System.out.print("\033[32m|\033[36mStatus: \033[35m"+ stat +"         \033[32m| \033[36mCGPA: \033[31m ");
    System.out.printf("%.6f",cgpa);
    System.out.println(" \033[37mcgpa"+vcgpa+"   \033[32m|\033[00m");
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
  public static float cgpa(int per, float cgcon) {
    float cgpa = per/cgcon;
    return cgpa;
  }
}


public class ExecuteShellCommand {

public String executeCommand(String command) {

    StringBuffer output = new StringBuffer();

    Process p;
    try {
        p = Runtime.getRuntime().exec(command);
        p.waitFor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine())!= null) {
            output.append(line + "\n");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return output.toString();

}

}
