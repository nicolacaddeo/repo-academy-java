package registra_veicolo;

public class Moto extends Veicolo {
    private int cilindrata;

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    private String tipologia;

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    private int potenza;

    public int getPotenza() {
        return potenza;
    }

    // TODO potenza di conseguenza
    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    Moto(String marca, String modello,
            int annoFabbricazione, int cilindrata, String tipologia, int potenza) {
        super(marca, modello, annoFabbricazione);
        this.cilindrata = cilindrata;
        this.tipologia = tipologia;
        this.potenza = potenza;
    }
}
