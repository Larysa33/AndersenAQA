package school.lesson7;
import java.io.*;
import java.util.Arrays;
public class WriteRead{
    public static void main(String[] args){

        String[] header = {"Value1", "Value2", "Value3"};
        int[][] data = {{123,145,156},{256,567,267}};
        AppData obj = new AppData(header, data);
        String a = String.valueOf(obj);
        System.out.println(Arrays.toString(obj.getHeader())); //- вывести заголовок в консоль
        //String string = obj.toString(); - второй способ преобразования объекта с строку
        //System.out.println(obj.toString());


        try (BufferedWriter saver = new BufferedWriter(new FileWriter("demo.csv"))) {
            saver.write(a);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("demo.csv"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
