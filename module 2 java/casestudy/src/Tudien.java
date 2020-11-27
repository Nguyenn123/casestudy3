
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Tudien {
    private static Map<Tu, Dinhnghiatu> tudiens = Phuongthuc.getPhuongthuc().readFile() == null ? new HashMap<>() : Phuongthuc.getPhuongthuc().readFile();


    public Tudien() {
    }

    public static Map<Tu,Dinhnghiatu> getTudiens() {
        return tudiens;
    }

    public static void setTudiens(Map<Tu, Dinhnghiatu> tudiens) {
        Tudien.tudiens = tudiens;
    }
}
