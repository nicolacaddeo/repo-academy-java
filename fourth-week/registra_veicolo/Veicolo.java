package registra_veicolo;

public class Veicolo {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String modello;

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    private int annoFabbricazione;

    public int getAnnoFabbricazione() {
        return annoFabbricazione;
    }

    public void setAnnoFabbricazione(int annoFabbricazione) {
        this.annoFabbricazione = annoFabbricazione;
    }

    Veicolo(String marca, String modello, int annoFabbricazione) {
        this.marca = marca;
        this.modello = modello;
        this.annoFabbricazione = annoFabbricazione;

    }

}
