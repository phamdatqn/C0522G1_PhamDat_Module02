package services;

import exercise_haitutor.mvclist_version2.exception.InputNameException;

public interface IService<E> {
    void add() throws InputNameException;

    void remove();

    void edit();

    void findID();

    void findName();

    void displayAll();
}
