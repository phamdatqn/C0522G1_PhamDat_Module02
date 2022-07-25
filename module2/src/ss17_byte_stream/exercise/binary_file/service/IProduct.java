package ss17_byte_stream.exercise.binary_file.service;

import ss17_byte_stream.exercise.binary_file.model.Product;

import java.io.IOException;

public interface IProduct {
    void add() throws IOException;
    void display() throws IOException;
    Product findId() throws IOException;
    void remove() throws IOException;
}
