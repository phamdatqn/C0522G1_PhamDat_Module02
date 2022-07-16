package exercise_haitutor.mvclist.model;

public class Student extends Person{
    private double point;
    private String grade;

    public Student(int id, String name, String dateOfBirth, String sex, String grade) {
    }

    public Student(int id, String name, String dateOfBirth, double point,String grade) {
        super(id, name, dateOfBirth);
        this.point = point;
        this.grade=grade;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return  "ID: "+getId()+", Họ & tên: "+getName()+", Điểm: "+point;
    }
}
