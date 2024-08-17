import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
//чтение файла с консоли и запись в обратном порядке в другой файл
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {

            List<Integer> inputBytes = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                inputBytes.add(fileInputStream.read());
            }
            Collections.reverse(inputBytes);
            for (Integer aByte : inputBytes) {
                fileOutputStream.write(aByte);
            }
        }
    }
}
