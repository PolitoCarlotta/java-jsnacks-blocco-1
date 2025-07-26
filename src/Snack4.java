
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //array con la lista invitati
        String [] invitati = {"Carlo", "Giovanni", "Michele", "Giulia", "Francesca", "Elisa"};

        //chiedere il nome all'utente
        System.out.println("Inserisci il tuo nome per vedere se sei nella lista degli invitati: ");
        String nome = input.nextLine();

        //dirgli se può partecipare o no
        boolean utentePresente = false;

        for (int i = 0; i < invitati.length; i++) {
            if(nome.equals(invitati[i])) {
                utentePresente = true;
            }
        }

        if(utentePresente){
            System.out.println("Il tuo nome è tra gli invitati: puoi partecipare!");
        } else {
            System.out.println("Il tuo nome è non tra gli invitati: non puoi partecipare!");
        }
    }
}
