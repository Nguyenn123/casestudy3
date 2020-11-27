import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExampleTest {
    private static Pattern pattern;
    private Matcher matcher;
    private static ClassExampleTest classExampleTest;

    private static final String CLASS_REGEX = "^[CAP]+[0-9]{4}[GHIKLM]+$";

    public ClassExampleTest(){
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        classExampleTest = new ClassExampleTest();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("nhap ten lop:");
            String regex = sc.nextLine();
            boolean isvalid = classExampleTest.validate(regex);
            System.out.println("lop: " + regex + " la " + isvalid);
        }
    }
}
