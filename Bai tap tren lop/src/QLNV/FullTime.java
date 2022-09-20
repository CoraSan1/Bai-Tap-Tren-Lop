package QLNV;

public class FullTime extends Cha1{
    private double salary;

    public FullTime() {
    }

    public FullTime(double id, String name, double age, String address, double salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " salary= " + salary;
    }
}
