public class Persona {
    String name = "Nicola";
    String surName = "";
    int age;

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println(persona1.name);
        persona1.surName = "Caddeo";
        System.out.println(persona1.surName);
        Persona persona2 = new Persona();
        persona2.age = 23;
        System.out.println(persona2.age);
    }
}
