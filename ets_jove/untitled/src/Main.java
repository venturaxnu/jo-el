import java.util.Scanner;

public class Main {
    void main (){
        //INICI_VARIABLES

        int vots_jiden = 0;
        int vots_drump = 0;
        Scanner llegir = new Scanner(System.in);

        //FINAL_VARIABLES

        //INICI_PROGRAMA

        //System.out.println("Introdueix vots de Jiden:");
        vots_jiden = llegir.nextInt();
        //System.out.println("Introdueix vots de Drump:");
        vots_drump = llegir.nextInt();
        if (vots_jiden > vots_drump) {
            System.out.println("Jiden");
        } else  if (vots_jiden < vots_drump) {
            System.out.println("Drump");
        } else {
            System.out.println("No");
        }

        //FINAL_PROGRAMA
    }
}
