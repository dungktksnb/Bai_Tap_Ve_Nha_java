package baitap1;

public class NhanVienFullTime extends NhanVien{
    private double soTienThuong;
    private double soTienPhat;
    private double luongCung;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(double soTienThuong, double soTienPhat, double luongCung) {
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public NhanVienFullTime(String id, String name, int age, String number, String email, double soTienThuong, double soTienPhat, double luongCung) {
        super(id, name, age, number, email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public double getSoTienThuong() {
        return soTienThuong;
    }

    public void setSoTienThuong(double soTienThuong) {
        this.soTienThuong = soTienThuong;
    }

    public double getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(double soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "soTienThuong=" + soTienThuong +
                ", soTienPhat=" + soTienPhat +
                ", luongCung=" + luongCung + super.toString() +
                '}';
    }
}
