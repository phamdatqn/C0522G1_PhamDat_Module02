package ss16_io_text_file.exercise.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> readFile(String Path) {
        List<String> stringsRead = new ArrayList<>();
        try {
            File file = new File(Path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                stringsRead.add(line);
            }
            br.close();
        } catch (Exception e) {
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

    public static void main(String[] args) throws IOException {
        String fileIn = "module2/src/ss16_io_text_file/exercise/copy_file/sourceFile.txt";
        String fileOut = "module2/src/ss16_io_text_file/exercise/copy_file/targetFile.txt";
        List<String> strings = readFile(fileIn);
        StringBuilder temp = new StringBuilder();
        for (String item : strings) {
            temp.append(item).append("\n");
        }
        temp.deleteCharAt(temp.length() - 1);
        writeFile(fileOut, temp.toString());
        System.out.println("Đã copy vào file targetFile thành công !");
    }

}