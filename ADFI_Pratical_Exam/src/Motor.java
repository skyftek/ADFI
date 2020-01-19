import java.util.Scanner;

public class Motor implements Vehicle {
    private String name;

    @Override
    public float moveMax() {
        return 150;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Motor() {
    }

    public void inputName(Scanner scanner){
        System.out.println("- Input an vehicle name:");
        this.name = scanner.nextLine();
    }

    public void showInfo(){
        System.out.println(">> Motor: " + this.name + " | Maximum velocity: " + this.moveMax());
    }
}
