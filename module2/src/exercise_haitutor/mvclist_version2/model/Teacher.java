package exercise_haitutor.mvclist_version2.model;

public class Teacher extends Person {

    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBirth, String sex, String specialize) {
        super(id, name, dateOfBirth,sex);
        this.specialize = specialize;
    }



    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return  super.toString()+", Chuyên môn: " + specialize ;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s",getId(),getName(),getDateOfBirth(),getSex(),getSpecialize());
    }
}
