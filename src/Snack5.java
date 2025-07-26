import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //chiedere 6 numeri all'utente
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

        //se è dispari mostrarlo a video
        int [] numeriInseriti = {numero1, numero2, numero3, numero4, numero5, numero6};

        for (int i = 0; i < numeriInseriti.length; i++) {
            if(numeriInseriti[i]%2 != 0){
                System.out.println("il numero " + numeriInseriti[i] + " è dispari");
            }
        }
    }
}
