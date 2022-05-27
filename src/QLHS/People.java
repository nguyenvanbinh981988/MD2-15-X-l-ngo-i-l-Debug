package QLHS;

import java.util.Date;

public class People<E> {
    private String lop;
    private int hocKy;
    private int khoa;

    public People() {
    }

    public People(String lop, int hocKy, int khoa) {
        this.lop = lop;
        this.hocKy = hocKy;
        this.khoa = khoa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }


    @Override
    public String toString() {
        return "People{" +
                "lop='" + lop + '\'' +
                ", hocKy=" + hocKy +
                ", khoa=" + khoa +
                '}';
    }
}
