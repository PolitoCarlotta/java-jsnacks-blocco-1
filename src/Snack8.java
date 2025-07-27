
import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //chiedere all'utente un numero di 4 cifre
        System.out.print("Inserisci un numero di quattro cifre: ");
        int numero = input.nextInt();
        int somma = 0;

        //calcola la somma delle 4 cifre
        if(numero>1000 && numero<= 9999){
            while(numero > 0){
                int cifra = numero % 10;
                somma += cifra;
                numero /= 10;
            }
            System.out.println("la somma delle cifre inserita è: " + somma);
            }else {
                System.out.println("Il numero inserito non è di quattro cifre.");
            }
        }
    }

