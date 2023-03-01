package food_and_user;

public class User {
    String name;
    String password;
    int id;

    User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    static int getRandomBudget() {
        int min = 10; // valore minimo del budget
        int max = 50; // valore massimo del budget

        // Genero un budget tra i 10 e 50 euro
        int randomBudget = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomBudget;
    }
}
