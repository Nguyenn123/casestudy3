import java.util.ArrayList;

public class Danhtu extends Dinhnghiatu{
    private String dinhnghiadt;
    private ArrayList<String> vidu = new ArrayList<>();

    public Danhtu() {
    }

    public Danhtu(String dinhnghiadt, ArrayList<String> vidu) {
        this.dinhnghiadt = dinhnghiadt;
        this.vidu = vidu;
    }

    public String getDinhnghiadt() {
        return dinhnghiadt;
    }

    public void setDinhnghiadt(String dinhnghiadt) {
        this.dinhnghiadt = dinhnghiadt;
    }

    public ArrayList<String> getVidu() {
        return vidu;
    }

    public void setVidu(ArrayList<String> vidu) {
        this.vidu = vidu;
    }

}
