import java.util.Scanner;

public class Main {
    void main (){
        //INICI_VARIABLES

        int edat = 0;
        Scanner llegir = new Scanner(System.in);

        //FINAL_VARIABLES

        //INICI_PROGRAMA

        //System.out.println("Introdueix la teva edat:");
        edat = llegir.nextInt();

        if (edat < 32){
            System.out.println("SI");
        } else {
                System.out.println("NO");
            }

        //FINAL_PROGRAMA
    }
}
