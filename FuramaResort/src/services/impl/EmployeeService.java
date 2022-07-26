package services.impl;

import exception.DuplicateIDException;
import models.Employee;
import services.IEmployeeService;
import utils.IOFileUtil;
import utils.InputDegreeUtil;
import utils.InputUtil;
import utils.ReadWriteEmployeeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EmployeeService implements IEmployeeService {
    List<Employee> employeeList = new ArrayList<>();

    public static Employee infoEmployee() {

        String name = InputUtil.getString("Nhập tên");

        String birthday = InputUtil.getString("Nhập Ngày Sinh: ");

        String gender = InputUtil.getString("Nhập giới tính: ");

        String idCard = InputUtil.getString("Nhập CMND: ");

        String numberPhone = InputUtil.getString("Nhập số điện thoại: ");

        String email = InputUtil.getString("Nhập email: ");

        String address = InputUtil.getString("Nhập địa chỉ: ");

        String idEmployee = InputUtil.getString("Nhập mã nhân viên: ");

        String degree = InputDegreeUtil.inputtDegreeUtil();

        String position = InputUtil.getString("Nhập chức vụ: ");

        double salary = InputUtil.getDouble("Nhập lương: ");

        return new Employee(name, birthday, gender, idCard, numberPhone,
                email, address, idEmployee, degree, position, salary);
    }
    @Override
    public void add() {
        Employee employee;
        employeeList = ReadWriteEmployeeUtil.readEmployee(IOFileUtil.PATH_EMPLOYEE);

        employee = infoEmployee();
        try {
            for (Employee item : employeeList) {
                if (item.getIdEmployee().equals(employee.getIdEmployee())) {
                    throw new DuplicateIDException("Mã nhân viên đã tồn tại!");
                }
                if (item.getIdCard().equals(employee.getIdCard())) {
                    throw new DuplicateIDException("CMND đã tồn tại");
                }
            }
            employeeList.add(employee);
            ReadWriteEmployeeUtil.writeEmployee(IOFileUtil.PATH_EMPLOYEE, employeeList);
            System.out.println("Thêm mới thành công!\n");
        } catch (DuplicateIDException e) {
            e.printStackTrace();

        }
    }

    @Override
    public void remove() {
        employeeList = ReadWriteEmployeeUtil.readEmployee(IOFileUtil.PATH_EMPLOYEE);
        String idRemove = InputUtil.getString("Mời bạn nhập mã nhân viên cần xóa:");
        boolean answer = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployee().equals(idRemove)) {
                int chooseYesNo = InputUtil.getInt("Bạn chắc chắn muốn xóa?\n1. Có" +
                        "\n2. Không");
                if (chooseYesNo == 1) {
                    employeeList.remove(i);

                    ReadWriteEmployeeUtil.writeEmployee(IOFileUtil.PATH_EMPLOYEE, employeeList);
                    System.out.println("đã xóa mã nhân viên " + idRemove + " thành công!");
                }
                answer = true;
                break;
            }
        }
        if (!answer) {
            System.out.println("Không tìm thấy mã nhân viên: " + idRemove);
        }
    }

    @Override
    public void edit() {
        employeeList = ReadWriteEmployeeUtil.readEmployee(IOFileUtil.PATH_EMPLOYEE);
        String idFind = InputUtil.getString("Mời bạn nhập mã nhân viên cần sửa:");
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployee().equals(idFind)) {
                System.out.println("\nThông tin nhân viên đang sửa là:\n" + employeeList.get(i));

                employeeList.get(i).setName(InputUtil.getString("\nNhập tên cần sửa:"));
                employeeList.get(i).setBirthday(InputUtil.getString("Nhập ngày sinh cần sửa:"));
                employeeList.get(i).setGender(InputUtil.getString("Nhập giới tính cần sửa:"));

                while (true) {
                    try {
                        String cmnd = InputUtil.getString("Nhập CMND cần sửa:");
                        for (int j = 0; j < employeeList.size(); j++) {
                            if (employeeList.get(j).getIdCard().equals(cmnd) && j != i) {
                                throw new DuplicateIDException("Trùng CMND, mời nhập lại!");
                            }
                        }
                        employeeList.get(i).setIdCard(cmnd);
                        break;
                    } catch (DuplicateIDException e) {
                        e.printStackTrace();
                    }
                }
                employeeList.get(i).setNumberPhone(InputUtil.getString("Nhập số điện thoại cần sửa:"));
                employeeList.get(i).setEmail(InputUtil.getString("Nhập email cần sửa:"));
                employeeList.get(i).setAddress(InputUtil.getString("Nhập địa chỉ cần sửa:"));
                employeeList.get(i).setDegree(InputUtil.getString("Nhập bằng cấp cần sửa:"));
                employeeList.get(i).setPosition(InputUtil.getString("Nhập chức vụ cần sửa:"));
                employeeList.get(i).setSalary(InputUtil.getDouble("Nhập lương cần sửa:"));

            }
        }
        ReadWriteEmployeeUtil.writeEmployee(IOFileUtil.PATH_EMPLOYEE, employeeList);
        employeeList.clear();
    }

    @Override
    public void findID() {
        employeeList = ReadWriteEmployeeUtil.readEmployee(IOFileUtil.PATH_EMPLOYEE);
        String idFind = InputUtil.getString("Mời bạn nhập mã nhân viên cần tìm:");

        for (Employee employee : employeeList) {
            if (employee.getIdEmployee().equals(idFind)) {
                System.out.println("tìm thấy thông tin: " + idFind);
                System.out.println(employee);
            }
        }
        System.out.println("Không tìm thấy thông tin: " + idFind);
    }

    @Override
    public void findName() {
        employeeList = ReadWriteEmployeeUtil.readEmployee(IOFileUtil.PATH_EMPLOYEE);

        String findName = InputUtil.getString("Mời bạn nhập tên cần tìm:");
        List<Employee> employees = new ArrayList<>();

        findName = findName.toLowerCase(Locale.ROOT);
        boolean isFlag = false;
        for (Employee employee : employeeList) {
            if (employee.getName().toLowerCase(Locale.ROOT).contains(findName)) {
                employees.add(employee);
                isFlag = true;
            }
        }
        if (isFlag) {
            System.out.println("Danh sách liên quan đến tên : " + findName);
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }

        if (!isFlag) {
            System.out.println("Không tìm thấy thông tin liên quan đến tên : " + findName);
        }
    }

    @Override
    public void displayAll() {
        System.out.println("Danh sách nhân viên hiện có:");
        List<Employee> employeeList = ReadWriteEmployeeUtil.readEmployee(IOFileUtil.PATH_EMPLOYEE);
        for (Employee item : employeeList) {
            System.out.println(item);
        }

    }
}
