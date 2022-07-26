package exercise_haitutor.mvclist_version2.service;

import exercise_haitutor.mvclist_version2.exception.DuplicateIDException;

import java.io.IOException;

public interface IStudentService {
    void add() throws IOException, DuplicateIDException;

    void displayAllStudent();

    void remove();

    void findID();

    void findName();

    void bubbleSortName();
}
