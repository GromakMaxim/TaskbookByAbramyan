import java.util.Scanner;

public class WhileTasks {
    private final Scanner myScan = new Scanner(System.in);

    public void while1() {
        System.out.println("While1. Даны положительные числа A и B (A > B). На отрезке длины A размещено " +
                "максимально возможное количество отрезков длины B (без наложений). \n" +
                "Не используя операции умножения и деления, найти длину незанятой части отрезка A.");
        System.out.println("Введите A");
        int A = myScan.nextInt();
        System.out.println("Введите B");
        int B = myScan.nextInt();
        if (A <= B) {
            System.out.println("Ошибка");
        } else {
            int length = 0;
            while (A - length > B) {
                length += B;
            }
            System.out.println("Ответ: " + (A - length));
        }
    }

    public void while2() {
        System.out.println("While2. Даны положительные числа A и B (A > B). На отрезке длины A размещено " +
                "максимально возможное количество отрезков длины B (без наложений). \n" +
                "Не используя операции умножения и деления, найти количество отрезков B, размещенных на отрезке A.");
        System.out.println("Введите A");
        int A = myScan.nextInt();
        System.out.println("Введите B");
        int B = myScan.nextInt();
        if (A <= B) {
            System.out.println("Ошибка");
        } else {
            int length = 0;
            int count = 0;
            while (A - length > B) {
                length += B;
                count++;
            }
            System.out.println("Ответ: " + count);
        }
    }

    public void while3() {
        System.out.println("While3. Даны целые положительные числа N и K. Используя только операции сложения " +
                "и вычитания, \n найти частное от деления нацело N на K, а также остаток от этого деления.");
        System.out.println("Введите N");
        int N = myScan.nextInt();
        System.out.println("Введите K");
        int K = myScan.nextInt();
        int count = 0;
        while (N >= K) {
            N -= K;
            count++;
        }
        System.out.println("Частное от деления нацело: " + count);
        System.out.println("Частное от деления нацело: " + N);
    }

    public void while4() {
        System.out.println("While4. Дано целое число N (> 0). Если оно является степенью числа 3, то вывести TRUE, \n" +
                "если не является — вывести FALSE.");
        System.out.println("Введите N");
        int N = myScan.nextInt();
        if (N <= 0) {
            System.out.println("Ошибка!");
        } else {
            int value = 3;
            System.out.println(value == N ? true : "");
            if (value == N) {
                System.out.println("true");
            } else {
                boolean result = false;
                while (value < N) {
                    value *= 3;
                    if (value == N) result = true;
                }
                System.out.println(result);
            }

        }
    }

    public void while5() {
        System.out.println("While5. Дано целое число N (> 0), являющееся некоторой степенью числа 2:\n" +
                "N = 2^K. Найти целое число K — показатель этой степени.");
        System.out.println("Введите N");
        int N = myScan.nextInt();
        if (N <= 0) {
            System.out.println("Ошибка!");
        } else {
            int i = 0;
            while (true) {
                if (N == Math.pow(2, i)) {
                    System.out.println("Ответ: " + i);
                    break;
                } else {
                    if (N > Math.pow(2, i)) {
                        i++;
                    } else {
                        System.out.println("Не является квадратом числа 2");
                        break;
                    }
                }
            }
        }
    }

    public void while6() {
        System.out.println("While6. Дано целое число N (> 0). Найти двойной факториал N: \n" +
                "N!! = N·(N−2)·(N−4)·. . ." +
                "(последний сомножитель равен 2, если N — четное, и 1, если N — нечетное).\n" +
                "Чтобы избежать целочисленного переполнения, вычислять это произведение с помощью " +
                "вещественной переменной и вывести его как вещественное число.");
        System.out.println("Введите N");
        int N = myScan.nextInt();
        if (N <= 0) {
            System.out.println("Ошибка");
        } else {
            long sum = 1;
            int i = N % 2 == 0 ? 2 : 1;
            for (int j = i; j < N + 1; j = j + 2) {
                sum = sum * j;
            }
            System.out.println(sum);
        }
    }

    public void while7() {
        System.out.println("While7. Дано целое число N (> 0). Найти наименьшее целое положительное число K, " +
                "квадрат которого превосходит N: K^2 > N. Функцию извлечения квадратного корня не использовать.");
        System.out.println("Введите N");
        int N = myScan.nextInt();
        if (N <= 0) {
            System.out.println("Ошибка");
        } else {
            int K = 1;
            while (K * K <= N) {
                K++;
            }
            System.out.println(K);
        }
    }

    public void while8() {
        System.out.println("While8. Дано целое число N (> 0). Найти наибольшее целое число K, " +
                "квадрат которого не превосходит N: K^2 ≤ N. Функцию извлечения квадратного корня не использовать.");
        System.out.println("Введите N");
        int N = myScan.nextInt();
        if (N <= 0) {
            System.out.println("Ошибка");
        } else {
            int K = 1;
            while (K * K <= N) {
                K++;
            }
            System.out.println(K - 1);
        }
    }

    public void while9() {
        System.out.println("While9. Дано целое число N (> 1). Найти наименьшее целое число K, при котором выполняется " +
                "неравенство 3K > N.");
        System.out.println("Введите N");
        int N = myScan.nextInt();
        if (N <= 1) {
            System.out.println("Ошибка");
        } else {
            int K = 1;
            while (3 * K <= N) {
                K++;
            }
            System.out.println(K - 1);
        }
    }

    public void while10() {
        System.out.println("While10. Дано целое число N (> 1). Найти наибольшее целое число K, при котором выполняется " +
                "неравенство 3K < N.");
        System.out.println("Введите N");
        int N = myScan.nextInt();
        if (N <= 1) {
            System.out.println("Ошибка");
        } else {
            int K = 1;
            while (3 * (K + 1) < N) {
                K++;
            }
            System.out.println(K);
        }
    }

    public void while11() {
        System.out.println("While11. Дано целое число N (> 1). Вывести наименьшее из целых чисел K, для которых " +
                "сумма 1 + 2 + . . . + K будет больше или равна N, и саму эту сумму.");
    }

    public void while12() {
        System.out.println("While12. Дано целое число N (> 1). Вывести наибольшее из целых чисел K, для которых " +
                "сумма 1 + 2 + . . . + K будет меньше или равна N, и саму эту сумму.");
    }

    public void while13() {
        System.out.println("While13. Дано число A (> 1). Вывести наименьшее из целых чисел K, для которых " +
                "сумма 1 + 1/2 + . . . + 1/K будет больше A, и саму эту сумму.");
    }

    public void while14() {
        System.out.println("While14. Дано число A (> 1). Вывести наибольшее из целых чисел K, для\n" +
                "    которых сумма 1 + 1/2 + . . . + 1/K будет меньше A, и саму эту сумму.");
    }

    public void while15() {
        System.out.println("While15. Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада " +
                "увеличивается на P процентов от имеющейся суммы (P — вещественное число, 0 < P < 25). \n" +
                "По данному P определить, через сколько месяцев размер вклада превысит 1100 руб., \n" +
                "и вывести найденное количество месяцев K (целое число) и итоговый размер вклада S (вещественное число).");
    }

    public void while16() {
        System.out.println("While16. Спортсмен-лыжник начал тренировки, пробежав в первый день 10 км.\n" +
                "Каждый следующий день он увеличивал длину пробега на P процентов от пробега предыдущего дня " +
                "(P — вещественное, 0 < P < 50).\n По данному P определить, после какого дня суммарный пробег лыжника " +
                "за все дни превысит 200 км, и вывести найденное количество дней K (целое) и суммарный пробег S " +
                "(вещественное число).");
    }

    public void while17() {
        System.out.println("While17. Дано целое число N (>0). Используя операции деления нацело и взятия остатка " +
                "от деления, вывести все его цифры, начиная с самой правой (разряда единиц).");
    }

    public void while18() {
        System.out.println("While18. Дано целое число N (> 0). Используя операции деления нацело и взятия остатка " +
                "от деления, найти количество и сумму его цифр.");
    }

    public void while19() {
        System.out.println("While19. Дано целое число N (> 0). Используя операции деления нацело и взятия остатка " +
                "от деления, найти число, полученное при прочтении числа N справа налево.");
    }

    public void while20() {
        System.out.println("While20. Дано целое число N (> 0). С помощью операций деления нацело и взятия остатка " +
                "от деления определить, имеется ли в записи числа N цифра «2». \n" +
                "Если имеется, то вывести TRUE, если нет — вывести FALSE.");
    }

    public void while21() {
        System.out.println("While21. Дано целое число N (> 0). С помощью операций деления нацело и взятия остатка " +
                "от деления определить, имеются ли в записи числа N нечетные цифры. \n" +
                "Если имеются, то вывести TRUE, если нет — вывести FALSE.");
    }

    public void while22() {
        System.out.println("While22. Дано целое число N (> 1). Если оно является простым, то есть не имеет " +
                "положительных делителей, кроме 1 и самого себя, то вывести TRUE, иначе вывести FALSE.");
    }

    public void while23() {
        System.out.println("While23. Даны целые положительные числа A и B. Найти их наибольший общий делитель (НОД), \n" +
                "используя алгоритм Евклида: НОД(A, B) = НОД(B, A mod B), если B 6= 0; НОД(A, 0) = A.");

    }

    public void while24() {
        System.out.println("While24. Дано целое число N (> 1). Последовательность чисел Фибоначчи FK\\n\" +\n" +
                "                \"    определяется следующим образом:\\n\" +\n" +
                "                \"    F1 = 1, F2 = 1, FK = FK−2 + FK−1, K = 3, 4, . . . .\\n\" +\n" +
                "                \"    Проверить, является ли число N числом Фибоначчи. Если является, то\\n\" +\n" +
                "                \"    вывести TRUE, если нет — вывести FALSE.\");");
    }

    public void while25() {
        System.out.println("While25. Дано целое число N (> 1). Найти первое число Фибоначчи, большее N. " +
                "(определение чисел Фибоначчи дано в задании While24).");
    }

    public void while26() {
        System.out.println("While26. Дано целое число N (> 1), являющееся числом Фибоначчи: \n" +
                "N = FK (определение чисел Фибоначчи дано в задании While24). " +
                "Найти целые числа FK−1 и FK+1 — предыдущее и последующее числа Фибоначчи.");
    }

    public void while27() {
        System.out.println("While27. Дано целое число N (> 1), являющееся числом Фибоначчи: \n" +
                "N = FK (определение чисел Фибоначчи дано в задании While24). " +
                "Найти целое число K — порядковый номер числа Фибоначчи N.");
    }

    public void while28() {
        System.out.println("While28. Дано вещественное число ε (> 0). Последовательность вещественных чисел AK " +
                "определяется следующим образом: \n A1 = 2, AK = 2 + 1/AK−1, K = 2, 3, . . . . \n Найти первый из " +
                "номеров K, для которых выполняется условие |AK − AK−1| < ε, и вывести этот номер, а также числа AK−1 и AK.");
    }

    public void while29() {
        System.out.println("While29. Дано вещественное число ε (> 0). Последовательность вещественных чисел AK " +
                "определяется следующим образом: \n" +
                "A1 = 1, A2 = 2, AK = (AK−2 + 2·AK−1)/3, K = 3, 4, . . . . \n" +
                "Найти первый из номеров K, для которых выполняется условие |AK − AK−1| < ε, и вывести этот номер, " +
                "а также числа AK−1 и AK.");
    }

    public void while30() {
        System.out.println("While30. Даны положительные числа A, B, C. На прямоугольнике размера A × B размещено " +
                "максимально возможное количество квадратов со стороной C (без наложений). \n" +
                "Найти количество квадратов, размещенных на прямоугольнике. Операции умножения и деления не использовать.");
    }
}
