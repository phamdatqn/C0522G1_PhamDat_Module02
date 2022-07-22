package ss16_io_text_file.exercise.read_file_csv.service.impl;

import ss16_io_text_file.exercise.read_file_csv.model.Country;
import ss16_io_text_file.exercise.read_file_csv.service.ICountryService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CountryService implements ICountryService<String>{
    public List<String> readFile(String path) {
        List<String> stringsRead = new ArrayList<>();
        try {

            File file = new File(path);
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

    public void display(){
        List<String>countyList=readFile("module2/src/ss16_io_text_file/exercise/read_file_csv/data/data.csv");
        String[] strings;
        for (String item: countyList){
            strings=item.split(",");
            System.out.println(new Country(Integer.parseInt(strings[0]),strings[1],strings[2]));
        }

    }

}
