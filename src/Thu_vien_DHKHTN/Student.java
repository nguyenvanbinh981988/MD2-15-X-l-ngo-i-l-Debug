package Thu_vien_DHKHTN;

import java.util.Date;

public class Student extends BorrowCard {
    private String name;
    private String StudentId;
    private Date birth;
    private String classId;

    public Student() {
    }

    public Student(String borrowedCardID,Date borrowDate,Date payDate,String bookID,String name, String studentId, Date birth, String classId) {
        super(borrowedCardID,borrowDate,payDate,bookID);
        this.name = name;
        this.StudentId = studentId;
        this.birth = birth;
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getClassId() {
        return classId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", StudentId='" + StudentId + '\'' +
                ", birth=" + birth +
                ", classId='" + classId + '\'' +
                ", borrowedCardID='" + getBorrowedCardID() + '\'' +
                ", borrowDate='" + getBorrowDate() + '\'' +
                ", payDate='" + getPayDate() + '\'' +
                ", bookID'" + getBookID() + '\'' +
                '}';
    }
}
