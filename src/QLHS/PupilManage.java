package QLHS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class PupilManage {
    Scanner input = new Scanner(System.in);
    LinkedList<Pupile> ds = new LinkedList<Pupile>();

    public void menu() throws ParseException {
        System.out.println("Menu:");
        System.out.println("1. nhap them hoc sinh moi vao danh sach");
        System.out.println("2. Tim hoc sinh theo tuoi");
        System.out.println("3. Tim hoc sinh theo que");
        System.out.println("4. Exit");

        int choice = Integer.parseInt(input.nextLine());

        switch (choice) {
            case 1:
                creatPupil();
                break;
            case 2:
                findPupilAge();
                break;
            case 3:
                findPupilHometown();
                break;
            case 4:
                System.exit(0);
        }
    }

    public void creatPupil() throws ParseException {
        System.out.println("Nhap thong tin hoc sinh:");
        System.out.println("lop:");
        String lop = input.nextLine();
        System.out.println("hoc ky:");
        int hocKy = Integer.parseInt(input.nextLine());
        System.out.println("khoa:");
        int khoa = Integer.parseInt(input.nextLine());
        System.out.println("Ho va ten:");
        String name = input.nextLine();
        System.out.println("ngay thang nam sinh:");
        String date = input.nextLine();
        Date birthday = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        System.out.println("que quan:");
        String hometown = input.nextLine();

        Pupile pupile = new Pupile(lop, hocKy, khoa, name, birthday, hometown);

        ds.add(pupile);
    }

    public void findPupilAge() {
        System.out.println("nhap hoc sinh co do tuoi can tim:");
        int age = Integer.parseInt(input.nextLine());
        for (int i = 0; i < ds.size(); i++) {
            if (age == ds.get(i).getBirthday().getYear()+1900) {
                System.out.println(ds.get(i).toString());
            }
        }
    }

    public void findPupilHometown() {
        System.out.println("nhap hoc sinh co que quan can tim:");
        String hometown = input.nextLine();
        for (int i = 0; i < ds.size(); i++) {
            if (hometown.equals(ds.get(i).getHometown())) {
                System.out.println(ds.get(i).toString());
            }
        }
    }
}
