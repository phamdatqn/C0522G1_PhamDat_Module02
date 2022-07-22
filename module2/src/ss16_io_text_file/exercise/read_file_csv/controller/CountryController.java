package ss16_io_text_file.exercise.read_file_csv.controller;

import ss16_io_text_file.exercise.read_file_csv.service.impl.CountryService;

public class CountryController {
    public  void menu(){
        String path="module2/src/ss16_io_text_file/exercise/read_file_csv/data/data.csv";
        CountryService countryController=new CountryService();
        countryController.readFile(path);
        countryController.display();
    }
}
