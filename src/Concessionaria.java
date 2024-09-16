import java.util.Scanner;
public class Concessionaria{
    public static void main(String[]args){
        boolean running =false;
        int opzione;
        Scanner in = new Scanner(System.in);
        String [] ArrayMarca = new String[10000];
        String [] ArrayModello = new String[10000];
        String [] ArrayTarga = new String[10000];
        String marca;
        String modello;
        String targa;
        int conta = 0;
        do{
            System.out.println("Seleziona un'opzione:");
            System.out.println("1.Aggiunta di una nuova auto;\n" +
                    "2.Visualizzazione di tutte le auto;\n" +
                    "3.Ricerca di un'auto tramite marca e modello;\n" +
                    "4.Cancellazione di un'auto;\n" +
                    "5.Modifica dei dati di un'auto;\n" +
                    "6.Visualizzazione delle auto in ordine crescente;\n" +
                    "7.Visualizzare tutti i modelli che diesel;\n" +
                    "8.Termina.");
            opzione = in.nextInt();
            switch(opzione){
                case 1:
                    System.out.println("Fornire marca");
                    marca = in.next();
                    System.out.println("Fornire modello");
                    modello = in.next();
                    System.out.println("Fornire targa");
                    targa = in.next();
                    Aggiunta(marca, modello, targa);
                    System.out.println("Auto aggiunta con successo");
                    break;
            }
            conta++;
        }while(running);
    }
    public static void Aggiunta(String[] arrayMarca, String[] arrayModello, String[] arrayTarga, String marca, String modello, String targa, int conta){
        arrayMarca[conta] = marca;
        arrayModello[conta] = modello;
        arrayTarga[conta] = targa;
    }
}
