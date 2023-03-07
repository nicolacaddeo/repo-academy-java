package registra_veicolo;

public class Auto extends Veicolo {
    private int numeroPorte;

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    private String tipoCarburante;

    public String getTipoCarburante() {
        return tipoCarburante;
    }

    public void setTipoCarburante(String tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }

    private double consumoMedio;

    public double getConsumoMedio() {
        return consumoMedio;
    }

    // TODO consumo di conseguenza
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    Auto(String marca, String modello,
            int annoFabbricazione, int numeroPorte, String tipoCarburante, double consumoMedio) {

        super(marca, modello, annoFabbricazione);
        this.numeroPorte = numeroPorte;
        this.tipoCarburante = tipoCarburante;
        this.consumoMedio = consumoMedio;

    }
}
