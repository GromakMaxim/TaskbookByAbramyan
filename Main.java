import java.util.Scanner;

public class Main {
    static Scanner myScan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите номер блока: (в скобках указано количество заданий для каждой группы)");
            System.out.println("1. Begin — ввод и вывод данных, оператор присваивания (40),\n" +
                    "2. Integer — целые числа (30),\n" +
                    "3. Boolean — логические выражения (40),\n" +
                    "4. If — условный оператор (30),\n" +
                    "5. Case — оператор выбора (20),\n" +
                    "6. For — цикл с параметром (40),\n" +
                    "7. While — цикл с условием (30),\n" +
                    "8. Series — последовательности (40),\n" +
                    "9. Proc — процедуры и функции (60),\n" +
                    "10. Minmax — минимумы и максимумы (30),\n" +
                    "11. Array — одномерные массивы (140),\n" +
                    "12. Matrix — двумерные массивы (матрицы) (100),\n" +
                    "13. String — символы и строки (70),\n" +
                    "14. File — двоичные файлы (90),\n" +
                    "15. Text — текстовые файлы (60),\n" +
                    "16. Param — составные типы данных в процедурах и функциях (70),\n" +
                    "17. Recur — рекурсия (30),\n" +
                    "18. Dynamic — динамические структуры данных (80).");
            int groupSelection = myScan.nextInt();
            switch (groupSelection) {
                case 1:
                    beginTask();
                    break;
                case 2:
                    integerTask();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                default:
                    System.out.println("Введите номер блока 1-18");
                    break;
            }
        }
    }

    static void beginTask() {
        while (true) {
            Begin begin = new Begin();
            System.out.println("Введите номер задачи из блока BEGIN (1-40)");
            int beginMenuPoint = myScan.nextInt();
            switch (beginMenuPoint) {
                case 1:
                    begin.begin1();
                    break;
                case 2:
                    begin.begin2();
                    break;
                case 3:
                    begin.begin3();
                    break;
                case 4:
                    begin.begin4();
                    break;
                case 5:
                    begin.begin5();
                    break;
                case 6:
                    begin.begin6();
                    break;
                case 7:
                    begin.begin7();
                    break;
                case 8:
                    begin.begin8();
                    break;
                case 9:
                    begin.begin9();
                    break;
                case 10:
                    begin.begin10();
                    break;
                case 11:
                    begin.begin11();
                    break;
                case 12:
                    begin.begin12();
                    break;
                case 13:
                    begin.begin13();
                    break;
                case 14:
                    begin.begin14();
                    break;
                case 15:
                    begin.begin15();
                    break;
                case 16:
                    begin.begin16();
                    break;
                case 17:
                    begin.begin17();
                    break;
                case 18:
                    begin.begin18();
                    break;
                case 19:
                    begin.begin19();
                    break;
                case 20:
                    begin.begin20();
                    break;
                case 21:
                    begin.begin21();
                    break;
                case 22:
                    begin.begin22();
                    break;
                case 23:
                    begin.begin23();
                    break;
                case 24:
                    begin.begin24();
                    break;
                case 25:
                    begin.begin25();
                    break;
                case 26:
                    begin.begin26();
                    break;
                case 27:
                    begin.begin27();
                    break;
                case 28:
                    begin.begin28();
                    break;
                case 29:
                    begin.begin29();
                    break;
                case 30:
                    begin.begin30();
                    break;
                case 31:
                    begin.begin31();
                    break;
                case 32:
                    begin.begin32();
                    break;
                case 33:
                    begin.begin33();
                    break;
                case 34:
                    begin.begin34();
                    break;
                case 35:
                    begin.begin35();
                    break;
                case 36:
                    begin.begin36();
                    break;
                case 37:
                    begin.begin37();
                    break;
                case 38:
                    begin.begin38();
                    break;
                case 39:
                    begin.begin39();
                    break;
                case 40:
                    begin.begin40();
                    break;
                default:
                    System.out.println("Введите номер задачи 1-40");
                    break;
            }
        }
    }

    static void integerTask() {
        while (true) {
            IntegerTasks integerTasks = new IntegerTasks();
            System.out.println("Введите номер задачи из блока INTEGER (1-30)");
            int integerMenuPoint = myScan.nextInt();
            switch (integerMenuPoint) {
                case 1:
                    integerTasks.integer1();
                    break;
                case 2:
                    integerTasks.integer2();
                    break;
                case 3:
                    integerTasks.integer3();
                    break;
                case 4:
                    integerTasks.integer4();
                    break;
                case 5:
                    integerTasks.integer5();
                    break;
                case 6:
                    integerTasks.integer6();
                    break;
                case 7:
                    integerTasks.integer7();
                    break;
                case 8:
                    integerTasks.integer8();
                    break;
                case 9:
                    integerTasks.integer9();
                    break;
                case 10:
                    integerTasks.integer10();
                    break;
                case 11:
                    integerTasks.integer11();
                    break;
                case 12:
                    integerTasks.integer12();
                    break;
                case 13:
                    integerTasks.integer13();
                    break;
                case 14:
                    integerTasks.integer14();
                    break;
                case 15:
                    integerTasks.integer15();
                    break;
                case 16:
                    integerTasks.integer16();
                    break;
                case 17:
                    integerTasks.integer17();
                    break;
                case 18:
                    integerTasks.integer18();
                    break;
                case 19:
                    integerTasks.integer19();
                    break;
                case 20:
                    integerTasks.integer20();
                    break;
                case 21:
                    integerTasks.integer21();
                    break;
                case 22:
                    integerTasks.integer22();
                    break;
                case 23:
                    integerTasks.integer23();
                    break;
                case 24:
                    integerTasks.integer24();
                    break;
                case 25:
                    integerTasks.integer25();
                    break;
                case 26:
                    integerTasks.integer26();
                    break;
                case 27:
                    integerTasks.integer27();
                    break;
                case 28:
                    integerTasks.integer28();
                    break;
                case 29:
                    integerTasks.integer29();
                    break;
                case 30:
                    integerTasks.integer30();
                    break;
                default:
                    System.out.println("Введите номер задачи 1-30");
            }
        }
    }
}
