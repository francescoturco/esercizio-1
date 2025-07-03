import java.util.Scanner;

public class Esercizio9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero ");
        int numero = scan.nextInt();

        for (int i = 1; i <= numero; i++ ) {
            for (int j = 1; j <= i ; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

    }
}
