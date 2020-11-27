import java.io.*;
import java.util.ArrayList;

public class Ghidoc {
    private static final String PATH = "nhacnhocuanguoidung" ;
    private static final String PATH1 = "tudien1";

    public static void ghifiletxt(ArrayList<String> list){
        try{
            FileWriter fw = new FileWriter(PATH);
            StringBuilder result = new StringBuilder();
            for (String str:list) {
                result.append(str).append("\n");
            }
            fw.write(result.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void ghifiletxt1(ArrayList<String> list){
        try{
            FileWriter fw = new FileWriter(PATH1);
            StringBuilder result = new StringBuilder();
            for (String str:list) {
                result.append(str).append("\n");
            }
            fw.write(result.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<String> docfiletxt(){
        try{
            ArrayList<String> list = new ArrayList<>();
            FileReader fr = new FileReader(PATH);
            BufferedReader br = new BufferedReader(fr);
            String line = "";

            while((line = br.readLine())!=null){
                list.add(line);
            }
            return list;


        } catch (IOException e) {
            return null;
        }
    }
//    public static ArrayList<String> docfiletxt1(){
//        try{
//            ArrayList<String> list = new ArrayList<>();
//            FileReader fr = new FileReader(PATH1);
//            BufferedReader br = new BufferedReader(fr);
//            String line = "";
//
//            while((line = br.readLine())!=null){
//                list.add(line);
//            }
//            return list;
//
//
//        } catch (IOException e) {
//            return null;
//        }
//    }

}
