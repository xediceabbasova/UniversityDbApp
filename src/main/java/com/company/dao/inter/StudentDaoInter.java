package com.company.dao.inter;

import com.company.entity.Student;
import java.util.List;

public interface StudentDaoInter {

    public List<Student> getAll();

    public Student getById(int id);

    public boolean updateStudent(Student s);

    public boolean addStudent(Student s);

    public boolean removeStudent(int id);

}
