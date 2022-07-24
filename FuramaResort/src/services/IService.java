package services;

import exception.DuplicateIDException;

public interface IService {
    void add() throws DuplicateIDException;
    void remove();
    void edit();
    void findID();
    void findName();
    void displayAll();
}
