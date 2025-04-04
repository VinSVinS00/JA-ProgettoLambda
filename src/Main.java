import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ElencoAgriturismo e = new ElencoAgriturismo();
        ElencoAgriturismo e1 = e.carica("Agriturismi-Napoli.csv");

        ElencoAgriturismo e2 = e1.filtra(a -> a.getComuneAzienda().equalsIgnoreCase("agerola"));
        System.out.println("\nAGRITURISMI DI AGEROLA: \n" + e2 + "\n");

        ElencoAgriturismo e3 = e1.filtra(a->a.getPostiMacchina() <20).filtra(a-> a.getPostiMacchina()>0);
        e3.aggiorna(a-> a.setPostiMacchina(40));
        System.out.println("AGGIORNAMENTO:\nNUMERO POSTI MACCHINA CAMBIATI -> \n" + e3 + "\n");

        e2.ordina(() -> (a1, a2) -> a1.getDenominazioneAzienda().compareTo(a2.getDenominazioneAzienda()));
        System.out.println("LISTA DEGLI AGRITURISMI DI AGEROLA ORDINATA IN BASE ALLA DENOMINAZIONE DELL'AZIENDA: \n" + e2 + "\n");

        ElencoAgriturismo e4 = e1.filtra(a -> a.getPostiRoulotte()>0).filtra(a -> a.getPostiTenda() > 0);
        System.out.println("AGRITURISMI ADIBITI AL CAMPING: \n" + e4 + "\n");

        ElencoAgriturismo e5 = e2.filtra(a -> a.getPostiLetto()>0);
        System.out.println("AGRITURISMI DI AGEROLA ADIBITI AL PERNOTTAMENTO: \n" + e5 + "\n");

        int somma = e2.somma(a -> a.getPostiLetto());
        System.out.println("NUMERO DI POSTI LETTO NEGLI AGRITURISMI DI AGEROLA: " + somma + "\n");

        e1.esporta(a -> a.getComuneAzienda().equalsIgnoreCase("CASTELLAMARE STABIA"), "fileWrite.txt");
    }
}