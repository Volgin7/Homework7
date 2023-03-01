public class Main {
    public static void main(String[] args) {
        task1();
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


} // End of main