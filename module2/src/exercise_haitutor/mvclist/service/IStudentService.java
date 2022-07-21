package exercise_haitutor.mvclist.service;

import exercise_haitutor.mvclist.exception.DuplicateIDException;

public interface IStudentService {
    void addStudent() throws DuplicateIDException;

    void displayAllStudent();

    void removeStudent();

    void findID();

    void findName();

    void bubbleSortName();
}
