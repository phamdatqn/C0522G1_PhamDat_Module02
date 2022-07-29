package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class IOFileUtil {

    public static List<String> readFile(String path) {
        List<String> stringsRead = new ArrayList<>();
        try {

            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                stringsRead.add(line);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return stringsRead;
    }

    public static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }
}
