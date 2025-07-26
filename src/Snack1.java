import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //chiedere all'utente due numeri

        System.out.print("Inserisci il primo numero: ");
        int numero1 = input.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int numero2 = input.nextInt();

        //stampare il numero maggiore

        if(numero1>numero2){
            System.out.println("il numero " + numero1 + " è il numero maggiore tra i due inseriti");
        } else if (numero2>numero1){
            System.out.println("il numero " + numero2 + " è il numero maggiore tra i due inseriti");
        } else {
            System.out.println("I due numeri inseriti sono uguali");
        }
    }
}
