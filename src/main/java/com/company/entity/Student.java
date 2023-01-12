package com.company.entity;

import java.sql.Date;

public class Student {

    private int id;
    private String name;
    private String surname;
    private String father_name;
    private Date birthdate;
    private String address;
    private String phone;
    private String email;
    private int student_card_number;
    private String faculty;
    private String group_name;
    private String scholarship;

    public Student(int id) {
        this.id = id;
    }

    public Student() {
    }

    public Student(int id, String name, String surname, String father_name, Date birthdate, String address, String phone, String email, int student_card_number, String faculty, String group_name, String scholarship) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.father_name = father_name;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.student_card_number = student_card_number;
        this.faculty = faculty;
        this.group_name = group_name;
        this.scholarship = scholarship;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStudent_card_number() {
        return student_card_number;
    }

    public void setStudent_card_number(int student_card_number) {
        this.student_card_number = student_card_number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", father_name=" + father_name + ", birthdate=" + birthdate + ", address=" + address + ", phone=" + phone + ", email=" + email + ", student_card_number=" + student_card_number + ", faculty=" + faculty + ", group_name=" + group_name + ", scholarship=" + scholarship + '}';
    }

}
