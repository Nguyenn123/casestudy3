
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Method method = new Method();
        boolean check = true;
        Menu menu = new Menu();
        do{
            menu.menuChucnang();
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    method.read();
                    break;
                case 2:
                    Thongtindanhba cThongTinDanhBa = menu.addThongTin();
                    method.create(cThongTinDanhBa);
                    break;
                case 3:
                    Thongtindanhba uThongTinDanhBa = menu.addThongTin();
                    method.upDate(uThongTinDanhBa);
                    break;
                case 4:
                    System.out.println("nhập số điện thoại bạn muốn xóa");
                    String number = input.nextLine();
                    method.delete(number);
                    break;
                case 5:
                    System.out.println("nhập số điện hoặc tên người bạn muốn tìm");
                    String key = input.nextLine();
                    System.out.println(method.search(key));
                    break;
                case 6:
                    method.readFile();
                    break;
                case 7:
                    method.writeFile();
                    break;
                case 8:
                    System.exit(1);
                    break;
            }
        }while (check);
    }
}
