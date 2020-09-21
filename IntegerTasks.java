import java.util.Scanner;

public class IntegerTasks {
    private final Scanner myScan = new Scanner(System.in);

    public void integer1() {
        System.out.println("Integer1. Дано расстояние L в сантиметрах. " +
                "Используя операцию деления нацело, найти количество полных метров в нем (1 метр = 100 см).");
        System.out.println("Введите расстояние в см");
        System.out.println("Количество полных метров в нём: " + myScan.nextInt() / 100);

    }
}
