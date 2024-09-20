package pack;
import pack.MetodiConcessionaria;
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
        String dato;
        double datoNumerico;
        double prezzo;
        int conta = 0;
        int linea;
        String modifica;
        boolean errore;
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
                    MetodiConcessionaria.Aggiunta(arrayMarca, arrayModello, arrayPrezzo, marca, modello, prezzo, conta);
                    System.out.println("Auto aggiunta con successo");
                    break;
                case 2:
                    for(int i=0; i<conta;i++){
                        System.out.println(MetodiConcessionaria.Visualizza(arrayMarca, arrayModello, arrayPrezzo, conta, i));
                    }
                    break;
                case 3:
                    System.out.println("Inserisci marca dell'auto");
                    marca = in.next();
                    System.out.println("Inserisci modello dell'auto");
                    modello = in.next();
                    linea = (MetodiConcessionaria.Trova(arrayMarca, arrayModello, arrayPrezzo, marca, modello, conta));
                    if(arrayMarca[0].equalsIgnoreCase(marca)&&arrayModello[0].equalsIgnoreCase(modello))
                        System.out.println(MetodiConcessionaria.Visualizza(arrayMarca, arrayModello, arrayPrezzo, conta, 0));
                    else{
                        if(linea==0)
                            System.out.println("Auto non trovata");
                        else{
                            System.out.println(MetodiConcessionaria.Visualizza(arrayMarca, arrayModello, arrayPrezzo, conta, linea));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Inserisci marca dell'auto");
                    marca = in.next();
                    System.out.println("Inserisci modello dell'auto");
                    modello = in.next();
                    linea = (MetodiConcessionaria.Trova(arrayMarca, arrayModello, arrayPrezzo, marca, modello, conta));
                    MetodiConcessionaria.Cancella(arrayMarca, arrayModello, arrayPrezzo, linea, conta);
                    conta--;
                    break;
                case 5:
                    System.out.println("Inserisci marca dell'auto");
                    marca = in.next();
                    System.out.println("Inserisci modello dell'auto");
                    modello = in.next();
                    linea = (MetodiConcessionaria.Trova(arrayMarca, arrayModello, arrayPrezzo, marca, modello, conta));
                    do {
                        errore=false;
                        System.out.println("Cosa vorresti modificare? Marca/modello/prezzo");
                        modifica = in.next();
                        if(modifica.equalsIgnoreCase("marca")||modifica.equalsIgnoreCase("modello")||modifica.equalsIgnoreCase("prezzo")) {
                            break;
                        }
                        else{
                            System.out.println("opzione errata, riprova");
                        }
                    }while(!errore);
                    if(modifica.equalsIgnoreCase("marca")){
                        System.out.println("Inserisci il nuovo dato");
                        dato=in.next();
                        MetodiConcessionaria.ModificaNome(arrayMarca, dato, linea, modifica);
                    } else if (modifica.equalsIgnoreCase("modello")) {
                        System.out.println("Inserisci il nuovo dato");
                        dato=in.next();
                        MetodiConcessionaria.ModificaNome(arrayModello, dato, linea, modifica);
                    }
                    else{
                        System.out.println("Inserisci il nuovo dato");
                        datoNumerico=in.nextDouble();
                        MetodiConcessionaria.ModificaNumero(arrayPrezzo, datoNumerico, linea);
                    }
                    break;
                case 6:

                case 8:
                    running = false;
            }
            conta++;
        } while (running);
    }


}

