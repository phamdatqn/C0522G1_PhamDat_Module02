package exercise_haitutor.mvclist.model;

public abstract class Person {

    private int id;
    private String name;
    private String dateOfBirth;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Họ và tên: " + name + ", ID: " + id +
                ", Ngày tháng năm sinh: " + dateOfBirth;
    }
}
