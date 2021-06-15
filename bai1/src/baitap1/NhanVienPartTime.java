package baitap1;

public class NhanVienPartTime extends NhanVien{
    private int soGioLamViec;

    public NhanVienPartTime() {
    }



    public NhanVienPartTime(String id, String name, int age, String number, String email, int soGioLamViec) {
        super(id, name, age, number, email);
        this.soGioLamViec = soGioLamViec;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "soGioLamViec=" + soGioLamViec + super.toString() +
                '}';
    }
}
