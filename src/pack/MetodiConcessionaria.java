package pack;

public class MetodiConcessionaria {
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
    public static void Cancella(String[] arrayMarca, String[] arrayModello, double[] arrayPrezzo, int pos, int conta){
        for(int i=conta;i>pos;i--){
            arrayMarca[i-1]=arrayMarca[i];
            arrayModello[i-1]=arrayModello[i];
            arrayPrezzo[i-1]=arrayPrezzo[i];
        }
    }
    public static void ModificaNome(String[] array, String dato, int linea, String mod){
        array[linea]=dato;
    }
    public static void ModificaNumero(double[] array, double dato, int linea){
        array[linea]=dato;
    }
    public static int StampaCrescente(double[] array, int i, double precedente){

    }
}
