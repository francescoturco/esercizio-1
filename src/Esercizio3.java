public class Esercizio3 {
    public static void main(String[] args) {
        
        int [] numeri = {25,2,3,4,50};

        int somma = 0;
        
        for (int i = 0; i < numeri.length; i++) {
            somma += numeri[i];
        }


        System.out.println("Il totale è "+ somma);


    }
    
}
