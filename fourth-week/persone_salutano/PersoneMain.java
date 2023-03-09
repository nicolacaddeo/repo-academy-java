package persone_salutano;

public class PersoneMain {
    public static void main(String[] args) {
        Persona luca = new Persona("Luca");
        Persona marco = new Persona("Marco");
        Persona nicola = new Persona("Nicola");

        luca.Saluta();
        marco.Saluta();
        nicola.Saluta();

        Pirata jackSparrow = new Pirata("Jack Sparrow");
        // ((Persona) jackSparrow).Saluta();

    }
}
