import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //INICI VARIABLES

        Scanner llegir = new Scanner(System.in);
        int num = 0;
        boolean esdivisible = false;
        double divisio = 0;
        //FINAL VARIABLES


        //INICI PROGRAMA

        num = llegir.nextInt();

        for (int i = 1; i < 10; i++){
            if (num % i == 0){
                esdivisible = true;
            } else {
                esdivisible = false;
                System.out.println("NO");
                i = 10;
            }
        }

        if (esdivisible){
            System.out.println("SI");
        }

        //FINAL PROGRAMA
    }
}