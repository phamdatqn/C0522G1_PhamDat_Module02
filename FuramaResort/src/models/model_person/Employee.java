package models.model_person;

public class Employee extends Person {
    private String idEmployee;
    private String degree;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String birthday, String gender, String idCard,
                    String numberPhone, String email, String address, String idEmployee,
                    String degree, String position, double salary) {
        super(name, birthday, gender, idCard, numberPhone, email, address);
        this.idEmployee = idEmployee;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format("\n************ EMPLOYEE ************" +
                "\nMã nhân viên: %s%s" +
                "\nChức vụ: %s" +
                "\nBằng cấp: %s" +
                "\nLương: %.2f VNĐ", idEmployee, super.toString(), getPosition(), degree, getSalary());
    }

    @Override
    public String getInfo() {
        return String.format("%s$$%s$$%s$$%s$$%s$$%s$$%s$$%s$$%s$$%s$$%.2f", getName(), getBirthday(), getGender(), getIdCard(),
                getNumberPhone(), getEmail(), getAddress(), idEmployee, degree, position, salary);
    }
}
