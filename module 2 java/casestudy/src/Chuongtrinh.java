import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Chuongtrinh {
    public static void main(String[] args) {
        Chuongtrinh.chuongTinh();
    }

    public static void chuongTinh(){
        Nhapthongtin nhapthongtin = new Nhapthongtin();
        Scanner scanner = new Scanner(System.in);
        boolean check1 = true;
        do{
            System.out.println("----ban muon lam gi?-----");
            System.out.println("1. su dung tinh nang tra tu");
            System.out.println("2. su dung tinh nang them tu moi");
            System.out.println("3. su dung tinh nang xoa bo 1 tu");
            System.out.println("4. su dung tinh nang bổ sung nghia cho tu");
            System.out.println("5. su dung tinh nang xuat co so du lieu");
            System.out.println("6. quay lại");
            System.out.println("7. exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("----nhập từ bạn muốn tra cứu----");
                    String tu = scanner.nextLine();
                    Phuongthuc.getPhuongthuc().lookup(tu);
                    break;
                case 2:
                    if (Phuongthuc.getPhuongthuc().checkadmin()) {
                        System.out.println("----nhập từ mới bạn muốn thêm----");
                        Tu tu1 = nhapthongtin.addTu();
                        Dinhnghiatu dinhnghiatu = nhapthongtin.addDinhNghia();
                        Phuongthuc.getPhuongthuc().create(tu1, dinhnghiatu);
                    } else {
                        Chuongtrinh.chuongTinh();
                    }
                    break;
                case 3:
                    if (Phuongthuc.getPhuongthuc().checkadmin()) {
                        System.out.println("----nhập từ bạn muốn xóa----");
                        String keyDel = scanner.nextLine();
                        Phuongthuc.getPhuongthuc().drop(keyDel);
                    } else {
                        Chuongtrinh.chuongTinh();
                    }
                    break;
                case 4:
                    if (Phuongthuc.getPhuongthuc().checkadmin()) {
                        System.out.println("----nhập từ bạn muốn bổ sung nghĩa----");
                        String key = scanner.nextLine();
                        Phuongthuc.getPhuongthuc().define(key);
                    }else {
                        Chuongtrinh.chuongTinh();
                    }
                    break;
                case 5:
                    Set<Tu> set = Tudien.getTudiens().keySet();
                    for (Tu k : set) {
                        System.out.println(k.toString() + Tudien.getTudiens().get(k).docdinhnghia());
                    }
                    break;
                case 6:
                    Chuongtrinh.chuongTinh();
                    break;
                case 7:
                System.exit(1);
                    break;
            }
        }while (check1);
    }
}
