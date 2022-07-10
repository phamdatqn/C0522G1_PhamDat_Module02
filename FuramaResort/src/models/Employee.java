package models;

public class Employee extends Person{
    private int iDEmployee;
    private String degree;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeCode, String degree, String position, double salary) {
        this.iDEmployee = employeeCode;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeCode() {
        return iDEmployee;
    }

    public void setEmployeeCode(int employeeCode) {
        this.iDEmployee = employeeCode;
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
}
