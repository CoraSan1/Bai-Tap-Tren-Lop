package QuanLyNhanVien;

public class Parttime extends Cha{
    private int ngaydilam;

    public Parttime(){
    }

    public Parttime(int ngaydilam) {
        this.ngaydilam = ngaydilam;
    }

    public Parttime(int id, String name, int age, String address, int ngaydilam) {
        super(id, name, age, address);
        this.ngaydilam = ngaydilam;
    }

    public int getNgaydilam() {
        return ngaydilam;
    }

    public void setNgaydilam(int ngaydilam) {
        this.ngaydilam = ngaydilam;
    }

    @Override
    public String toString() {
        return super.toString() + " ngày đi làm: " + ngaydilam;
    }
}
