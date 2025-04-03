import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ElencoAgriturismo e = new ElencoAgriturismo();
        ElencoAgriturismo e1 = e.carica("Agriturismi-Napoli.csv");

        ElencoAgriturismo e2 = e1.filtra(a -> a.getComuneAzienda().equalsIgnoreCase("agerola"));
        System.out.println(e2 + "\n");

        ElencoAgriturismo e3 = e1.filtra(a->a.getPostiMacchina() <20).filtra(a-> a.getPostiMacchina()>0);
        e3.aggiorna(a-> a.setPostiMacchina(40));
        System.out.println("AGGIORNAMENTO:\nNUMERO POSTI MACCHINA CAMBIATI -> \n" + e3 + "\n");


    }
}