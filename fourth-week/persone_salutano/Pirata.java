package persone_salutano;

public class Pirata extends Persona {

    Pirata(String name) {
        super(name);
    }

    @Override
    public void Saluta() {
        System.out.println("Corpo di mille balene mi chiamo ");
    }
}
