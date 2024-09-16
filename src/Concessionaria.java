import java.util.Scanner;
public class Concessionaria {
    public static void main(String[] args) {
        boolean running = true;
        int opzione;
        Scanner in = new Scanner(System.in);
        String[] arrayMarca = new String[10000];
        String[] arrayModello = new String[10000];
        double[] arrayPrezzo = new double[10000];
        String marca;
        String modello;
        double prezzo;
        int conta = 0;
        do {
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
            switch (opzione) {
                case 1:
                    System.out.println("Fornire marca");
                    marca = in.next();
                    System.out.println("Fornire modello");
                    modello = in.next();
                    System.out.println("Fornire prezzo");
                    prezzo = in.nextDouble();
                    Aggiunta(arrayMarca, arrayModello, arrayPrezzo, marca, modello, prezzo, conta);
                    System.out.println("Auto aggiunta con successo");
                    break;
                case 2:
                    for(int i=0; i<conta;i++){
                        System.out.println(Visualizza(arrayMarca, arrayModello, arrayPrezzo, conta, i));
                    }
                    break;
                case 8:
                    running = false;
            }
            conta++;
        } while (running);
    }

    public static void Aggiunta(String[] arrayMarca, String[] arrayModello, double[] arrayPrezzo, String marca, String modello, double prezzo, int conta) {
        arrayMarca[conta] = marca;
        arrayModello[conta] = modello;
        arrayPrezzo[conta] = prezzo;
    }

    public static String Visualizza(String[] arrayMarca, String[] arrayModello, double[] arrayTarga, int conta, int i) {
        return (arrayMarca[i] + "," + arrayModello[i] + "," + arrayTarga[i] + ".");
    }
}

