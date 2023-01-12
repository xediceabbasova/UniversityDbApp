package com.company.main;

import com.company.dao.inter.StudentDaoInter;
import com.company.entity.Student;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws Exception {
        StudentDaoInter dao = Context.instanceStudentDao();

//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        java.util.Date dt = sdf.parse("27-09-2003");
//        long l2 = dt.getTime();
//        java.sql.Date dtt = new java.sql.Date(l2);
//        Student s = new Student(5, "Samire", "Abbasova", "Salman", dtt, "sncjhbv0", "+9945441", "bshcjb", 5310000, "scbh", "jhaxbc", "hdbvajda00");
//        dao.addStudent(s);
        dao.removeStudent(5);
        dao.removeStudent(3);
        dao.removeStudent(4);
        dao.removeStudent(6);
        dao.removeStudent(7);
    }
}
