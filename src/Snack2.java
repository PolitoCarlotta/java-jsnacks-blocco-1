
import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //chiedere all'utente due parole
        System.out.print("Inserisci la prima parola: ");
        String parola1 = input.next();
        
        System.out.print("Inserisci la seconda parola: ");
        String parola2 = input.next();

        //stampare prima la parola + corta poi la più lunga

        if(parola1.length() < parola2.length()){
            System.out.println("La parola " + parola1 + " è la più corta");
            System.out.println("La parola " + parola2 + " è la più lunga");
        } else if (parola2.length()<parola1.length()) {
            System.out.println("La parola " + parola2 + " è la più corta");
            System.out.println("La parola " + parola1 + " è la più lunga");
        } else {
            System.out.println("La parola " + parola1 +" e la parola " + parola2 + " sono lunghe uguali");
        }
    }
}
