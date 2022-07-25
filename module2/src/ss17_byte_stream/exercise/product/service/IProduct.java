package ss17_byte_stream.exercise.product.service;

import ss17_byte_stream.exercise.product.model.Product;

import java.io.IOException;

public interface IProduct {
    void add() throws IOException;
    void display() throws IOException;
    Product findId() throws IOException;
    void remove() throws IOException;
}
