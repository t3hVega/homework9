public class Main {
    public static void main(String[] args) {
        tasks1_2_3();
        task4();
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
        int minSpendings = spendings[0];
        int maxSpendings = spendings[0];
        for (int i = 0; i < spendings.length; i++) {
            if (spendings[i] > maxSpendings){
                maxSpendings = spendings[i];
            }
            if (spendings[i] < minSpendings){
                minSpendings = spendings[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpendings + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minSpendings + " рублей");
        double midSpendings = overallSpendings / spendings.length;
        System.out.println("Средняя сумма трат за день составила " + midSpendings + " рублей");
    }
    public static void task4() {
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}