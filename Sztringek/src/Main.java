//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
    Scanner sc=new Scanner((System.in));
    //2
    System.out.print("Kérem az ön vezetéknevét: ");
    String vezeteknev=sc.nextLine();
    System.out.print("Kérem az ön keresztnevét: ");
    String keresztnev=sc.nextLine();
    System.out.print("Kérem az ön születési helyét: ");
    String szulhely=sc.nextLine();
    System.out.print("Kérem az ön életkorát: ");
    int kor=sc.nextInt();
    //3
    String fullName=vezeteknev+" "+keresztnev;
    //4
    IO.println(fullName.toUpperCase());
    //5.
    IO.println(fullName.indexOf(keresztnev));

    //6
    IO.println(fullName.toLowerCase()+", "+szulhely.toLowerCase());
    //7
    IO.println("kor: "+kor+", név:"+fullName+", születési hely:"+szulhely);
//8
    if(keresztnev.startsWith("A")) {
        IO.println("A-val kezdődik a keresztneve");
    }
    else {
        IO.println("Nem A-val kezdődik a keresztneve");
    }
//9

    if(vezeteknev.endsWith("t")){
        IO.println("t-val végződik a vezetékneve");
    }
    else {
        IO.println("Nem t-val végződik a vezetékneve");
    }
    //10
    IO.println("Az egész neve hossza: "+(fullName.length()));
    //11

    IO.println("Kicserélve: "+(fullName.replace("i","y")));

    }


