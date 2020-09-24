import java.util.Scanner;

public class BooleanTasks {
    private final Scanner myScan = new Scanner(System.in);

    public void boolean1() {
        System.out.println("Boolean1. Дано целое число A. " +
                "Проверить истинность высказывания: «Число A является положительным».");
        double A = myScan.nextDouble();
        if (A > 0) {
            System.out.println("Число A является положительным");
        }
    }

    public void boolean2() {
        System.out.println("Boolean2. Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».");
        double A = myScan.nextDouble();
        if (A % 2 != 0) {
            System.out.println("Число A является нечетным");
        }
    }

    public void boolean3() {
        System.out.println("Boolean3. Дано целое число A. Проверить истинность высказывания: «Число A является четным».");
        double A = myScan.nextDouble();
        if (A % 2 == 0) {
            System.out.println("Число A является четным");
        }
    }

    public void boolean4() {
        System.out.println("Boolean4. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Справедливы неравенства A > 2 и B ≤ 3».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();

        if (A > 2 && B <= 3) {
            System.out.println("TRUE. A > 2 и B ≤ 3");
        }
    }

    public void boolean5() {
        System.out.println("Boolean5. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Справедливы неравенства A ≥ 0 или B < −2».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();

        if (A >= 0 || B < -2) {
            System.out.println("TRUE. A ≥ 0 или B < −2");
        }
    }

    public void boolean6() {
        System.out.println("Boolean6. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if (A < B && B < C) {
            System.out.println("TRUE. A < B < C");
        }
    }

    public void boolean7() {
        System.out.println("Boolean7. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Число B находится между числами A и C».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if ((A < B && B < C) || (C < B && B < A)) {
            System.out.println("TRUE. Число B находится между числами A и C");
        }
    }

    public void boolean8() {
        System.out.println("Boolean8. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Каждое из чисел A и B нечетное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();

        if (A % 2 != 0 && B % 2 != 0) {
            System.out.println("TRUE. Каждое из чисел A и B нечетное");
        }
    }

    public void boolean9() {
        System.out.println("Boolean9. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Хотя бы одно из чисел A и B нечетное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();

        if (A % 2 != 0 || B % 2 != 0) {
            System.out.println("TRUE. Хотя бы одно из чисел A и B нечетное");
        }
    }

    public void boolean10() {
        System.out.println("Boolean10. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Ровно одно из чисел A и B нечетное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        if ((A + B) % 2 != 0) {
            System.out.println("TRUE. Ровно одно из чисел A и B нечетное");
        }
    }

    public void boolean11() {
        System.out.println("Boolean11. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Числа A и B имеют одинаковую четность».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();

        if ((A + B) % 2 == 0) {
            System.out.println("TRUE. Числа A и B имеют одинаковую четность");
        }
    }

    public void boolean12() {
        System.out.println("Boolean12. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Каждое из чисел A, B, C положительное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();
        if (A > 0 && B > 0 && C > 0) {
            System.out.println("TRUE. Каждое из чисел A, B, C положительное");
        }
    }

    public void boolean13() {
        System.out.println("Boolean13. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Хотя бы одно из чисел A, B, C положительное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();
        if (A > 0 || B > 0 || C > 0) {
            System.out.println("TRUE. Хотя бы одно из чисел A, B, C положительное");
        }
    }

    public void boolean14() {
        System.out.println("Boolean14. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Ровно одно из чисел A, B, C положительное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if ((A > 0 && B <= 0 && C <= 0) || (B > 0 && A <= 0 && C <= 0) || (C > 0 && A <= 0 && B <= 0)) {
            System.out.println("TRUE. Ровно одно из чисел A, B, C положительное");
        }
    }

    public void boolean15() {
        System.out.println("Boolean15. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Ровно два из чисел A, B, C являются положительными».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if ((A > 0 && B > 0 && C < 0) || (A > 0 && C > 0 && B < 0) || (B > 0 && C > 0 && A < 0)) {
            System.out.println("TRUE. Ровно два из чисел A, B, C являются положительными");
        }
    }

    public void boolean16() {
        System.out.println("Boolean16. Дано целое положительное число. " +
                "Проверить истинность высказывания: «Данное число является четным двузначным».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        if (A > 9 && A < 100 && A % 2 == 0) {
            System.out.println("TRUE. Данное число является четным двузначным");
        }
    }

    public void boolean17() {
        System.out.println("Boolean17. Дано целое положительное число. " +
                "Проверить истинность высказывания: «Данное число является нечетным трехзначным».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        if (A > 99 && A < 1000 && A % 2 != 0) {
            System.out.println("TRUE. Данное число является нечетным трехзначным");
        }
    }

    public void boolean18() {
        System.out.println("Boolean18. Проверить истинность высказывания: " +
                "«Среди трех данных целых чисел есть хотя бы одна пара совпадающих».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();
        if (A == B || A == C || B == C) {
            System.out.println("TRUE. Среди трех чисел есть хотя бы одна пара совпадающих");
        }
    }

    public void boolean19() {
        System.out.println("Boolean19. Проверить истинность высказывания: " +
                "«Среди трех данных целых чисел есть хотя бы одна пара взаимно противоположных».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();
        if (A == -B || B == -C || C == -A) {
            System.out.println("TRUE. Среди трех чисел есть хотя бы одна пара взаимно противоположных");
        }
    }

    public void boolean20() {
        System.out.println("Boolean20. Дано трехзначное число. " +
                "Проверить истинность высказывания: «Все цифры данного числа различны».");
        System.out.println("Введите число: ");
        int value = myScan.nextInt();
        int A = value / 100;//сотни
        int B = value % 100 / 10;//десятки
        int C = value % 100 % 10;//единицы
        if (A != B && B != C && C != A) {
            System.out.println("TRUE. Все цифры данного числа различны");
        }
    }
}
