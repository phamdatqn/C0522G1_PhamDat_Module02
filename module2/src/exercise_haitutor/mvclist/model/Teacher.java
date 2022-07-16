package exercise_haitutor.mvclist.model;

public class Teacher extends Person {
    private String sex;
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBirth, String sex, String specialize) {
        super(id, name, dateOfBirth);
        this.sex = sex;
        this.specialize = specialize;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Id: "+getId()+", Họ và tên: "+getName()+", Giới tính: "+sex+", Chuyên môn: "+specialize;
    }
}
