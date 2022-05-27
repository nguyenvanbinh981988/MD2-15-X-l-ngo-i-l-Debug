package QLHS;

import java.util.Date;

public class Pupile<E> extends People<E>{
    private String name;
    private Date birthday;
    private String hometown;

    public Pupile() {
    }

    public Pupile(String lop, int hocKy, int khoa,String name, Date birthday, String hometown) {
        super(lop,hocKy,khoa);
        this.name = name;
        this.birthday = birthday;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Pupile{" +
                "class='" + getLop() + '\'' +
                "semester='" + getHocKy() + '\'' +
                "course='" + getKhoa() + '\'' +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
