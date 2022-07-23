package exercise_haitutor.mvclist_version2.model;

public class Student extends Person {
    private double point;
    private String grade;

    public Student(int i, String s, String s1, String s2, double v) {
    }

    public Student(double point, String grade) {
        this.point = point;
        this.grade = grade;
    }

    public Student(int id, String name, String dateOfBirth, String sex,double point, String grade) {
        super(id, name, dateOfBirth, sex);
        this.point = point;
        this.grade = grade;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", Điểm: " + point +
                ", Lớp: " + grade ;
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s",getId(),getName(),getDateOfBirth(),getSex(),getPoint(),getGrade());
    }
}
