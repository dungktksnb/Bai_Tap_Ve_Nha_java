package baitap1;

public class Main {
    public static void main(String[] args) {
        NhanVienFullTime nv1=new NhanVienFullTime("11","dung",11,"0985706419","dung@gmail.com",10000.0,5000,12000);
        NhanVienPartTime nv2=new NhanVienPartTime();
        System.out.println(nv1.toString());
    }
}
