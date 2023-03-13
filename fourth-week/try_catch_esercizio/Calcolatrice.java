package try_catch_esercizio;

public class Calcolatrice {
    private int number1;
    private int number2;
    private int[] results;

    int index = 0;

    Calcolatrice(int num1, int num2, int[] results) {
        this.number1 = num1;
        this.number2 = num2;
        this.results = results = new int[4];

    }

    public int Addizione() {
        int sum = this.number1 + this.number2;
        addResult(sum);
        return sum;
    }

    public int Sottrazione() {
        int sub = this.number1 - this.number2;
        addResult(sub);
        return sub;
    }

    public int Divisione() {
        int div = this.number1 / this.number2;
        addResult(div);
        return div;
    }

    public void addResult(int number) {
        if (this.index < this.results.length) {
            this.results[index] = number;
            this.index++;
        } else {
            System.out.println("Spazio in memoria esaurito");
        }
    }

}
