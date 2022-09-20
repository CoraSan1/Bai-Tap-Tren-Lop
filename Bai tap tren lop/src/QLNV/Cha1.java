package QLNV;

public class Cha1 {
    private double id;
    private String name;
    private double age;
    private String address;

    public Cha1() {
    }

    public Cha1(double id, String name, double age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void show(){
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + ", age=" + age + ", address='" + address ;
    }
}
