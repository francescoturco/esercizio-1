public class Esercizio5 {
    public static void main(String[] args) {
        
        int [] numeri = {250, 1005, 89, 69, 9852};

        int numeroMinimo = numeri[0];

        for (int i = 0; i < numeri.length; i++) {

            if (numeri[i] < numeroMinimo) {
                numeroMinimo = numeri[i];
            } 

        }
        System.out.println("Il numero più grande è " + numeroMinimo );

    }

}
