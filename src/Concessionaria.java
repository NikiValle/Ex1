import java.util.Scanner;
public class Concessionaria{
    public static void main(String[]args){
        boolean running =false;
        int opzione;
        Scanner in = new Scanner(System.in);
        String [] marca = new String[10000];
        String [] modello = new String[10000];
        String [] targa = new String[10000];
        do{
            System.out.println("Seleziona un'opzione:");
            System.out.println("1.Aggiunta di una nuova auto;\n" +
                    "2.Visualizzazione di tutte le auto;\n" +
                    "3.Ricerca di un'auto tramite marca e modello;\n" +
                    "4.Cancellazione di un'auto;\n" +
                    "5.Modifica dei dati di un'auto;\n" +
                    "6.Visualizzazione delle auto in ordine crescente;\n" +
                    "7.Visualizzare tutti i modelli che diesel.");
            opzione = in.nextInt();
            switch(opzione){
                case 1:

            }
        }while(running);
    }
}
