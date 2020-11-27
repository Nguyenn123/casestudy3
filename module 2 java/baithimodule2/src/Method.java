import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Method {
    ArrayList<Thongtindanhba> thongtindanhbas = readFile() == null ? new ArrayList<>() : readFile();

    public void create(Thongtindanhba thongtindanhba) {
        thongtindanhbas.add(thongtindanhba);
    }

    public void upDate(Thongtindanhba thongtindanhba) {
        for (Thongtindanhba thongtin : thongtindanhbas
        ) {
            if (thongtin.getPhoneNumber().equals(thongtindanhba.getPhoneNumber())) {
                thongtin.setGroup(thongtindanhba.getGroup());
                thongtin.setName(thongtindanhba.getName());
                thongtin.setGender(thongtindanhba.getGender());
                thongtin.setAddress(thongtindanhba.getAddress());
                thongtin.setBirthDay(thongtindanhba.getBirthDay());
                thongtin.setEmail(thongtindanhba.getBirthDay());
                return;
            }
        }
        System.out.println("không tìm thấy sdt bạn muốn");
    }

    public void delete(String number) {
        Thongtindanhba thongtindanhbaDel = new Thongtindanhba();
        for (Thongtindanhba thongtin : thongtindanhbas
        ) {
            if (thongtin.getPhoneNumber().equals(number)) {
                thongtindanhbaDel = thongtin;
            }
        }
        thongtindanhbas.remove(thongtindanhbaDel);
    }


    public Thongtindanhba search(String key) {
        Thongtindanhba thongtindanhba1 = new Thongtindanhba();
        for (Thongtindanhba thongtin : thongtindanhbas
        ) {
            if (thongtin.getPhoneNumber().equals(key)) {
                thongtindanhba1 = thongtin;
            } else if (thongtin.getName().equals(key)) {
                thongtindanhba1 = thongtin;
            }
        }
        return thongtindanhba1;
    }

    public void read() {
        for (Thongtindanhba thongtin : thongtindanhbas
        ) {
            System.out.println(thongtin.toString());
        }
    }

    public void writeFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("contacts");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(thongtindanhbas);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Thongtindanhba> readFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("contacts");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Thongtindanhba>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }

    }
}
