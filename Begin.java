import java.util.Scanner;
class Begin {

    public void begin1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата, чтобы узнать его периметр");
        int side = input.nextInt();
        int perimetr = 4 * side;
        System.out.println(input.nextInt() * 4);
    }
}