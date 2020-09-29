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
                    booleanTask();
                    break;
                case 4:
                    ifTask();
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
                case 1 -> begin.begin1();
                case 2 -> begin.begin2();
                case 3 -> begin.begin3();
                case 4 -> begin.begin4();
                case 5 -> begin.begin5();
                case 6 -> begin.begin6();
                case 7 -> begin.begin7();
                case 8 -> begin.begin8();
                case 9 -> begin.begin9();
                case 10 -> begin.begin10();
                case 11 -> begin.begin11();
                case 12 -> begin.begin12();
                case 13 -> begin.begin13();
                case 14 -> begin.begin14();
                case 15 -> begin.begin15();
                case 16 -> begin.begin16();
                case 17 -> begin.begin17();
                case 18 -> begin.begin18();
                case 19 -> begin.begin19();
                case 20 -> begin.begin20();
                case 21 -> begin.begin21();
                case 22 -> begin.begin22();
                case 23 -> begin.begin23();
                case 24 -> begin.begin24();
                case 25 -> begin.begin25();
                case 26 -> begin.begin26();
                case 27 -> begin.begin27();
                case 28 -> begin.begin28();
                case 29 -> begin.begin29();
                case 30 -> begin.begin30();
                case 31 -> begin.begin31();
                case 32 -> begin.begin32();
                case 33 -> begin.begin33();
                case 34 -> begin.begin34();
                case 35 -> begin.begin35();
                case 36 -> begin.begin36();
                case 37 -> begin.begin37();
                case 38 -> begin.begin38();
                case 39 -> begin.begin39();
                case 40 -> begin.begin40();
                default -> System.out.println("Введите номер задачи 1-40");
            }
        }
    }

    static void integerTask() {
        while (true) {
            IntegerTasks integerTasks = new IntegerTasks();
            System.out.println("Введите номер задачи из блока INTEGER (1-30)");
            int integerMenuPoint = myScan.nextInt();
            switch (integerMenuPoint) {
                case 1 -> integerTasks.integer1();
                case 2 -> integerTasks.integer2();
                case 3 -> integerTasks.integer3();
                case 4 -> integerTasks.integer4();
                case 5 -> integerTasks.integer5();
                case 6 -> integerTasks.integer6();
                case 7 -> integerTasks.integer7();
                case 8 -> integerTasks.integer8();
                case 9 -> integerTasks.integer9();
                case 10 -> integerTasks.integer10();
                case 11 -> integerTasks.integer11();
                case 12 -> integerTasks.integer12();
                case 13 -> integerTasks.integer13();
                case 14 -> integerTasks.integer14();
                case 15 -> integerTasks.integer15();
                case 16 -> integerTasks.integer16();
                case 17 -> integerTasks.integer17();
                case 18 -> integerTasks.integer18();
                case 19 -> integerTasks.integer19();
                case 20 -> integerTasks.integer20();
                case 21 -> integerTasks.integer21();
                case 22 -> integerTasks.integer22();
                case 23 -> integerTasks.integer23();
                case 24 -> integerTasks.integer24();
                case 25 -> integerTasks.integer25();
                case 26 -> integerTasks.integer26();
                case 27 -> integerTasks.integer27();
                case 28 -> integerTasks.integer28();
                case 29 -> integerTasks.integer29();
                case 30 -> integerTasks.integer30();
                default -> System.out.println("Введите номер задачи 1-30");
            }
        }
    }

    static void booleanTask() {
        while (true) {
            BooleanTasks booleanTasks = new BooleanTasks();
            System.out.println("Введите номер задачи из блока BOOLEAN (1-40)");
            int booleanMenuPoint = myScan.nextInt();
            switch (booleanMenuPoint) {
                case 1 -> booleanTasks.boolean1();
                case 2 -> booleanTasks.boolean2();
                case 3 -> booleanTasks.boolean3();
                case 4 -> booleanTasks.boolean4();
                case 5 -> booleanTasks.boolean5();
                case 6 -> booleanTasks.boolean6();
                case 7 -> booleanTasks.boolean7();
                case 8 -> booleanTasks.boolean8();
                case 9 -> booleanTasks.boolean9();
                case 10 -> booleanTasks.boolean10();
                case 11 -> booleanTasks.boolean11();
                case 12 -> booleanTasks.boolean12();
                case 13 -> booleanTasks.boolean13();
                case 14 -> booleanTasks.boolean14();
                case 15 -> booleanTasks.boolean15();
                case 16 -> booleanTasks.boolean16();
                case 17 -> booleanTasks.boolean17();
                case 18 -> booleanTasks.boolean18();
                case 19 -> booleanTasks.boolean19();
                case 20 -> booleanTasks.boolean20();
                case 21 -> booleanTasks.boolean21();
                case 22 -> booleanTasks.boolean22();
                case 23 -> booleanTasks.boolean23();
                case 24 -> booleanTasks.boolean24();
                case 25 -> booleanTasks.boolean25();
                case 26 -> booleanTasks.boolean26();
                case 27 -> booleanTasks.boolean27();
                case 28 -> booleanTasks.boolean28();
                case 29 -> booleanTasks.boolean29();
                case 30 -> booleanTasks.boolean30();
                case 31 -> booleanTasks.boolean31();
                case 32 -> booleanTasks.boolean32();
                case 33 -> booleanTasks.boolean33();
                case 34 -> booleanTasks.boolean34();
                case 35 -> booleanTasks.boolean35();
                case 36 -> booleanTasks.boolean36();
                case 37 -> booleanTasks.boolean37();
                case 38 -> booleanTasks.boolean38();
                case 39 -> booleanTasks.boolean39();
                case 40 -> booleanTasks.boolean40();
                default -> System.out.println("Введите номер задачи 1-40");
            }
        }
    }

    static void ifTask() {
        while (true) {
            IfTasks ifTasks = new IfTasks();
            System.out.println("Введите номер задачи из блока IF (1-30)");
            int ifMenuPoint = myScan.nextInt();
            switch (ifMenuPoint) {
                case 1 -> ifTasks.if1();
                case 2 -> ifTasks.if2();
                case 3 -> ifTasks.if3();
                case 4 -> ifTasks.if4();
                case 5 -> ifTasks.if5();
                case 6 -> ifTasks.if6();
                case 7 -> ifTasks.if7();
                case 8 -> ifTasks.if8();
                case 9 -> ifTasks.if9();
                case 10 -> ifTasks.if10();
                case 11 -> ifTasks.if11();
                case 12 -> ifTasks.if12();
                case 13 -> ifTasks.if13();
                case 14 -> ifTasks.if14();
                case 15 -> ifTasks.if15();
                case 16 -> ifTasks.if16();
                case 17 -> ifTasks.if17();
                case 18 -> ifTasks.if18();
                case 19 -> ifTasks.if19();
                case 20 -> ifTasks.if20();
                case 21 -> ifTasks.if21();
                case 22 -> ifTasks.if22();
                case 23 -> ifTasks.if23();
                case 24 -> ifTasks.if24();
                case 25 -> ifTasks.if25();
                case 26 -> ifTasks.if26();
                case 27 -> ifTasks.if27();
                case 28 -> ifTasks.if28();
                case 29 -> ifTasks.if29();
                case 30 -> ifTasks.if30();
                default -> System.out.println("Введите номер задачи 1-30");
            }
        }
    }
}
