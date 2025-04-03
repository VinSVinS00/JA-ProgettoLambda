public class Main {
    public static void main(String[] args) {
        ElencoAgriturismo test = new ElencoAgriturismo();
        ElencoAgriturismo ea1 = test.carica("Agriturismi-Napoli.csv");

        ElencoAgriturismo ea2 = ea1.filtra(a -> a.getPostiLetto() > 12);
        System.out.println(ea2);
    }
}