import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Begin begin = new Begin();
        Scanner myScan = new Scanner(System.in);
        int menuPoint = myScan.nextInt();
        switch (menuPoint) {
            case 1:
                begin.begin1();
                break;
            case 2:
                begin.begin2();
                break;
        }


    }
}
