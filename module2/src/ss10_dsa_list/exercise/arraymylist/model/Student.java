package ss10_dsa_list.exercise.arraymylist.model;

public class Student {
    private int id;
    private String name;
    private String address;

    public Student() {
    }

    public Student(int iD, String name,String address) {
        this.id = iD;
        this.name = name;
        this.address=address;
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

    @Override
    public String toString() {
        return "ID: "+ id +", Họ và tên: "+name+ ", Địa chỉ: "+address;
    }
}
