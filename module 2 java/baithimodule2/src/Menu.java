import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);


    public Thongtindanhba addThongTin() {
        Thongtindanhba thongtindanhba = new Thongtindanhba();
        System.out.println("hãy nhập số điện thoại mới");
        thongtindanhba.setPhoneNumber(input.nextLine());
        System.out.println("hãy nhập nhóm bạn muốn thêm vào");
        thongtindanhba.setGroup(input.nextLine());
        System.out.println("hãy nhập tên người bạn muốn lưu số");
        thongtindanhba.setName(input.nextLine());
        System.out.println("hãy nhập giới tính của người đó");
        thongtindanhba.setGender(input.nextLine());
        System.out.println("hãy nhập địa chỉ của người đó");
        thongtindanhba.setAddress(input.nextLine());
        System.out.println("hãy nhập ngày sinh của người đó");
        thongtindanhba.setBirthDay(input.nextLine());
        System.out.println("hãy nhập email của người đó");
        thongtindanhba.setEmail(input.nextLine());
        return thongtindanhba;
    }

    public void menuChucnang(){
        System.out.println("----CHƯƠNGNG TRÌNH QUẢN LÝ DANH BẠ----");
        System.out.println("Chọn chức năng theo số");
        System.out.println("1.xem danh sách");
        System.out.println("2.thêm mới");
        System.out.println("3.cập nhập");
        System.out.println("4.xóa");
        System.out.println("5.tìm kiếm");
        System.out.println("6.đọc từ file");
        System.out.println("7.ghi vào file");
        System.out.println("8.thoát");
        System.out.print("Chọn chức năng ");

    }
}

