package ss17_binary_serialization.exercise.product.service;

import ss17_binary_serialization.exercise.product.model.Product;

import java.io.IOException;

public interface IProduct {
    void add() throws IOException;
    void display() throws IOException;
    Product findId(int id) throws IOException;
    void remove() throws IOException;
}
