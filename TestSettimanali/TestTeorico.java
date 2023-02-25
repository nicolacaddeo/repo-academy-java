public class TestTeorico {
    public static void main(String[] args) {
        // QUESITO 1 --------
        // Cos'é OOP e come la definiamo a diversi livelli:
        /*
         * OOP é un acronimo che in italiano sta per
         * "Programmazione orientata agli oggetti", ed é quindi un paradigma di
         * programmazione che permette la creazione di oggetti astratti che possono
         * interagire tra di loro. Offre 3 vantaggi principali che sono il contenimento,
         * l'uso e la specializzazione. Significa che ogni parte del programma deve
         * essere utilizzabile e contenuta in una certa porzione di codice e inoltre
         * essere specializzata per un certo tipo di azione. Inoltre un linguaggio di
         * programmazione si definisce orientato agli oggetti quando permette tramite la
         * sintassi pura di implementare i seguenti meccanismi: Incapsulamento,
         * ereditarietá e polimorfismo. L'incapsulamento permette al programmatore di
         * nascondere certe parti di codice al programma stesso, l'ereditariá permette
         * di creare delle classi da altre classi ma ereditando tutti gli attributi e i
         * metodi della classe madre. Polimorfismo?.
         * Infine ogni linguaggio orientato agli oggetti ha come elementi fondamentali
         * classi ed oggetti.
         * Possiamo definire una classe come una sorta di "stampino" dalla quale noi
         * creiamo oggetti che hanno sempre quella forma.
         * Se ad esempio dovessimo creare degli oggetti che rappresentano delle persone
         * partiremo appunto da una classe "Persona" cosi che tutti gli oggetti
         * istanziati da quella classe abbiano tutti gli stessi attributi e metodi ma
         * con valori differenti (es. nome, cognome);
         */
        // -------------------------------------------------------------------------------

        // QUESITO 2 ----------------------------
        // Definisci JAVA e i suoi elementi fondamentali:
        /*
         * Come elementi fondamentali di java visti fino ad ora abbiamo visto:
         * 1. Lo scanner: classe nativa di java che permette di raccogliere input
         * dall'utente.
         * 2. Gli array: elemento presente in tutti i linguaggi di programmazione, ma
         * personalmente rispetto ai linguaggi da me studiati in precedenza ho notato
         * alcune differenze come ad esempio l'impossibilitá di aggiungere elementi
         * all'array una volta che definiamo la lunghezza.
         * 3. Gli ArrayList: permette la raccolta di piú dati all'interno di una
         * variabile.
         * 4. System: classe nativa di java che permette varie azioni come ad esempio
         * stampare un elemento del terminale.
         */
        // --------------------------------------------------------------------------------

        // QUESITO 3 -----------------------
        // Descrivi, spiega e prova i loop e le condizioni.
        /*
         * 1. WHILE Loop: il ciclo while permette di ripetere una determinata porzione
         * di codice fino a quando una certa condizione é risulta vera, ad esempio:
         */
        int num = 0; // la varibile num inizialmente vale 0
        while (num < 10) { // 0 é minore di 10 quindi si entra nel ciclo
            System.out.println("Hello World!"); // viene stampato hello world
            num++; // num viene incrementato di 1, quindi la condizione risulterá vera per 10 volte
        }

        /*
         * 2. FOR Loop: come il ciclo while ma tutte le istruzioni devono essere
         * dichiarate all'inizio del ciclo:
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
        // L'output sará identico al ciclo precedente.

        /*
         * 3. DO-WHILE Loop: Come il ciclo while ma nel caso in cui la condizione
         * risulti falsa il codice all'interno viene eseguito almeno 1 volta:
         */
        boolean var = false;
        do {
            System.out.println("Do while Loop!");

        } while (var);
        /*
         * In questo caso la Stringa viene stampata solo una volta in quanto la
         * condizione é falsa, se con questo stesso ciclo boolean var = true; entreremmo
         * in un loop infinito
         */

        // --------- // ---------------- //
        /*
         * 4. Strutture condizionali: servono per condizionare l'esecuzione del codice
         * scritto:
         */

        int x = 10;
        if (x == 10) {
            System.out.println("x é uguale a 10");

        } else if (x < 10) {
            System.out.println("x é minore di 10");

        } else {
            System.out.println("x é maggiore di 10");
        }
        /*
         * In questo caso l'if verifica la condizione e se risultasse vera eseguirebbe
         * quella parte di codice, con l'else if aggiungiamo altre possibili condizioni
         * da verificare, mentre il codice all'interno dell'else viene eseguito nel caso
         * in cui tutte le condizioni precedenti risultassero false.
         * else if ed else possono esistere solo se collegate ad un if mentre un if puó
         * esistere anche singolarmente.
         */

        // Un altro tipo di struttura condizionale é lo switch:
        int y = 2;
        switch (y) {
            case 1:
                System.out.println("y vale 1");
                break;
            case 2:
                System.out.println("y vale 2");
                break;
            default:
                System.out.println("y non vale né 1 né 2");
        }
        /*
         * In questo caso lo switch verifica il valore di y ed esegue di conseguenza il
         * codice.
         */
        // --------------------------------------------------------------------------------

        // QUESITO 4: ------------------------
        /*
         * I metodi, chiamati anche funzioni sono delle parti di codice che possiamo
         * comodamente riutilizzare in tutto il nostro script
         * ad esempio il metodo sum ha come parametri x ed y e ritorna la somma dei due
         * numeri che noi passiamo come argomento, quindi se vogliamo sapere la somma
         * tra 2 e 5:
         */
        sum(2, 5);
        /*
         * L'overloading é un meccanismo che ci permette di utilizzare lo stesso metodo
         * ma di farlo funzionare in maniera divera in base al numero di argomenti che
         * passiamo tra parentesi.
         */
        // --------------------------------------------------------------------------------

        // QUESITO 5: ------------------------------
        /*
         * L'incapsulamento funzionale si ottiene utilizzando il modificatore
         * "private". In questo modo se si prova ad accedere al metodo o alla variabile
         * dall'esterno si otterrá un errore in quanto quel metodo/variabile é
         * accessibile solo dalla classe stessa.
         */
        // --------------------------------------------------------------------------------

        // QUESITO 6: -----------------------------------
        /*
         * Il casting serve per convertire una variabile di un tipo in un altro tipo, ad
         * esempio se voglio trasformare un int in un double:
         */
        int z = 10;
        // lo casto in un double -->
        double zToDouble = z;
        System.out.println("z double --> " + zToDouble);
        /*
         * Esiste il casting implicito ed esplicito, in questo caso ho affettuato un
         * casting esplicito.
         */
        // --------------------------------------------------------------------------------

        // QUESITO 7: ---------------------------
        /*
         * La tipizzazione forte (come quella presente in Java) obbliga a dichiarare il
         * tipo di dato nel momento in cui dichiariamo la variabile.
         * Quella debole (come quella presente su JavaScript) non obbliga la
         * dichiarazione ma la tipizzazione avviene durante l'interpretazione (?)
         */
        // --------------------------------------------------------------------------------

        // QUESITO 8: ------------------------------------
        /*
         * La differenza principale tra array e ArrayList é che un array una volta
         * dichiarato non puó essere modificato in lunghezza
         * (non possiamo aggiungere o rimuovere elementi ma solo modificare il valore di
         * quelli giá esistenti)
         * mentre negli ArrayList possiamo modificarli tramite i metodi .add(), .set(),
         * .remove()
         */

    }

    static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
