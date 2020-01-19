package SS06.Exercise3.Entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bao extends TaiLieu {
    private Date ngayPhathanh;

    public Bao(String maTL, String tenTL, String tenNXB, int soBanPhathanh) {
        super(maTL, tenTL, tenNXB, soBanPhathanh);
    }

    public Bao() {
    }

    @Override
    public void inputInfo(Scanner scanner){
        super.inputInfo(scanner);
        scanner.nextLine();
        System.out.println("- Nhap vao ngay phat hanh: ");
        String nph = scanner.nextLine();
        try {
            this.ngayPhathanh = new SimpleDateFormat("dd/MM/yyyy").parse(nph);
        } catch (ParseException e) {
            System.err.println(">> Ngay sai dinh dang.");
        }
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Ngay phat hanh: " + this.ngayPhathanh);
    }

    public Date getNgayPhathanh() {
        return ngayPhathanh;
    }

    public void setNgayPhathanh(Date ngayPhathanh) {
        this.ngayPhathanh = ngayPhathanh;
    }
}
