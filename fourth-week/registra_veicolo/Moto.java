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

    public void setPotenza(int cilindrata) {
        if (cilindrata < 600) {
            this.potenza = 50;
        } else if (cilindrata > 600) {
            this.potenza = 70;
        } else if (cilindrata > 1000) {
            this.potenza = 80;
        }
    }

    Moto(String marca, String modello,
            int annoFabbricazione, int cilindrata, String tipologia) {
        super(marca, modello, annoFabbricazione);
        this.cilindrata = cilindrata;
        this.tipologia = tipologia;
        setPotenza(cilindrata);
    }
}
