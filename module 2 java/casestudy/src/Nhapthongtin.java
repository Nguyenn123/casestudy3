import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class Nhapthongtin {
    Scanner sc = new Scanner(in);


    public Tu addTu(){
        Tu tu = new Tu();
        tu.setTu(sc.nextLine());

        return tu;
    }

    public Dinhnghiatu addDinhNghia(){
        Dinhnghiatu dinhnghiatu = new Dinhnghiatu();
        out.println("định nghĩa phát âm của từ là:");
        dinhnghiatu.getPhatam().add(sc.nextLine());
        dinhnghiatu.setPhatam(dinhnghiatu.getPhatam());
        String type = null;
        out.println("bạn muốn định nghĩa theo mấy kiểu từ");
        int sokieu = Integer.parseInt(sc.nextLine());
        for (int k = 0; k < sokieu; k++) {

            out.println("bạn muốn định nghĩa theo dạng từ nào");
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
                out.println("bạn muốn thêm bao nhiêu định nghĩa");
                int sodn = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < sodn; i++) {
                    List<Danhtu> list = dinhnghiatu.getDnDanhTu();
                    list.add(addDanhtu());
                    dinhnghiatu.setDnDanhTu((ArrayList<Danhtu>) list);
                }
            } else if (type.equals("tinhtu")) {
                out.println("bạn muốn thêm bao nhiêu định nghĩa");
                int sodn = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < sodn; i++) {
                    List<Tinhtu> list = dinhnghiatu.getDnTinhTu();
                    list.add(addTinhtu());
                    dinhnghiatu.setDnTinhTu((ArrayList<Tinhtu>) list);
                }
            } else if (type.equals("dongtu")) {
                out.println("bạn muốn thêm bao nhiêu định nghĩa");
                int sodn = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < sodn; i++) {
                    List<Dongtu> list = dinhnghiatu.getDnDongTu();
                    list.add(addDongtu());
                    dinhnghiatu.setDnDongTu((ArrayList<Dongtu>) list);
                }
            }
        }
        return dinhnghiatu;
    }

    public Danhtu addDanhtu(){
        Danhtu danhtu = new Danhtu();
            out.println("nghĩa của từ khi nó là danh từ là:");
            danhtu.setDinhnghiadt(sc.nextLine());
            out.println("bạn muốn bổ sung bao nhiêu câu ví dụ:");
            int socau = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < socau; j++) {
                out.println("câu " +(j+1));
                String cauvidu = sc.nextLine();
                List<String> listNew = danhtu.getVidu();
                listNew.add(cauvidu);
                danhtu.setVidu((ArrayList<String>) listNew);
            }



        return danhtu;
    }

    public Tinhtu addTinhtu(){
        Tinhtu tinhtu = new Tinhtu();

            out.println("nghĩa của từ khi nó là tính từ là:");
            tinhtu.setDinhnghiatt(sc.nextLine());
            out.println("bạn muốn bổ sung bao nhiêu câu ví dụ:");
            int socau = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < socau; j++) {
                out.println("câu " + (j + 1));
                String cauvidu = sc.nextLine();
                tinhtu.getVidu().add(cauvidu);
                tinhtu.setVidu(tinhtu.getVidu());
            }

        return tinhtu;
    }

    public Dongtu addDongtu() {
        Dongtu dongtu = new Dongtu();

            out.println("nghĩa của từ khi nó là động từ là:");
            dongtu.setDinhnghiadot(sc.nextLine());
            out.println("bạn muốn bổ sung bao nhiêu câu ví dụ:");
            int socau = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < socau; j++) {
                out.println("câu " + (j + 1));
                String cauvidu = sc.nextLine();
                dongtu.getVidu().add(cauvidu);
                dongtu.setVidu(dongtu.getVidu());
            }
            return dongtu;
        }
    }


