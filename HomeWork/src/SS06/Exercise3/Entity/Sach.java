package SS06.Exercise3.Entity;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTacgia;
    private int sotrang;

    public Sach(String maTL, String tenTL, String tenNXB, int soPhathanh, String tenTacgia, int sotrang) {
        super(maTL, tenTL, tenNXB, soPhathanh);
        this.tenTacgia = tenTacgia;
        this.sotrang = sotrang;
    }

    public Sach() {
    }

    @Override
    public void inputInfo(Scanner scanner){
        super.inputInfo(scanner);
        scanner.nextLine();
        System.out.println("- Nhap vao ten tac gia:");
        this.tenTacgia = scanner.nextLine();
        System.out.println("- Nhap vao so trang:");
        this.sotrang = scanner.nextInt();
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Ten tac gia: " + this.tenTacgia + " | So trang: " + this.sotrang);
    }

    public String getTenTacgia() {
        return tenTacgia;
    }

    public void setTenTacgia(String tenTacgia) {
        this.tenTacgia = tenTacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
}
