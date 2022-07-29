package services.impl;

import exception.*;
import models.Employee;
import regex.*;
import services.IEmployeeService;
import utils.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    List<Employee> employeeList = new ArrayList<>();

    private Employee infoEmployee(String idEmployee, String idCard) {

        String name;
        while (true) {
            try {
                name = InputNameRegex.getNameUtil(InputUtil.getString("Nhập họ và tên nhân viên: "));
                break;
            } catch (InputNameException e) {
                e.printStackTrace();
            }
        }

        String birthday = InputDayRegex.getBirthDay("Nhập ngày sinh nhân viên: ");

        String gender = InputPersonUtil.inputGenderUtil();

        String numberPhone;
        while (true) {
            try {
                numberPhone = InputPhoneNumberRegex.getNumberphoneRegex(InputUtil.getString("Nhập số điện thoại nhân viên: "));
                break;
            } catch (InputNumberPhoneException e) {
                e.printStackTrace();
            }
        }

        String email;
        while (true) {
            try {
                email = InputEmailRegex.getEmail(InputUtil.getString("Nhập vào email nhân viên: "));
                break;
            } catch (InputEmailException e) {
                e.printStackTrace();
            }
        }

        String address;
        while (true) {
            try {
                address = InputAddressRegex.getAddressRegex(InputUtil.getString("Nhập địa chỉ nhân viên: "));
                break;
            } catch (InputAddressException E) {
                E.printStackTrace();
            }
        }


        String degree = InputPersonUtil.inputDegreeUtil();

        String position = InputPersonUtil.inputPositionUtil();

        double salary = InputUtil.getDouble("Nhập lương nhân viên: ");

        return new Employee(name, birthday, gender, idCard, numberPhone,
                email, address, idEmployee, degree, position, salary);
    }

    @Override
    public void add() {
        Employee employee;
        String idEmployee;
        String idCard;
        employeeList = IOEmployeeUtil.readEmployee(IOEmployeeUtil.PATH_EMPLOYEE);
        while (true) {
            try {
                idEmployee = InputIDEmployeeRegex.getIdEmloyeeRegex(InputUtil.getString("Nhập mã nhân viên mới:"));
                for (Employee item : employeeList) {
                    if (item.getIdEmployee().equals(idEmployee)) {
                        throw new DuplicateIDException("Mã nhân viên đã tồn tại!");
                    }
                }
                break;
            } catch (DuplicateIDException | InputIDEmloyeeException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            try {
                idCard = InputIdCardRegex.getIdCardRegex(InputUtil.getString("Nhập CMND mới: "));
                for (Employee item : employeeList) {
                    if (item.getIdCard().equals(idCard)) {
                        throw new InputIDCardException("Chứng minh nhân dân đã tồn tại!");
                    }
                }
                break;
            } catch (InputIDCardException e) {
                e.printStackTrace();
            }
        }
        employee = infoEmployee(idEmployee, idCard);
        employeeList.add(employee);
        IOEmployeeUtil.writeEmployee(IOEmployeeUtil.PATH_EMPLOYEE, employeeList);
        System.out.println("Thêm mới thành công!\n");

    }

    @Override
    public void remove() {
        employeeList = IOEmployeeUtil.readEmployee(IOEmployeeUtil.PATH_EMPLOYEE);
        String idRemove = InputUtil.getString("Mời bạn nhập mã nhân viên cần xóa:");
        boolean answer = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployee().equals(idRemove)) {
                int chooseYesNo = InputUtil.getInt("Bạn chắc chắn muốn xóa?\n1. Có" +
                        "\n2. Không");
                if (chooseYesNo == 1) {
                    employeeList.remove(i);

                    IOEmployeeUtil.writeEmployee(IOEmployeeUtil.PATH_EMPLOYEE, employeeList);
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
        boolean flag = false;
        employeeList = IOEmployeeUtil.readEmployee(IOEmployeeUtil.PATH_EMPLOYEE);
        String idFind = InputUtil.getString("Mời bạn nhập mã nhân viên cần sửa:");
        idFind=idFind.toUpperCase();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployee().equals(idFind)) {
                System.out.println("\nThông tin nhân viên đang sửa là:\n" + employeeList.get(i));

                while (true) {
                    try {
                        employeeList.get(i).setName(InputNameRegex.getNameUtil(InputUtil.getString("\nNhập tên cần sửa:")));
                        break;
                    } catch (InputNameException e) {
                        e.printStackTrace();
                    }
                }

                employeeList.get(i).setBirthday(InputDayRegex.getBirthDay("Nhập ngày sinh cần sửa: "));

                employeeList.get(i).setGender(InputPersonUtil.inputGenderUtil());

                while (true) {
                    try {
                        String cmnd = InputIdCardRegex.getIdCardRegex(InputUtil.getString("Nhập CMND cần sửa:"));
                        for (int j = 0; j < employeeList.size(); j++) {
                            if (employeeList.get(j).getIdCard().equals(cmnd) && j != i) {
                                throw new DuplicateIDException("Trùng CMND, mời nhập lại!");
                            }
                        }
                        employeeList.get(i).setIdCard(cmnd);
                        break;
                    } catch (DuplicateIDException | InputIDCardException e) {
                        e.printStackTrace();
                    }
                }

                while (true) {
                    try {
                        employeeList.get(i).setNumberPhone(InputPhoneNumberRegex.getNumberphoneRegex(InputUtil.getString("Nhập số điện thoại cần sửa:")));
                        break;
                    } catch (InputNumberPhoneException e) {
                        e.printStackTrace();
                    }
                }

                while (true) {
                    try {
                        employeeList.get(i).setEmail(InputEmailRegex.getEmail(InputUtil.getString("Nhập vào email mới: ")));
                        break;
                    } catch (InputEmailException e) {
                        e.printStackTrace();
                    }
                }

                while (true) {
                    try {
                        employeeList.get(i).setAddress(InputAddressRegex.getAddressRegex(InputUtil.getString("Nhập địa chỉ cần sửa:")));
                        break;
                    } catch (InputAddressException e) {
                        e.printStackTrace();
                    }
                }

                employeeList.get(i).setDegree(InputPersonUtil.inputDegreeUtil());
                employeeList.get(i).setPosition(InputPersonUtil.inputPositionUtil());
                employeeList.get(i).setSalary(InputUtil.getDouble("Nhập lương cần sửa:"));

                IOEmployeeUtil.writeEmployee(IOEmployeeUtil.PATH_EMPLOYEE, employeeList);
                System.out.println("Đã cập nhập thành công nhân viên có mã " + idFind);
                flag = true;
                employeeList.clear();
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy mã nhân viên: " + idFind);
        }
    }

    @Override
    public void findID() {
        employeeList = IOEmployeeUtil.readEmployee(IOEmployeeUtil.PATH_EMPLOYEE);
        String idFind = InputUtil.getString("Mời bạn nhập mã nhân viên cần tìm:");
        idFind = idFind.toUpperCase();
        boolean iFlag = false;
        for (Employee employee : employeeList) {
            if (employee.getIdEmployee().equals(idFind)) {
                System.out.println("tìm thấy thông tin: " + idFind);
                System.out.println(employee);
                iFlag = true;
            }
        }
        if (!iFlag) {
            System.out.println("Không tìm thấy thông tin: " + idFind);
        }

    }

    @Override
    public void findName() {
        employeeList = IOEmployeeUtil.readEmployee(IOEmployeeUtil.PATH_EMPLOYEE);

        String findName = InputUtil.getString("Mời bạn nhập tên cần tìm:");
        List<Employee> employees = new ArrayList<>();

        findName = findName.toLowerCase();
        boolean isFlag = false;
        for (Employee employee : employeeList) {
            if (employee.getName().toLowerCase().contains(findName)) {
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
        List<Employee> employeeList = IOEmployeeUtil.readEmployee(IOEmployeeUtil.PATH_EMPLOYEE);
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }
}
