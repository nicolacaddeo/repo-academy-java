package third_week;

public class Object1 {
    String name = "Nicola";
    int age;
    boolean isAdult = false;

    void saluta() {
        System.out.println("Hello my name is " + name);
    }

    void setAdult() {
        if (age >= 18) {
            isAdult = true;
        }
    }

    public static void main(String[] args) {
        Object1 persona1 = new Object1();
        Object1 persona2 = new Object1();
        persona1.age = 16;
        persona2.age = 35;

        // System.out.println(persona1.name + " " + persona2.age);
        persona1.setAdult();
        persona2.setAdult();
        System.out.println("Persona 1 é maggiorenne?: " + persona1.isAdult);
        System.out.println("Persona 2 é maggiorenne?: " + persona2.isAdult);
        persona1.saluta();

    }
}
