package com.dbpractice.app.db_practice.dao;

import com.dbpractice.app.db_practice.enity.Student;

public interface StudentsDao {
	void addStudent(Student student);
	Student getStudentById(int id);

        }
