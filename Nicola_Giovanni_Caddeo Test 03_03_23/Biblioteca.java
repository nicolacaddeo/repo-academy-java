import java.util.ArrayList;

class Biblioteca {

    private ArrayList<Libro> libriDisponibili = new ArrayList<Libro>();
    private ArrayList<Libro> libriInPrestito = new ArrayList<Libro>();

    public Biblioteca(ArrayList<Libro> libriDisponibili, ArrayList<Libro> libriInPrestito) {
        this.libriDisponibili = libriDisponibili;
        this.libriInPrestito = libriInPrestito;
    }

    public void PrestaLibro(int index) {
        String title = libriDisponibili.get(index).getTitolo();
        // variabile che rappresenta le copie disponibili
        int availability = libriDisponibili.get(index).getCopieDisponibili();
        // variabile che rappresenta le copie in prestito
        int loanCopies = libriDisponibili.get(index).getCopieInPrestito();

        if (libriDisponibili.get(index).getCopieDisponibili() > 0) {

            System.out.println("Hai preso in prestito il libro: " + title);
            libriInPrestito.add(libriDisponibili.get(index));
            // rimuovo una copia dal numero di quelle disponibili
            libriDisponibili.get(index).copieDisponibiliRemove(availability);

            // aggiungo una copia in quelle in prestito
            libriDisponibili.get(index).setCopieInPrestitoAdd(loanCopies);
        } else {
            System.out.println("Non ci sono copie disponibili per questo libro");
        }
    }

    public void RestituisciLibro(int index) {
        // variabile che rappresenta le copie disponibili
        int availability = libriDisponibili.get(index).getCopieDisponibili();
        // variabile che rappresenta le copie disponibili
        int loanCopies = libriDisponibili.get(index).getCopieDisponibili();

        if (libriInPrestito.contains(libriDisponibili.get(index))) {
            System.out.println("Hai restituito il libro correttamente");
            // indice del libro in prestito, nell'ArrayList libriInPrestito
            int indexToRemove = libriInPrestito.indexOf(libriDisponibili.get(index));

            // rimuovo il libro dall'array
            libriInPrestito.remove(indexToRemove);

            // aggiungo un'unitá alle copie disponibili
            libriDisponibili.get(index).CopieDisponibiliAdd(availability);

            // rimuovo un'unitá alle copie in prestito
            libriDisponibili.get(index).setCopieInPrestitoRemove(loanCopies);
        } else {
            System.out.println("Nessun di questi libri é in prestito");
        }
    }

    public void AggiungiLibro(String newTitle, int newAvailability) {
        Libro newBook = new Libro(newTitle, newAvailability, 0);
        this.libriDisponibili.add(newBook);
    }

    public void RimuoviLibro(Libro bookToRemove) {
        this.libriDisponibili.remove(bookToRemove);
    }

    public void LibriDisponibili() {
        System.out.println("Ecco i titoli disponibili:");
        for (int i = 0; i < libriDisponibili.size(); i++) {
            System.out.println(libriDisponibili.get(i).getTitolo());
            System.out.println("Copie disponibili: " + libriDisponibili.get(i).getCopieDisponibili());
            System.out.println("---------------------------------");
        }
    }

}
