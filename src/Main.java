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

    private static void task1() {
        System.out.println("задача1");
        int money = 15000;
        int totalMoney = 0;
        int i = 0;
        while (totalMoney <= 2459000) {
            System.out.println("Месяц " + i + " сумма накоплений равна " +
                    totalMoney + " рублей");
            totalMoney = totalMoney + money;
            i = i + 1;
        }
    }

    private static void task2() {
        System.out.println("Задача2");
        int start = 1;
        while (10 >= start) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
    }

    private static void task3() {
        System.out.println();
        System.out.println("Задача3");
        int population = 12000000;
        int birthPer1YearNa1k = population / 1000 * 17;
        ;
        int deadPer1YearNa1k = population / 1000 * 8;
        for (int i = 1; i <= 10; i = i + 1) {
            population = population + birthPer1YearNa1k - deadPer1YearNa1k;
            System.out.println("Год " + i + ", численность составляет " + population);
        }
    }

    private static void task4() {
        System.out.println("Задача4");
        double money = 15000;
        double d = 0.07;
        for (int i = 1; money <= 12000000; i = i + 1) {
            money = money + money * 0.07;
            System.out.println("Месяц " + i + " сумма накоплений составляет " + money);
        }
    }

    private static void task5() {
        System.out.println("Задача5");
        int money = 15000;
        int totalMoney = 0;
        for (int i = 1; totalMoney <= 12000000; i = i + 1) {
            totalMoney = totalMoney + money + (money / 100 * 7);
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " сумма накоплений составляет " + totalMoney);
        }
    }

    private static void task6() {
        System.out.println("Задача6");
        int money = 15000;
        int totalMoney = 0;
        int monthPer9Years = 108;
        for (int i = 1; i <= monthPer9Years; i = i + 1) {
            totalMoney = totalMoney + money + (money / 100 * 7);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма " + totalMoney);
            }
        }
        System.out.println(totalMoney);
    }

    private static void task7() {
        System.out.println("Задача7");
        int friday = 5;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + " число. Необходимо подготовить отчет");
        }
    }

    private static void task8() {
        System.out.println("Задача8.");
        int start = 1823;
        int end = 2123;
        for (int i = start; i < end; i = i + 1) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}