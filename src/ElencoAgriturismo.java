import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElencoAgriturismo {
    private List<Agriturismo> lista;

    public ElencoAgriturismo(){
        this.lista = new ArrayList<>();
    }

    public void aggiungi(Agriturismo a){
        lista.add(a);
    }

    public ElencoAgriturismo filtra(FiltroPostiLetto fpl){
        ElencoAgriturismo elencoTemp = new ElencoAgriturismo();
        for(Agriturismo a : this.lista){
            if(fpl.verifica(a)){
                elencoTemp.aggiungi(a);
            }
        }
        return elencoTemp;
    }

    public ElencoAgriturismo carica(String filename){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            ElencoAgriturismo ea = new ElencoAgriturismo();
            String line;
            while((line = reader.readLine()) != null){
                Scanner s = new Scanner(line);
                s.useDelimiter(";");

                String comuneAziendale = s.next();
                String titolare= s.next();
                String denominazioneAzienda= s.next();
                String indirizzoAzienda= s.next();

                int postiLetto= s.nextInt();
                String checkPostiLetto = String.valueOf(postiLetto);
                if(checkPostiLetto.isBlank())
                    postiLetto = 0;
                int postiMacchina= s.nextInt();
                String checkPostiMacchina = String.valueOf(postiMacchina);
                if(checkPostiMacchina.isBlank())
                    postiMacchina = 0;
                int postiTenda= s.nextInt();
                String checkPostiTenda = String.valueOf(postiTenda);
                if(checkPostiTenda.isBlank())
                    postiTenda = 0;
                int postiRoulette= s.nextInt();
                String checkPostiRoulette = String.valueOf(postiRoulette);
                if(checkPostiRoulette.isBlank())
                    postiRoulette = 0;
                String recapito= s.next();

                ea.aggiungi(new Agriturismo(comuneAziendale, titolare, denominazioneAzienda, indirizzoAzienda, postiLetto, postiMacchina, postiTenda, postiRoulette, recapito, false, false));

            }
            return ea;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public String toString() {
        return "ElencoAgriturismo{" +
                "lista=" + lista +
                '}';
    }
}
