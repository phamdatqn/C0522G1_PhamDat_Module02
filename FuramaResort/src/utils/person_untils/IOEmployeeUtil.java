package utils.person_untils;

import models.model_person.Employee;
import utils.IOFileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOEmployeeUtil extends IOFileUtil {
    public static String PATH_EMPLOYEE = "FuramaResort/src/data/employee.csv";

    public static List<Employee> readEmployee(String path) {
        List<String> data = readFile(path);
        List<Employee> employeeData = new ArrayList<>();
        String[] arrProperty;
        for (String item : data) {
            item = item.replaceAll(",", ".");
            arrProperty = item.split("\\$\\$");
            employeeData.add(new Employee(arrProperty[0], arrProperty[1], arrProperty[2], arrProperty[3]
                    , arrProperty[4], arrProperty[5], arrProperty[6], arrProperty[7], arrProperty[8], arrProperty[9], Double.parseDouble(arrProperty[10].trim())));
        }
        return employeeData;
    }

    public static void writeEmployee(String path, List<Employee> employees) {
        StringBuilder data = new StringBuilder();
        data.append("Họ tên, ngày sinh, giới tính, CMND, SĐT, email, address, mã nhân viên, trình độ, chức vụ, lương\n");
        for (Employee employee : employees) {
            data.append(employee.getInfo()).append("$$").append("\n");
        }
        data.deleteCharAt(data.length() - 1);
        try {
            writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
