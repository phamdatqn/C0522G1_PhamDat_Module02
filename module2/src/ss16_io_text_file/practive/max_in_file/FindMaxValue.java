package ss16_io_text_file.practive.max_in_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String fileIn = "module2/src/ss16_io_text_file/practive/max_in_file/numbers.txt";
        String fileResult = "module2/src/ss16_io_text_file/practive/max_in_file/result.txt";
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(fileIn);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(fileResult, maxValue);

    }
}
