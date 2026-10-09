import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //INICI VARIABLES

        Scanner llegir = new Scanner(System.in);
        int numeroA = 0;
        int numeroB = 0;
        int sortida = 0;

        //FINAL VARIABLES


        //INICI PROGRAMA

        numeroA = llegir.nextInt();
        numeroB = llegir.nextInt();

        if (numeroA > numeroB)
            sortida = numeroA - numeroB;
         else if (numeroA < numeroB)
             sortida = numeroB - numeroA;

        System.out.println(sortida);

        //FINAL PROGRAMA
    }
}