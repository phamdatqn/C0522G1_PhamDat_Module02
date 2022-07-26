package exercise_haitutor.mvclist_version2.util;

import exercise_haitutor.mvclist_version2.model.Student;
import exercise_haitutor.mvclist_version2.model.Teacher;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFileUtil {
    public static String PATH_STUDENT = "module2/src/exercise_haitutor/mvclist_version2/data/studentList.txt";
    public static String PATH_TEACHER = "module2/src/exercise_haitutor/mvclist_version2/data/teacherList.txt";

    private static List<String> readFile(String path) {
        List<String> stringsRead = new ArrayList<>();
        try {

            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                stringsRead.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return stringsRead;
    }

    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static @NotNull
    List<Student> readStudentFile(String path) {
        List<String> data = readFile(path);
        List<Student> studentList = new ArrayList<>();
        String[] arrProperty;
        for (String item : data) {
            arrProperty = item.split(",");
            studentList.add(new Student(Integer.parseInt(arrProperty[0]), arrProperty[1],
                    arrProperty[2], arrProperty[3], Double.parseDouble(arrProperty[4]), arrProperty[5]));
        }
        return studentList;
    }

    public static void writeStudentFile(String path, List<Student> students) {
        StringBuilder data = new StringBuilder();
        for (Student student : students) {
            data.append(student.getInfo()).append("\n");
        }

        data.deleteCharAt(data.length() - 1);
        try {
            writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Teacher> readTeacherFile(String path) {
        List<String> data = readFile(path);
        List<Teacher> teacherData = new ArrayList<>();
        String[] arrProperty;
        for (String item : data) {
            arrProperty = item.split(",");
            teacherData.add(new Teacher(Integer.parseInt(arrProperty[0]), arrProperty[1],
                    arrProperty[2], arrProperty[3], arrProperty[4]));
        }
        return teacherData;
    }

    public static void writeTeacherFile(String path, List<Teacher> teachers) {
        StringBuilder data = new StringBuilder();
        for (Teacher teacher : teachers) {
            data.append(teacher.getInfo()).append("\n");
        }

        data.deleteCharAt(data.length() - 1);
        try {
            writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
