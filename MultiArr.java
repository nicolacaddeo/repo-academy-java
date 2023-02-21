public class MultiArr {
    public static void main(String[] args) {
        int[][] numbers = { { 10, 20, 30 }, { 100, 200, 300 } };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }

    }

}
