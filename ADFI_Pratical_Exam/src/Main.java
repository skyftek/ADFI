import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Motor m = new Motor();
        m.inputName(scanner);
        m.showInfo();
        Car c = new Car();
        c.inputName(scanner);
        c.showInfo();
    }
}
