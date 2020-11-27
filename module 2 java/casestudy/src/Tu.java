import java.io.Serializable;

public class Tu implements Serializable {
    private String tu;

    public Tu() {
    }

    public Tu(String tu) {
        this.tu = tu;

    }

    public String getTu() {
        return tu;
    }

    public void setTu(String tu) {
        this.tu = tu;
    }

    @Override
    public String toString() {
        return  tu+"\n";
    }
}
