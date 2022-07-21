package exercise_haitutor.mvclist.service;

import exercise_haitutor.mvclist.exception.DuplicateIDException;

public interface ITeacherService {

    void addTeacher() throws DuplicateIDException;

    void displayAllTeacher();

    void removeTeacher();

    void findID();

    void findName();

    void bubbleSortName();
}
