import java.util.ArrayList;

public class Tinhtu extends Dinhnghiatu {
    private String dinhnghiatt;
    private ArrayList<String> vidu = new ArrayList<>();

    public Tinhtu() {
    }

    public Tinhtu(String dinhnghiatt, ArrayList<String> vidu) {
        this.dinhnghiatt = dinhnghiatt;
        this.vidu = vidu;
    }

    public String getDinhnghiatt() {
        return dinhnghiatt;
    }

    public void setDinhnghiatt(String dinhnghiatt) {
        this.dinhnghiatt = dinhnghiatt;
    }

    public ArrayList<String> getVidu() {
        return vidu;
    }

    public void setVidu(ArrayList<String> vidu) {
        this.vidu = vidu;
    }

}
