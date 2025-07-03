public class Esercizio8 {
    public static void main(String[] args) {
        

        String[] nomi = {"Anna", "Luca", "Alberto", "Giulia", "Andrea"};


        for (int i = 0; i < nomi.length; i++) {
            if (nomi[i].charAt(0) == 'G') {
                System.out.println(nomi[i]);
            }
        }
    }
    
}
