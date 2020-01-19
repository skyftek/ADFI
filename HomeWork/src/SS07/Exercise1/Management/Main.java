package SS07.Exercise1.Management;

import SS07.Exercise1.Entity.Circle;
import SS07.Exercise1.Entity.Rectangle;
import SS07.Exercise1.Entity.Square;
import SS07.Exercise1.Entity.Triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Circle> l_circle = new ArrayList<>();
    private static ArrayList<Rectangle> l_rectangle = new ArrayList<>();
    private static ArrayList<Square> l_square = new ArrayList<>();
    private static ArrayList<Triangle> l_triangle = new ArrayList<>();

    public static void main(String[] args) {
        Main m = new Main();
        int choose;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n***IShape Management System***");
            System.out.println("1. Them 1 hinh tam giac vao danh sach");
            System.out.println("2. Them 1 hinh vuong vao danh sach");
            System.out.println("3. Them 1 hinh chu nhat vao danh sach");
            System.out.println("4. Them 1 hinh tron vao danh sach");
            System.out.println("5. Tim danh sach hinh theo loai");
            System.out.println("6. Xoa danh sach hinh theo loai");
            System.out.println("0. Thoat");
            System.out.println("---");
            System.out.print("Chon: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1. Them 1 hinh tam giac vao danh sach");
                    m.addTriangle(scanner);
                    break;
                case 2:
                    System.out.println("2. Them 1 hinh vuong vao danh sach");
                    m.addSquare(scanner);
                    break;
                case 3:
                    System.out.println("3. Them 1 hinh chu nhat vao danh sach");
                    m.addRectangle(scanner);
                    break;
                case 4:
                    System.out.println("4. Them 1 hinh tron vao danh sach");
                    m.addCircle(scanner);
                    break;
                case 5:
                    System.out.println("5. Tim danh sach hinh theo loai");
                    m.searchByShape(scanner);
                    break;
                case 6:
                    System.out.println("6. Xoa danh sach hinh theo loai");
                    m.deleteByShape(scanner);
                    break;
                case 0:
                    System.out.println("0. Thoat - Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong duoc ho tro.");
            }
        } while (choose != 0);
    }

    public void searchByShape(Scanner scanner) {
        scanner.nextLine();
        int choose;
        do {
            System.out.println(">> Lua chon danh sach hinh:");
            System.out.println("1. Hinh tron");
            System.out.println("2. Hinh chu nhat");
            System.out.println("3. Hinh vuong");
            System.out.println("4. Hinh tam giac");
            System.out.println("0. Quay lai");
            System.out.println("---");
            System.out.print("Chon: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(">> Danh sach hinh tron: ");
                    for (int i = 0; i < l_circle.size(); i++) {
                        l_circle.get(i).description();
                        System.out.println("-");
                    }
                    break;
                case 2:
                    System.out.println(">> Danh sach hinh chu nhat: ");
                    for (int i = 0; i < l_rectangle.size(); i++) {
                        l_rectangle.get(i).description();
                        System.out.println("-");
                    }
                    break;
                case 3:
                    System.out.println(">> Danh sach hinh vuong: ");
                    for (int i = 0; i < l_square.size(); i++) {
                        l_square.get(i).description();
                        System.out.println("-");
                    }
                    break;
                case 4:
                    System.out.println(">> Danh sach hinh tam giac: ");
                    for (int i = 0; i < l_triangle.size(); i++) {
                        l_triangle.get(i).description();
                        System.out.println("-");
                    }
                    break;
                default:
                    System.out.println("Lua chon khong duoc ho tro.");
            }
        } while (choose != 0);
    }

    public void deleteByShape(Scanner scanner) {
        scanner.nextLine();
        int choose;
        do {
            System.out.println(">> Lua chon danh sach hinh:");
            System.out.println("1. Hinh tron");
            System.out.println("2. Hinh chu nhat");
            System.out.println("3. Hinh vuong");
            System.out.println("4. Hinh tam giac");
            System.out.println("0. Quay lai");
            System.out.println("---");
            System.out.print("Chon: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(">> Xoa danh sach hinh tron: ");
                    for (int i = 0; i <= l_circle.size(); i++) {
                        l_circle.remove(i);
                        System.out.println(">> Xoa thanh cong!");
                    }
                    break;
                case 2:
                    System.out.println(">> Danh sach hinh chu nhat: ");
                    for (int i = 0; i <= l_rectangle.size(); i++) {
                        l_rectangle.remove(i);
                        System.out.println(">> Xoa thanh cong!");
                    }
                    break;
                case 3:
                    System.out.println(">> Danh sach hinh vuong: ");
                    for (int i = 0; i <= l_square.size(); i++) {
                        l_square.remove(i);
                        System.out.println(">> Xoa thanh cong!");
                    }
                    break;
                case 4:
                    System.out.println(">> Danh sach hinh tam giac: ");
                    for (int i = 0; i <= l_triangle.size(); i++) {
                        l_triangle.remove(i);
                        System.out.println(">> Xoa thanh cong!");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong duoc ho tro.");
            }
        } while (choose != 0);
    }

    public void addCircle(Scanner scanner) {
        scanner.nextLine();
        Circle circle = new Circle();
        System.out.println("- Nhap vao ban kinh cua hinh tron: ");
        circle.setRadius(scanner.nextFloat());
        if (circle.getRadius() > 0) {
            l_circle.add(circle);
            System.out.println(">> Them thanh cong!");
        } else {
            System.out.println(">> Vui long nhap so lon hon 0.");
        }
    }

    public void addRectangle(Scanner scanner) {
        scanner.nextLine();
        Rectangle rectangle = new Rectangle();
        System.out.println("- Nhap vao chieu rong cua hinh chu nhat: ");
        rectangle.setA(scanner.nextFloat());
        System.out.println("- Nhap vao chieu dai cua hinh chu nhat: ");
        rectangle.setB(scanner.nextFloat());
        if (rectangle.getA() > 0 && rectangle.getB() > 0) {
            l_rectangle.add(rectangle);
            System.out.println(">> Them thanh cong!");
        } else {
            System.out.println(">> Vui long nhap so lon hon 0.");
        }
    }

    public void addSquare(Scanner scanner) {
        scanner.nextLine();
        Square square = new Square();
        System.out.println("- Nhap vao do dai canh cua hinh vuong: ");
        square.setA(scanner.nextFloat());
        if (square.getA() > 0) {
            l_square.add(square);
            System.out.println(">> Them thanh cong!");
        } else {
            System.out.println(">> Vui long nhap so lon hon 0.");
        }
    }

    public void addTriangle(Scanner scanner) {
        scanner.nextLine();
        Triangle triangle = new Triangle();
        System.out.println("- Nhap vao canh a cua tam giac: ");
        triangle.setA(scanner.nextFloat());
        System.out.println("- Nhap vao canh b cua tam giac: ");
        triangle.setB(scanner.nextFloat());
        System.out.println("- Nhap vao canh c cua tam giac: ");
        triangle.setC(scanner.nextFloat());
        if (!triangle.checkExist()) {
            System.out.println(">> Khong ton tai tam giac co 3 canh vua nhap.");
        } else {
            l_triangle.add(triangle);
            System.out.println(">> Them thanh cong!");
        }
    }
}
