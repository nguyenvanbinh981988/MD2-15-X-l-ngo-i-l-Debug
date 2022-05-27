package QLHS;

import java.text.ParseException;

public class Running {
    public static void main(String[] args) throws ParseException {
        PupilManage pupilManage =new PupilManage();
        while (true){
            pupilManage.menu();
        }
    }
}
