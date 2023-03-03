public class Libro {
    private String titolo;
    private int copieDisponibili;
    private int copieInPrestito;

    // * COSTRUTTORE
    Libro(String titolo, int copieDisponibili, int copieInPrestito) {
        this.titolo = titolo;
        this.copieDisponibili = copieDisponibili;
        this.copieInPrestito = copieInPrestito;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getCopieDisponibili() {
        return copieDisponibili;
    }

    public void copieDisponibiliRemove(int copieDisponibili) {
        this.copieDisponibili -= 1;
    }

    public void CopieDisponibiliAdd(int copieDisponibili) {
        this.copieDisponibili += 1;
    }

    public int getCopieInPrestito() {
        return copieInPrestito;
    }

    public void setCopieInPrestitoAdd(int copieInPrestito) {
        this.copieInPrestito += 1;
    }

    public void setCopieInPrestitoRemove(int copieInPrestito) {
        this.copieInPrestito -= 1;
    }
}
