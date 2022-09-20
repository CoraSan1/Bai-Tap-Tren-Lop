package QLNV;

public class PartTime extends Cha1{
    private int soNgayDiLam;

    public PartTime() {
    }

    public PartTime(double id, String name, double age, String address, int soNgayDiLam) {
        super(id, name, age, address);
        this.soNgayDiLam = soNgayDiLam;
    }

    public int getSoNgayDiLam() {
        return soNgayDiLam;
    }

    public void setSoNgayDiLam(int soNgayDiLam) {
        this.soNgayDiLam = soNgayDiLam;
    }

    @Override
    public String toString() {
        return super.toString() + " soNgayDiLam= " + soNgayDiLam;
    }
}
