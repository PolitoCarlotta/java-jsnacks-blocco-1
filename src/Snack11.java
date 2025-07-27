public class Snack11 {
    public static void main(String[] args) {
        int righe = 5;

        for(int i=1; i <= righe; i++){
                for(int j=1; j <= righe - i; j++){
                System.out.print(" ");
                }

                for(int k=1; k <= (2*i-1); k++){
                if(k == 1 || k == (2*i-1) || i == righe) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
