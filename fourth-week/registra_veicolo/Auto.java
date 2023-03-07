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

    public void setConsumoMedio(int numeroPorte, String tipoCarburante) {
        if (numeroPorte <= 3 && tipoCarburante.equalsIgnoreCase("diesel")) {
            this.consumoMedio = 5;

        } else if (numeroPorte > 3 && tipoCarburante.equalsIgnoreCase("benzina")) {
            this.consumoMedio = 7;

        } else if (numeroPorte <= 3 && tipoCarburante.equalsIgnoreCase("benzina")) {
            this.consumoMedio = 6;

        } else {
            this.consumoMedio = 8;
        }
    }

    Auto(String marca, String modello,
            int annoFabbricazione, int numeroPorte, String tipoCarburante) {

        super(marca, modello, annoFabbricazione);
        this.numeroPorte = numeroPorte;
        this.tipoCarburante = tipoCarburante;
        setConsumoMedio(numeroPorte, tipoCarburante);
    }
}
