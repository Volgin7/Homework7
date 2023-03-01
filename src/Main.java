public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        System.out.println("Задача 1");
        int deposit = 0;
        int monthlyDeposit = 15_000;
        int targetDeposit = 2_459_000;
        int monthCount = 0;
        while (deposit < targetDeposit) {
            deposit += monthlyDeposit;
            monthCount++;
        }
        System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + deposit + " рублей");
    } // End of task

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    } // End of task

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int growthRate = birthRate - deathRate;
        for (int i=1; i <= 10; i++) {
            population += population * growthRate / 1_000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    } // End of task

    public static void task4() {
        System.out.println("Задача 4");
        float deposit =  15_000f;
        float interestRate = 0.07f;
        float targetDeposit = 12_000_000f;
        for (int i=1; deposit < targetDeposit; i++) {
            deposit *= 1 + interestRate;
            System.out.println("Месяц = " + i + ", сумма вклада = " + deposit + " рублей");
        }
    } // End of task

    public static void task5() {
        System.out.println("Задача 5");
        float deposit =  15_000f;
        float interestRate = 0.07f;
        float targetDeposit = 12_000_000f;
        for (int i=1; deposit < targetDeposit; i++) {
            deposit *= 1 + interestRate;
            if (i % 6 == 0) {
                System.out.println("Месяц = " + i + ", сумма вклада = " + deposit + " рублей");
            }
        }
    } // End of task

    public static void task6() {
        System.out.println("Задача 5");
        float deposit =  15_000f;
        float interestRate = 0.07f;
        int yearsToSave = 9;
        int monthsToSave = yearsToSave * 12;
        for (int i=1; i <= monthsToSave; i++) {
            deposit *= 1 + interestRate;
            if (i % 6 == 0) {
                System.out.println("Месяц = " + i + ", сумма вклада = " + deposit + " рублей");
            }
        }
    } // End of task

    public static void task7() {
        System.out.println("Задача 7");
        int firstFridayInMonth = 7;
        int daysInMonth = 31;
        int countToNextFriday = 0;

        for (int i=firstFridayInMonth; i <= daysInMonth; i++) {
            if (countToNextFriday % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-e число. Необходимо подготовить отчет");
            }
            countToNextFriday++;
        }
    } // End of task

    public static void task8() {
        System.out.println("Задача 8");
        int cometTurnoverPeriod = 79;
        int beginingOfPeriod = 2023 - 200;
        int endOfPeriod = 2023 + 100;
        for (int year=beginingOfPeriod; year <= endOfPeriod; year++) {
            if (year % cometTurnoverPeriod == 0) {
                System.out.println(year);
            }
        }
    } // End of task

} // End of main