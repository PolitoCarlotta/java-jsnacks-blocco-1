public class Snack10 {
    public static void main(String[] args) {

        int asterischi = 1;
        int righe = 5;

        for(int i = 0; i<righe; i++){
            for(int j=0; j<asterischi; j++){
                System.out.print("*");
            }
            System.out.println("");
            asterischi +=2;
        }
    }
}
