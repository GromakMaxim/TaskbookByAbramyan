import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Begin begin = new Begin();
        Scanner myScan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер задачи из блока BEGIN (1-40)");
            int menuPoint = myScan.nextInt();
            switch (menuPoint) {
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
                default:
                    System.out.println("Введите номер задачи 1-40");
                    break;
            }
        }
    }
}
