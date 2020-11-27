import java.io.*;
import java.util.*;

import static java.lang.System.out;

public class Phuongthuc {
    Nhapthongtin nhapthongtin = new Nhapthongtin();
    Scanner sc = new Scanner(System.in);
    private static Phuongthuc phuongthuc;

    private Phuongthuc() {
    }

    public static Phuongthuc getPhuongthuc() {
        if (phuongthuc == null) {
            phuongthuc = new Phuongthuc();
        }
        return phuongthuc;
    }
    ArrayList<String> list1 = Ghidoc.docfiletxt();


    //    tim kiem
    public void lookup(String key) {
        Set<Tu> set = Tudien.getTudiens().keySet();
        for (Tu k : set) {
            if ((k.getTu()).equals(key)) {
                System.out.println(set.size());
                System.out.println(k.toString()  + Tudien.getTudiens().get(k).docdinhnghia());
                return;
            }
        }
        out.println("chúng tôi sẽ bổ sung sớm");

        if (list1 == null){
            list1 = new ArrayList<>();
        }
        list1.add("cần thêm từ này: " + key);
        Ghidoc.ghifiletxt(list1);
    }

    //    bo sung
    public void define(String key) {
        Set<Tu> set = Tudien.getTudiens().keySet();
        for (Tu k : set) {
            if (k.getTu().equals(key)) {
                System.out.println("định nghĩa phát âm bạn muốn bổ sung cho từ là:");
                Tudien.getTudiens().get(k).getPhatam().add(sc.nextLine());
                Tudien.getTudiens().get(k).setPhatam(Tudien.getTudiens().get(k).getPhatam());
                String type = null;
                out.println("bạn muốn bổ sung định nghĩa theo mấy kiểu từ");
                int sokieu = Integer.parseInt(sc.nextLine());
                for (int j = 0; j < sokieu; j++) {

                    out.println("bạn muốn bổ sung định nghĩa theo dạng từ nào");
                    out.println("1.danh từ");
                    out.println("2.tính từ");
                    out.println("3.động từ");

                    int choice1 = Integer.parseInt(sc.nextLine());
                    switch (choice1) {
                        case 1:
                            type = "danhtu";
                            break;
                        case 2:
                            type = "tinhtu";
                            break;
                        case 3:
                            type = "dongtu";
                            break;
                    }

                    if (type.equals("danhtu")) {
                        out.println("bạn muốn bổ sung thêm bao nhiêu định nghĩa");
                        int sodn = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < sodn; i++) {
                            Tudien.getTudiens().get(k).getDnDanhTu().add(nhapthongtin.addDanhtu());
                            Tudien.getTudiens().get(k).setDnDanhTu(Tudien.getTudiens().get(k).getDnDanhTu());
                        }
                    } else if (type.equals("tinhtu")) {
                        out.println("bạn muốn bổ sung thêm bao nhiêu định nghĩa");
                        int sodn = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < sodn; i++) {
                            Tudien.getTudiens().get(k).getDnTinhTu().add(nhapthongtin.addTinhtu());
                            Tudien.getTudiens().get(k).setDnTinhTu(Tudien.getTudiens().get(k).getDnTinhTu());
                        }
                    } else if (type.equals("dongtu")) {
                        out.println("bạn muốn bổ sung thêm bao nhiêu định nghĩa");
                        int sodn = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < sodn; i++) {
                            Tudien.getTudiens().get(k).getDnDongTu().add(nhapthongtin.addDongtu());
                            Tudien.getTudiens().get(k).setDnDongTu(Tudien.getTudiens().get(k).getDnDongTu());
                        }
                    }
                }
            }
        }
        writeFile(Tudien.getTudiens());
        readFile();
        Ghidoc.ghifiletxt1(qwe());
    }

    //    xoa
    public void drop(String key) {
        Tu del = null;
        Set<Tu> set = Tudien.getTudiens().keySet();
        for (Tu k : set) {
            if (k.getTu().equals(key)) {
                del = k;
            }
        }
        Tudien.getTudiens().remove(del);
        writeFile(Tudien.getTudiens());
        Ghidoc.ghifiletxt1(qwe());
    }

    //ghi dữ liệu
    public void writeFile(Map<Tu, Dinhnghiatu> tudiens) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("tudien.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(tudiens);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    xuat du lieu

    public Map<Tu, Dinhnghiatu> readFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("tudien.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            return (Map<Tu, Dinhnghiatu>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }

    }

    //    them
    public void create(Tu tu, Dinhnghiatu dinhnghiatu) {
        Tudien.getTudiens().put(tu, dinhnghiatu);
        Tudien.setTudiens(Tudien.getTudiens());
        writeFile(Tudien.getTudiens());
        readFile();
        Ghidoc.ghifiletxt1(qwe());
        String del = null ;
        for (String k: list1
             ) {
            if (("cần thêm từ này: " + tu.getTu()).equals(k)){
                del = k;
            }
        }
        list1.remove(del);
        Ghidoc.ghifiletxt(list1);
    }

    public boolean checkadmin() {
        out.println("bạn có phải admin");
        out.println("1.yes");
        out.println("2.no");
        int choice2 = Integer.parseInt(sc.nextLine());
        switch (choice2) {
            case 1:
                out.println("hãy nhập mã admin của bạn");
                int maadmin = Integer.parseInt(sc.nextLine());
                if (maadmin == 123456|| maadmin == 654321) {
                    return true;
                }
            case 2:
                out.println("bạn chỉ sử dụng được tính năng tra cứu");
                return false;
        }
        return false;
    }

    public ArrayList<String> qwe(){
        ArrayList<String> result = new ArrayList<>();
        Set<Tu> set = Tudien.getTudiens().keySet();
        for (Tu k:set
             ) {
            result.add(k.getTu()+ ": "+ Tudien.getTudiens().get(k).docdinhnghia()+"\n");
        }
        return result;
    }


}
