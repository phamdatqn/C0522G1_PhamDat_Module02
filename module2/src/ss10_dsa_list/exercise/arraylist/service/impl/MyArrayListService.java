package ss10_dsa_list.exercise.arraylist.service.impl;

import ss10_dsa_list.exercise.arraylist.model.Student;
import ss10_dsa_list.practice.simple_list_class.model.MyList;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrayListService<E> implements IMyArrayListService {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyArrayListService() {
        elements = new Object[DEFAULT_CAPACITY];
        System.out.println("Khởi tạo thành công mảng Object " + elements.length);
    }

    public MyArrayListService(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
            System.out.println("Khởi tạo thành công với kích thước là: " + elements.length);
        } else {
            System.out.println("lỗi tham số truyền vào");
            throw new IllegalArgumentException("capacity :" + capacity);
        }
    }

    /**
     * phương thức tăng kích thước cho list
     *
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Khởi tạo thành công với kích thước là " + elements.length);
        } else {
            throw new IllegalArgumentException("minCapacity :" + minCapacity);
        }
    }

    /**
     * Phương thức trả về số phần tử trong mảng
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * phương thức trả về độ dài list
     *
     * @return
     */
    public int length() {
        return elements.length;
    }


    /**
     * phương thức xóa mảng
     */
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    /**
     * method thêm vào cuối list
     *
     * @param element
     * @return
     */
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {

            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }


    /**
     * Method lấy giá trị tại vị trí index
     * @param index
     * @return
     */
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        return (E) elements[index];
    }

    /**
     * Method remove 1 phần tử
     * @param index
     * @return
     */
    public E remove(int index) {
        if(index<0||index>=size){
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element = (E)elements[index];
        for(int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }

    @Override
    public void display() {

    }

    @Override
    public int inputIndex(int number) {
        return 0;
    }

    @Override
    public void deleteStudent(int index) {

    }
}