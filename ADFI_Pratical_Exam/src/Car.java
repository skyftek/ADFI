import java.util.Scanner;

public class Car implements Vehicle {
    private String name;

    @Override
    public float moveMax() {
        return 250;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Car() {
    }

    public void inputName(Scanner scanner){
        System.out.println("- Input an vehicle name:");
        this.name = scanner.nextLine();
    }

    public void showInfo(){
        System.out.println(">> Car: " + this.name + " | Maximum velocity: " + this.moveMax());
    }
}
