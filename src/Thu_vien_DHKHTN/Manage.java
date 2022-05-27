package Thu_vien_DHKHTN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Manage {
    Scanner input = new Scanner(System.in);

    //    ArrayList<BorrowCard> borrowCardslist = new ArrayList<BorrowCard>();
    ArrayList<Student> studentslist = new ArrayList<>();

    public void menu() throws ParseException {
        System.out.println("Menu:");
        System.out.println("1. Tao danh sach sinh vien muon sachs");
        System.out.println("2. Xoa sinh vien khi da tra lai sach");
        System.out.println("3. Hien thi danh sach sinh vien muon sach");
        System.out.println("4. Hien thi danh sach sinh vien da qua ngay tra nhung chua tra");
        System.out.println("5. Exit");


        int choice = Integer.parseInt(input.nextLine());

        switch (choice) {
            case 1:
                creatBorrowStudent();
                break;
            case 2:
                DeletePayStudent();
                break;
            case 3:
                showBorrowStudents();
                break;
            case 4:
                showNearPayDateStudent();
                break;
            case 5:
                System.exit(0);
        }
    }

    public void creatBorrowStudent() throws ParseException {
        try {
            System.out.println("Enter BorrowCardId: ");
            String borrowCardID = input.nextLine();
            System.out.println("Enter BorrowDate: ");
            String borrowDateStr = input.nextLine();
            Date borrowDate = new SimpleDateFormat("dd/MM/yyyy").parse(borrowDateStr);
            System.out.println("Enter PayDate: ");
            String payDateStr = input.nextLine();
            Date payDate = new SimpleDateFormat("dd/MM/yyyy").parse(payDateStr);
            System.out.println("Enter BookID: ");
            String bookID = input.nextLine();

            System.out.println("Enter Name: ");
            String name = input.nextLine();
            System.out.println("Enter StudentID: ");
            String studentId = input.nextLine();
            System.out.println("Enter Birthday: ");
            String dateStr = input.nextLine();
            Date birthday = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
            System.out.println("Enter ClassId: ");
            String classId = input.nextLine();

            Student student = new Student(borrowCardID,borrowDate,payDate,bookID,name,studentId,birthday,classId);

            studentslist.add(student);
        } catch (Exception e) {
            System.out.println("you are enter wrong, please try again");
            creatBorrowStudent();
        }
    }

    public void DeletePayStudent() {
        try {
            System.out.println("Enter BorrowCardID is paid: ");
            String borrowCardID = input.nextLine();
            for (int i = 0; i < studentslist.size(); i++) {
                if (borrowCardID.equals(studentslist.get(i).getBorrowedCardID())) {
                    studentslist.remove(i);
                }
            }
        } catch (Exception e) {
            System.out.println("you are enter wrong BorrowCardID, please try again");
            DeletePayStudent();
        }
    }

    public void showBorrowStudents() {
        System.out.println(" borrowing book Student list: ");
        for (int i = 0; i < studentslist.size(); i++) {
            System.out.println(studentslist.get(i).toString());
        }
    }

    public void showNearPayDateStudent() {
        Date date = new Date();
        for (int i = 0; i < studentslist.size(); i++) {
            if (date.compareTo(studentslist.get(i).getPayDate()) > 0) {
                System.out.println(studentslist.get(i).toString());
            }
        }
    }
}
