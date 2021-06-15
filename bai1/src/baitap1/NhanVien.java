package baitap1;

public class NhanVien {
    private  String id;
    private  String name;
    private  int age;
    private  String number;
    private  String email;

    public NhanVien() {
    }

    public NhanVien(String id, String name, int age, String number, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.number = number;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                ", id= '" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                ", email='" + email + '\''
                ;
    }
}
