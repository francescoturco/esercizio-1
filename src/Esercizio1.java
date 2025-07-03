import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Quale numero della tabellina vorresti tampare? ");
        int numero = scan.nextInt();


        System.out.print("Fino a quale nuemero");
        int fineTabellina = scan.nextInt();


        for (int i = 0; i <= fineTabellina; i++) {
            int risultato = numero * i;
            System.out.println(numero + "X" + i + "=" + risultato);
        } 




    }
}
