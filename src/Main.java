public class Main {
    public static void main(String[] args) {
        System.out.println("//task 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("//task 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }
        System.out.println("//task 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);

        }
        System.out.println("//task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);

        }

        System.out.println("//task 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("високосный год " + i);
        }
        System.out.println("//task 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("//task 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("//task 8 and 9");
        int monthMoney = 29000;
        int totalMoney = 0;
        for (int i = 1; i <= 12; i++) {
            totalMoney = totalMoney + monthMoney;
            totalMoney = totalMoney + totalMoney/100;

            System.out.println("месяц " + i + " сумма накоплений равна " + totalMoney);

        }
    }
}
