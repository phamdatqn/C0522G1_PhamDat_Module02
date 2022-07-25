package ss17_byte_stream.exercise.copy_binary_file.controller;


import ss17_byte_stream.exercise.copy_binary_file.exception.FileExistsException;
import ss17_byte_stream.exercise.copy_binary_file.model.CopyFileBinary;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File sourceFile = new File("module2/src/ss17_byte_stream/exercise/copy_binary_file/data/sourecefile.csv");
            File destFile = new File("module2/src/ss17_byte_stream/exercise/copy_binary_file/data/targetfile.csv");
            if (destFile.exists()) {
                throw new FileExistsException("File đã tồn tại!");
            }
            CopyFileBinary.copyFileBinary(sourceFile, destFile);
            System.out.println("Copy thành công!");

        } catch (IOException | FileExistsException e) {
            System.out.println(e.getMessage());
        }

    }
}

