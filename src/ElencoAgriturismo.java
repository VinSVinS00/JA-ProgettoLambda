import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ElencoAgriturismo
{
    private List<Agriturismo> agriturismi;

    public ElencoAgriturismo
            (){
        agriturismi = new ArrayList<>();
    }

    public void aggiungi(Agriturismo a){
        agriturismi.add(a);
    }

    public ElencoAgriturismo
    filtra(FiltroAgriturismo fa){
        ElencoAgriturismo
                ea = new ElencoAgriturismo
                ();
        for(Agriturismo a : agriturismi){
            if(fa.verifica(a)){
                ea.aggiungi(a);
            }
        }
        return ea;
    }

    public <T> List<T> estrai(EstraiAgriturismo<T> ea){
        List<T> lista = new ArrayList<>();
        for(Agriturismo a : agriturismi){
            lista.add(ea.estrai(a));
        }
        return lista;
    }

    public void aggiorna(AggiornaAgriturismo aa){
        for(Agriturismo a : agriturismi){
            aa.aggiorna(a);
        }
    }

    public void ordina(OrdinaAgriturismo oa) {
        agriturismi.sort(oa.ordina());
    }


    public static ElencoAgriturismo
    carica(String filename) {
        ElencoAgriturismo
                ea = new ElencoAgriturismo
                ();
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(filename)))){
            s.useDelimiter(";|\n");
            s.nextLine();
            while(s.hasNext()){
                String comuneAzienda = s.next();
                String titolare = s.next();
                String denominazioneAzienda = s.next();
                String indirizzoAzienda = s.next();
                String postiLetto = s.next();
                if("".equals(postiLetto)) postiLetto = "0";

                String postiMacchina = s.next();
                if("".equals(postiMacchina)) postiMacchina = "0";

                String postiTenda = s.next();
                if("".equals(postiTenda)) postiTenda = "0";

                String postiRoulotte = s.next();
                if("".equals(postiRoulotte)) postiRoulotte = "0";

                String recapiti = s.next();
                boolean pernottamento, camping;

                if(Integer.parseInt(postiLetto) > 0){
                    pernottamento = true;
                }else{
                    pernottamento = false;
                }

                if(Integer.parseInt(postiRoulotte) > 0 && Integer.parseInt(postiTenda) > 0){
                    camping = true;
                }else{
                    camping = false;
                }

                ea.aggiungi(new Agriturismo(comuneAzienda, titolare, denominazioneAzienda, indirizzoAzienda, Integer.parseInt(postiLetto), Integer.parseInt(postiMacchina),
                        Integer.parseInt(postiTenda), Integer.parseInt(postiRoulotte), recapiti, pernottamento, camping));
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
        return ea;
    }

    @Override
    public String toString() {
        return "ElencoAgriturismo" +
                "{" +
                "agriturismi=" + agriturismi +
                "}\n";
    }
}
