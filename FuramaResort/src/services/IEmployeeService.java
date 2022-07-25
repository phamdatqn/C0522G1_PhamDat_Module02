package services;

import exception.DuplicateIDException;

public interface IEmployeeService extends IService {
    @Override
    void add() throws DuplicateIDException;

    @Override
    void remove();

    @Override
    void edit();

    @Override
    void findID();

    @Override
    void findName();

    @Override
    void displayAll();
}
