import java.util.Scanner;

public class Esercizio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il numero di righe: ");
        int righe = scan.nextInt();

        System.out.print("Inserisci il numero di colonne: ");
        int colonne = scan.nextInt();

        for (int i = 0; i < righe; i++) {         
            for (int j = 0; j < colonne; j++) {   
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
