import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //INICI VARIABLES

        Scanner llegir = new Scanner(System.in);
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        //FINAL VARIABLES

        //INICI PROGRAMA

        c1 = llegir.nextInt();
        c2 = llegir.nextInt();
        c3 = llegir.nextInt();

        if (c1 == c2 || c1 == c3 || c2 == c3){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        //FINAL PROGRAMA
    }
}