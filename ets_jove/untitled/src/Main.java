import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //INICI VARIABLES

        Scanner llegir = new Scanner(System.in);
        int any = 0;

        //FINAL VARIABLES

        //INICI PROGRAMA

        any = llegir.nextInt();
        if (any >= 1945 && any <= 1965){
            System.out.println("ok boomer");
        }  else {
            System.out.println("nah");
        }

        //FINAL PROGRAMA
    }
}