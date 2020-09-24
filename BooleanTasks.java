import java.util.Scanner;

public class BooleanTasks {
    private final Scanner myScan = new Scanner(System.in);

    public void boolean1() {
        System.out.println("Boolean1. Дано целое число A. " +
                "Проверить истинность высказывания: «Число A является положительным».");
        double A = myScan.nextInt();
        if (A > 0) {
            System.out.println("Число A является положительным");
        }
    }

    public void boolean2() {
        System.out.println("Boolean2. Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».");
        double A = myScan.nextInt();
        if (A % 2 != 0) {
            System.out.println("Число A является нечетным");
        }
    }

    public void boolean3() {
        System.out.println("Boolean3. Дано целое число A. Проверить истинность высказывания: «Число A является четным».");
        double A = myScan.nextInt();
        if (A % 2 == 0) {
            System.out.println("Число A является четным");
        }
    }

    public void boolean4() {
        System.out.println("Boolean4. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Справедливы неравенства A > 2 и B ≤ 3».");
        System.out.println("Введите число А");
        double A = myScan.nextInt();
        System.out.println("Введите число B");
        double B = myScan.nextInt();
        if (A > 2 && B <= 3) {
            System.out.println("TRUE. A > 2 и B ≤ 3");
        }
    }

    public void boolean5() {
        System.out.println("Boolean5. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Справедливы неравенства A ≥ 0 или B < −2».");
        System.out.println("Введите число А");
        double A = myScan.nextInt();
        System.out.println("Введите число B");
        double B = myScan.nextInt();
        if (A >= 0 || B < -2) {
            System.out.println("TRUE. A ≥ 0 или B < −2");
        }
    }

    public void boolean6() {
        System.out.println("Boolean6. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».");
        System.out.println("Введите число А");
        double A = myScan.nextInt();
        System.out.println("Введите число B");
        double B = myScan.nextInt();
        System.out.println("Введите число C");
        double C = myScan.nextInt();
        if (A < B && B < C) {
            System.out.println("TRUE. A < B < C");
        }
    }

    public void boolean7() {
        System.out.println("Boolean7. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Число B находится между числами A и C».");
        System.out.println("Введите число А");
        double A = myScan.nextInt();
        System.out.println("Введите число B");
        double B = myScan.nextInt();
        System.out.println("Введите число C");
        double C = myScan.nextInt();

        if ((A < B && B < C) || (C < B && B < A)) {
            System.out.println("TRUE. Число B находится между числами A и C");
        }
    }

    public void boolean8() {
        System.out.println("Boolean8. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Каждое из чисел A и B нечетное».");
        System.out.println("Введите число А");
        double A = myScan.nextInt();
        System.out.println("Введите число B");
        double B = myScan.nextInt();

        if (A % 2 != 0 && B % 2 != 0) {
            System.out.println("TRUE. Каждое из чисел A и B нечетное");
        }
    }

    public void boolean9() {
        System.out.println("Boolean9. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Хотя бы одно из чисел A и B нечетное».");
        System.out.println("Введите число А");
        double A = myScan.nextInt();
        System.out.println("Введите число B");
        double B = myScan.nextInt();

        if (A % 2 != 0 || B % 2 != 0) {
            System.out.println("TRUE. Хотя бы одно из чисел A и B нечетное");
        }
    }

    public void boolean10() {
        System.out.println("Boolean10. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Ровно одно из чисел A и B нечетное».");
        System.out.println("Введите число А");
        double A = myScan.nextInt();
        System.out.println("Введите число B");
        double B = myScan.nextInt();

        if ((A + B) % 2 != 0) {
            System.out.println("TRUE. Ровно одно из чисел A и B нечетное");
        }
    }
}
