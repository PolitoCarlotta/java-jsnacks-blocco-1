
import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //chiedere 10 numeri all'utente
        System.out.print("Inserisci il primo numero: ");
        int numero1 = input.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int numero2 = input.nextInt();

        System.out.print("Inserisci il terzo numero: ");
        int numero3 = input.nextInt();

        System.out.print("Inserisci il quarto numero: ");
        int numero4 = input.nextInt();

        System.out.print("Inserisci il quinto numero: ");
        int numero5 = input.nextInt();

        System.out.print("Inserisci il sesto numero: ");
        int numero6 = input.nextInt();

        System.out.print("Inserisci il settimo numero: ");
        int numero7 = input.nextInt();

        System.out.print("Inserisci il ottavo numero: ");
        int numero8 = input.nextInt();

        System.out.print("Inserisci il nono numero: ");
        int numero9 = input.nextInt();

        System.out.print("Inserisci il decimo numero: ");
        int numero10 = input.nextInt();

        //stampare la somma dei numeri

        int somma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10;

        System.out.println("La somma dei numeri inserita è: " + somma);
    }
}
