package ss10_dsa_list.exercise.arraymylist.model;

public class Student {
    private int iD;
    private String name;

    public Student() {
    }

    public Student(int iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                '}';
    }
}
