package SS06.Exercise3.Entity;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int thangPhathanh;
    private int soPhathanh;

    public TapChi(String maTL, String tenTL, String tenNXB, int soBanPhathanh, int soPhathanh, int thangPhathanh) {
        super(maTL, tenTL, tenNXB, soBanPhathanh);
        this.soPhathanh = soPhathanh;
        this.thangPhathanh = thangPhathanh;
    }

    public TapChi() {
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
        System.out.println("- Nhap vao so phat hanh:");
        this.soPhathanh = scanner.nextInt();
        System.out.println("- Nhap vao thang phat hanh:");
        this.thangPhathanh = scanner.nextInt();
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("So phat hanh: " + this.soPhathanh + " | Thang phat hanh: " + this.thangPhathanh);
    }

    public int getSoPhathanh() {
        return soPhathanh;
    }

    public void setSoPhathanh(int soPhathanh) {
        this.soPhathanh = soPhathanh;
    }

    public int getThangPhathanh() {
        return thangPhathanh;
    }

    public void setThangPhathanh(int thangPhathanh) {
        this.thangPhathanh = thangPhathanh;
    }
}