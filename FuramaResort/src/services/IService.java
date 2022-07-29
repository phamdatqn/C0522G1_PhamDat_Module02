package services;

import exception.InputEmailException;
import exception.InputNameException;


public interface IService<E> {
    void add() throws InputNameException;

    void remove();

    void edit() throws InputEmailException, InputNameException;

    void findID();

    void findName();

    void displayAll();
}
