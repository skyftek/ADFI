package SS06.Exercise3.Management;

import SS06.Exercise3.Entity.Bao;
import SS06.Exercise3.Entity.Sach;
import SS06.Exercise3.Entity.TaiLieu;
import SS06.Exercise3.Entity.TapChi;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {
    private static ArrayList<TaiLieu> l_tailieu = new ArrayList<>();
    private static ArrayList<Bao> l_bao = new ArrayList<>();
    private static ArrayList<Sach> l_sach = new ArrayList<>();
    private static ArrayList<TapChi> l_tapchi = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do{
            System.out.println("\n***Chuong trinh quan ly thu vien***");
            System.out.println("1. Them Tai lieu");
            System.out.println("2. Them Sach");
            System.out.println("3. Them Tap chi");
            System.out.println("4. Them Bao");
            System.out.println("5. Xem danh sach");
            System.out.println("0. Thoat");
            System.out.println("---");
            System.out.print("Chon: ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println(">> 1. Them Tai lieu:\n---");
                    TaiLieu tl = new TaiLieu();
                    tl.inputInfo(scanner);
                    l_tailieu.add(tl);
                    break;
                case 2:
                    System.out.println(">> 2. Them Sach:\n---");
                    Sach s = new Sach();
                    s.inputInfo(scanner);
                    l_sach.add(s);
                    break;
                case 3:
                    System.out.println(">> 3. Them Tap chi:\n---");
                    TapChi tc = new TapChi();
                    tc.inputInfo(scanner);
                    l_tapchi.add(tc);
                    break;
                case 4:
                    System.out.println(">> 4. Them Bao:\n---");
                    Bao b = new Bao();
                    b.inputInfo(scanner);
                    l_bao.add(b);
                    break;
                case 5:
                    System.out.println(">> 5. Xem danh sach:\n---");
                    QuanLyThuVien.showInfo();
                    break;
                case 0:
                    System.out.println(">> 0. Thoat");
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println(">> Chuc nang khong ho tro.");
            }
        } while (choose != 0);
    }

    public static void showInfo(){
        System.out.println(">> Danh sach tai lieu:");
        for(TaiLieu taiLieu : l_tailieu){
            taiLieu.showInfo();
        }
        System.out.println("---\n>> Danh sach bao:");
        for(Bao bao : l_bao){
            bao.showInfo();
        }
        System.out.println("---\n>> Danh sach sach:");
        for(Sach sach : l_sach){
            sach.showInfo();
        }
        System.out.println("---\n>> Danh sach tap chi:");
        for(TapChi tapchi : l_tapchi){
            tapchi.showInfo();
        }
    }
}
