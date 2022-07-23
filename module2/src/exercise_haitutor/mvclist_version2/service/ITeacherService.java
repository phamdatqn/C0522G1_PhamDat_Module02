package exercise_haitutor.mvclist_version2.service;

import exercise_haitutor.mvclist_version2.exception.DuplicateIDException;

import java.io.IOException;

public interface ITeacherService {

    void add() throws DuplicateIDException, IOException;

    void displayAllTeacher();

    void remove() throws IOException;

    void findID();

    void findName();

    void bubbleSortName();
}
