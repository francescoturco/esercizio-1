import java.util.Scanner;
public class Esercizio7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("Inserisci una parola, la stamperò al contrario =) ");
        String parola = scan.nextLine();

        for (int i = parola.length() - 1; i >= 0; i--){
            System.out.print(parola.charAt(i));

        }

    }
    
}
