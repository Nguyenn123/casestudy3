
import java.io.Serializable;
import java.util.ArrayList;

import static java.lang.System.out;

public class Dinhnghiatu implements Serializable {
    private ArrayList<String> phatam = new ArrayList<>();
    ArrayList<Danhtu> dnDanhTu = new ArrayList<>();
    ArrayList<Tinhtu> dnTinhTu = new ArrayList<>();
    ArrayList<Dongtu> dnDongTu = new ArrayList<>();

    public Dinhnghiatu() {
    }

    public Dinhnghiatu(ArrayList<String> phatam, ArrayList<Danhtu> dnDanhTu, ArrayList<Tinhtu> dnTinhTu, ArrayList<Dongtu> dnDongTu) {
        this.phatam = phatam;
        this.dnDanhTu = dnDanhTu;
        this.dnTinhTu = dnTinhTu;
        this.dnDongTu = dnDongTu;
    }

    public ArrayList<String> getPhatam() {
        return phatam;
    }

    public void setPhatam(ArrayList<String> phatam) {
        this.phatam = phatam;
    }

    public ArrayList<Danhtu> getDnDanhTu() {
        return dnDanhTu;
    }

    public void setDnDanhTu(ArrayList<Danhtu> dnDanhTu) {
        this.dnDanhTu = dnDanhTu;
    }

    public ArrayList<Tinhtu> getDnTinhTu() {
        return dnTinhTu;
    }

    public void setDnTinhTu(ArrayList<Tinhtu> dnTinhTu) {
        this.dnTinhTu = dnTinhTu;
    }

    public ArrayList<Dongtu> getDnDongTu() {
        return dnDongTu;
    }

    public void setDnDongTu(ArrayList<Dongtu> dnDongTu) {
        this.dnDongTu = dnDongTu;
    }

    public String  docdinhnghia() {
        String dnghia = "phát âm: ";
        for (String pa: this.getPhatam()
             ) {
            dnghia += pa +"\n";
        }
        dnghia += "*Danh từ \n";
        for (Danhtu dt: this.getDnDanhTu()
        ) {
            dnghia += "+ "+ dt.getDinhnghiadt() + "\n";
            for (String vd: dt.getVidu()
            ) {
               dnghia +=  "== "+vd+"\n";
            }
        }
        dnghia += "*Động từ \n";
        for (Dongtu dt: this.getDnDongTu()
        ) {
            dnghia += "+ "+ dt.getDinhnghiadot() + "\n";
            for (String vd: dt.getVidu()
            ) {
                dnghia +=  "== "+vd+"\n";
            }
        }
        dnghia += "*Tính từ \n";
        for (Tinhtu dt: this.getDnTinhTu()
        ) {
            dnghia +=  "+ "+ dt.getDinhnghiatt() + "\n";
            for (String vd: dt.getVidu()
            ) {
                dnghia +=  "== "+vd+"\n";
            }
        }
        return   dnghia;
    }

}

