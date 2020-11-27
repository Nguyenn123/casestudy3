import java.util.ArrayList;

public class Dongtu extends Dinhnghiatu{
    private String dinhnghiadot;
    private ArrayList<String> vidu = new ArrayList<>();

    public Dongtu() {
    }

    public Dongtu(String dinhnghiadot, ArrayList<String> vidu) {
        this.dinhnghiadot = dinhnghiadot;
        this.vidu = vidu;
    }

    public String getDinhnghiadot() {
        return dinhnghiadot;
    }

    public void setDinhnghiadot(String dinhnghiadot) {
        this.dinhnghiadot = dinhnghiadot;
    }

    public ArrayList<String> getVidu() {
        return vidu;
    }

    public void setVidu(ArrayList<String> vidu) {
        this.vidu = vidu;
    }

}
