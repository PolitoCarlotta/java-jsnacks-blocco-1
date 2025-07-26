
import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //chiedere all'utente un numero
        System.out.print("inserisci il numero fino al quale stampare il cubo: ");
        int numero = input.nextInt();

        //stampa il cubo dei numeri fino a quello inserito dall'utente
        for (int i = 1; i <= numero; i++) {
            System.out.println("il cubo di " + i + " è: " + (i*i*i));
            
        }
    }
}
