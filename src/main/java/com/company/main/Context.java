package com.company.main;

import com.company.dao.inter.StudentDaoInter;
import com.company.dao.impl.StudentDaoImpl;

public class Context {

    public static StudentDaoInter instanceStudentDao() {
        return new StudentDaoImpl();
    }
}
