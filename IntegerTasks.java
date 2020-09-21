import java.util.Scanner;

public class IntegerTasks {
    private final Scanner myScan = new Scanner(System.in);

    public void integer1() {
        System.out.println("Integer1. Дано расстояние L в сантиметрах. " +
                "Используя операцию деления нацело, найти количество полных метров в нем (1 метр = 100 см).");
        System.out.println("Введите расстояние в см");
        System.out.println("Количество полных метров в нём: " + myScan.nextInt() / 100);

    }

    public void integer2(){
        System.out.println("Integer2. Дана масса M в килограммах. " +
                "Используя операцию деления нацело, найти количество полных тонн в ней (1 тонна = 1000 кг).");
        System.out.println("Введите массу в кг");
        System.out.println("Кол-во полных тонн: " + myScan.nextInt() / 1000);
    }
}
