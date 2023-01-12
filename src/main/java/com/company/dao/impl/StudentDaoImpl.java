package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.StudentDaoInter;
import com.company.entity.Student;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl extends AbstractDao implements StudentDaoInter {

    public Student getStudent(ResultSet rs) throws Exception {

        int id = rs.getInt("id");
        String name = rs.getString("name");
        String surname = rs.getString("surname");
        String father_name = rs.getString("father_name");
        Date birthdate = rs.getDate("birthdate");
        String address = rs.getString("address");
        String phone = rs.getString("phone");
        String email = rs.getString("email");
        int student_card_number = rs.getInt("student_card_number");
        String faculty = rs.getString("faculty");
        String group_name = rs.getString("group_name");
        String scholarship = rs.getString("scholarship");

        return new Student(id, name, surname, father_name, birthdate, address, phone, email, student_card_number, faculty, group_name, scholarship);
    }

    @Override
    public List<Student> getAll() {
        List<Student> result = new ArrayList<>();

        try ( Connection c = connect()) {

            Statement stmt = c.createStatement();
            stmt.execute("select * from student.student_table");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                Student s = getStudent(rs);
                result.add(s);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public Student getById(int student_id) {

        Student result = null;

        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from student_table where id= " + student_id);
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                result = getStudent(rs);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean updateStudent(Student s) {

        try ( Connection c = connect()) {

            PreparedStatement stmt = c.prepareStatement("update student_table set name=?, surname=?, father_name=?, birthdate=?, address=?, phone=?, email=?, student_card_number=?, faculty=?, group_name=?, scholarship=? where id=?");
            stmt.setString(1, s.getName());
            stmt.setString(2, s.getSurname());
            stmt.setString(3, s.getFather_name());
            stmt.setDate(4, s.getBirthdate());
            stmt.setString(5, s.getAddress());
            stmt.setString(6, s.getPhone());
            stmt.setString(7, s.getEmail());
            stmt.setInt(8, s.getStudent_card_number());
            stmt.setString(9, s.getFaculty());
            stmt.setString(10, s.getGroup_name());
            stmt.setString(11, s.getScholarship());
            stmt.setInt(12, s.getId());
            return stmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addStudent(Student s) {

        try ( Connection c = connect()) {

            PreparedStatement stmt = c.prepareStatement("insert into student_table(name,surname,father_name,birthdate,address,phone,email,student_card_number,faculty,group_name,scholarship) values(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, s.getName());
            stmt.setString(2, s.getSurname());
            stmt.setString(3, s.getFather_name());
            stmt.setDate(4, s.getBirthdate());
            stmt.setString(5, s.getAddress());
            stmt.setString(6, s.getPhone());
            stmt.setString(7, s.getEmail());
            stmt.setInt(8, s.getStudent_card_number());
            stmt.setString(9, s.getFaculty());
            stmt.setString(10, s.getGroup_name());
            stmt.setString(11, s.getScholarship());
            return stmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removeStudent(int id) {
        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("delete from student_table where id=" + id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
