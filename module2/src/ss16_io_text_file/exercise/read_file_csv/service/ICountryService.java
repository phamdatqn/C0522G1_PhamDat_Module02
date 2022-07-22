package ss16_io_text_file.exercise.read_file_csv.service;

import java.util.List;

public interface ICountryService<E>{
    List<E> readFile(String Path);
}
