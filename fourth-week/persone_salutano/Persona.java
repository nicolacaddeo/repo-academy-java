package persone_salutano;

public class Persona {
    private String name;

    Persona(String nome) {
        this.name = nome;
    }

    public void Saluta() {
        System.out.println("Ciao! sono " + name);
    }
}
