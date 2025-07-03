public class Esercizio4 {
    public static void main(String[] args) {
        

        int [] numeri = {1, 2, 3, 4, 500};

        int numeroMassimo = 0;

        for (int i = 0; i < numeri.length; i++) {

            if (numeri[i] > numeroMassimo) {
                numeroMassimo = numeri[i];
            } 

        }
        System.out.println("Il numero più grande è " + numeroMassimo );
    }
    
}
