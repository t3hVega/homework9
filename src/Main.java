public class Main {
    public static void main(String[] args) {
        tasks1_2_3();
        System.out.println("ДЗ сделано");
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void tasks1_2_3() {
        int [] spendings = generateRandomArray();
        int overallSpendings = 0;
        for (int i = 0; i < spendings.length; i++) {
            System.out.println(spendings[i]);
            overallSpendings += spendings[i];
        }
        System.out.println("Сумма трат за месяц составила " + overallSpendings + " рублей");
        int minSpendings = 200001;
        int maxSpendings = 99999;
        for (int i = 0; i < spendings.length; i++) {
            if (spendings[i] > maxSpendings){
                maxSpendings = spendings[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpendings + " рублей");
        for (int i = 0; i < spendings.length; i++) {
            if (spendings[i] < minSpendings){
                minSpendings = spendings[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendings + " рублей");
        double midSpendings = overallSpendings / 30;
        System.out.println("Средняя сумма трат за день составила " + midSpendings + " рублей");
    }
}