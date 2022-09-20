package QuanLyNhanVien;

public class Fulltime extends Cha{
    private double salary;

    public Fulltime(){
    }

    public Fulltime(double salary) {
        this.salary = salary;
    }

    public Fulltime(int id, String name, int age, String address, double salary) {
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
        return super.toString() + " Lương: " + salary;
    }
}
