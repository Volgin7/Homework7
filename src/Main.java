public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int deposit = 0;
        int monthlyDeposit = 15_000;
        int targetDeposit = 2_459_000;
        int monthCount = 0;

        while ( deposit < targetDeposit) {
            deposit += monthlyDeposit;
            monthCount++;
        }
        System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + deposit + " рублей");
    } // End of task

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while ( i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i  >= 1; i--) {
            System.out.print(i + " ");
        }
    } // End of task

} // End of main