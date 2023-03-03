import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Libro> libriDisponibili = new ArrayList<Libro>();
    static ArrayList<Libro> libriInPrestito = new ArrayList<Libro>();

    public static void main(String[] args) {

        libriDisponibili.add(new Libro("Harry Potter", 3, 0));
        libriDisponibili.add(new Libro("1984", 2, 0));
        libriDisponibili.add(new Libro("La fattoria degli animali", 1, 0));
        Biblioteca biblioteca = new Biblioteca(libriDisponibili, libriInPrestito);

        // scanner
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Benvenuto in biblioteca");
        // * booleano per il loop principale
        boolean exit = false;
        while (!exit) {
            System.out.println(
                    "Scegli un'opzione:\n[1]Prestito Libro\n[2]Restituisci Libro\n[3]Aggiungi Libro\n[4]Rimuovi Libro\n[5]Lista Libri\n[6]Esci");
            int menuChoice = intScanner.nextInt();
            switch (menuChoice) {
                // prestito di un libro
                case 1:
                    System.out.print("Scegli un libro da prendere in prestito");
                    ViewTitles();
                    int booktoLend = intScanner.nextInt();
                    biblioteca.PrestaLibro(booktoLend);

                    break;
                // restituzione libro
                case 2:
                    System.out.print("Scegli un libro da restituire");
                    ViewTitles();
                    int bookReturned = intScanner.nextInt();
                    biblioteca.RestituisciLibro(bookReturned);

                    break;
                // aggiunta di un nuovo libro
                case 3:
                    System.out.print("Inserisci il titolo del libro: ");
                    String newTitle = stringScanner.nextLine();
                    System.out.print("Inserisci le copie disponibili: ");
                    int newAvailability = intScanner.nextInt();
                    biblioteca.AggiungiLibro(newTitle, newAvailability);

                    break;
                // rimozione di un libro dalla lista dei disponibili
                case 4:
                    System.out.println("Inserisci il numero del libro da rimuovere");
                    ViewTitles();
                    int bookToRemove = intScanner.nextInt();
                    System.out.println(
                            "Hai rimosso correttamente il libro: " + libriDisponibili.get(bookToRemove).getTitolo());
                    biblioteca.RimuoviLibro(libriDisponibili.get(bookToRemove));

                    break;
                // stampo la lista dei libri disponibili
                case 5:
                    biblioteca.LibriDisponibili();
                    break;
                case 6:
                    System.out.println("Arrivederci");
                    // ! Esco dal ciclo
                    exit = true;
                    break;
                default:
                    System.out.println("Riprova, opzione non disponibile");
            }
        }
        intScanner.close();
        stringScanner.close();

    }

    public static void ViewTitles() {
        for (int i = 0; i < libriDisponibili.size(); i++) {
            System.out.println("\n[" + i + "]" + libriDisponibili.get(i).getTitolo());
        }
    }

}
