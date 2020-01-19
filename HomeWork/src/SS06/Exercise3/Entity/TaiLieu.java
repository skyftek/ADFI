package SS06.Exercise3.Entity;

import java.util.Scanner;

public class TaiLieu {
    private String maTL;
    private String tenTL;
    private String tenNXB;
    private int soBanPhathanh;

    public TaiLieu(String maTL, String tenTL, String tenNXB, int soBanPhathanh) {
        this.maTL = maTL;
        this.tenTL = tenTL;
        this.tenNXB = tenNXB;
        this.soBanPhathanh = soBanPhathanh;
    }

    public TaiLieu() {
    }

    public void inputInfo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("- Nhap vao ma the loai:");
        this.maTL = scanner.nextLine();
        System.out.println("- Nhap vao ten the loai:");
        this.tenTL = scanner.nextLine();
        System.out.println("- Nhap vao ten nha xuat ban:");
        this.tenNXB = scanner.nextLine();
        System.out.println("- Nhap vao so ban phat hanh:");
        this.soBanPhathanh = scanner.nextInt();
    }

    public void showInfo() {
        String info = "Ma the loai: " + this.maTL + " | Ten the loai: " + this.tenTL + " | Ten NXB: " + this.tenNXB + " | So ban phat hanh: " + this.soBanPhathanh;
        System.out.println(info);
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPhathanh() {
        return soBanPhathanh;
    }

    public void setSoBanPhathanh(int soBanPhathanh) {
        this.soBanPhathanh = soBanPhathanh;
    }
}
