public class Agriturismo {
    private String comuneAziendale;
    private String titolare;
    private String denominazioneAzienda;
    private String indirizzoAzienda;
    private int postiLetto;
    private int postiMacchina;
    private int postiTenda;
    private int postiRoulette;
    private String recapito;
    private boolean pernottamento;
    private boolean camping;

    public Agriturismo(String comuneAziendale, String titolare, String denominazioneAzienda, String indirizzoAzienda, int postiLetto, int postiMacchina, int postiTenda, int postiRoulette, String recapito, boolean pernottamento, boolean camping) {
        this.comuneAziendale = comuneAziendale;
        this.titolare = titolare;
        this.denominazioneAzienda = denominazioneAzienda;
        this.indirizzoAzienda = indirizzoAzienda;
        this.postiLetto = postiLetto;
        this.postiMacchina = postiMacchina;
        this.postiTenda = postiTenda;
        this.postiRoulette = postiRoulette;
        this.recapito = recapito;
        this.pernottamento = pernottamento;
        this.camping = camping;
    }

    public String getComuneAziendale() {
        return comuneAziendale;
    }

    public void setComuneAziendale(String comuneAziendale) {
        this.comuneAziendale = comuneAziendale;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public String getDenominazioneAzienda() {
        return denominazioneAzienda;
    }

    public void setDenominazioneAzienda(String denominazioneAzienda) {
        this.denominazioneAzienda = denominazioneAzienda;
    }

    public String getIndirizzoAzienda() {
        return indirizzoAzienda;
    }

    public void setIndirizzoAzienda(String indirizzoAzienda) {
        this.indirizzoAzienda = indirizzoAzienda;
    }

    public int getPostiLetto() {
        return postiLetto;
    }

    public void setPostiLetto(int postiLetto) {
        this.postiLetto = postiLetto;
    }

    public int getPostiMacchina() {
        return postiMacchina;
    }

    public void setPostiMacchina(int postiMacchina) {
        this.postiMacchina = postiMacchina;
    }

    public int getPostiTenda() {
        return postiTenda;
    }

    public void setPostiTenda(int postiTenda) {
        this.postiTenda = postiTenda;
    }

    public int getPostiRoulette() {
        return postiRoulette;
    }

    public void setPostiRoulette(int postiRoulette) {
        this.postiRoulette = postiRoulette;
    }

    public String getRecapito() {
        return recapito;
    }

    public void setRecapito(String recapito) {
        this.recapito = recapito;
    }

    public boolean isPernottamento() {
        return pernottamento;
    }

    public void setPernottamento(boolean pernottamento) {
        this.pernottamento = pernottamento;
    }

    public boolean isCamping() {
        return camping;
    }

    public void setCamping(boolean camping) {
        this.camping = camping;
    }

    @Override
    public String toString() {
        return "Agriturismo{" +
                "comuneAziendale='" + comuneAziendale + '\'' +
                ", titolare='" + titolare + '\'' +
                ", denominazioneAzienda='" + denominazioneAzienda + '\'' +
                ", indirizzoAzienda='" + indirizzoAzienda + '\'' +
                ", postiLetto='" + postiLetto + '\'' +
                ", postiMacchina='" + postiMacchina + '\'' +
                ", postiTenda='" + postiTenda + '\'' +
                ", postiRoulette='" + postiRoulette + '\'' +
                ", recapito='" + recapito + '\'' +
                ", pernottamento=" + pernottamento +
                ", camping=" + camping +
                "}\n";
    }
}
