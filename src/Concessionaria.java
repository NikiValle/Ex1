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
        int linea;
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
                case 3:
                    System.out.println("Inserisci marca dell'auto");
                    marca = in.next();
                    System.out.println("Inserisci modello dell'auto");
                    modello = in.next();
                    linea = (Trova(arrayMarca, arrayModello, arrayPrezzo, marca, modello, conta));
                    if(arrayMarca[0].equalsIgnoreCase(marca)&&arrayModello[0].equalsIgnoreCase(modello))
                        System.out.println(Visualizza(arrayMarca, arrayModello, arrayPrezzo, conta, 0));
                    else{
                        if(linea==0)
                            System.out.println("Auto non trovata");
                        else{
                            System.out.println(Visualizza(arrayMarca, arrayModello, arrayPrezzo, conta, linea));
                        }
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

    public static String Visualizza(String[] arrayMarca, String[] arrayModello, double[] arrayPrezzo, int conta, int i) {
        return (arrayMarca[i] + "," + arrayModello[i] + "," + arrayPrezzo[i] + ".");
    }
    public static int Trova(String[] arrayMarca, String[] arrayModello, double[] arrayTarga, String marca, String modello, int conta){
        int trovato =0;
        for(int i=0; i<conta;i++){
            if(arrayMarca[i].equalsIgnoreCase(marca)&&arrayModello[i].equalsIgnoreCase(modello)){
                trovato =i;
            }
        }
        return trovato;
    }
}

