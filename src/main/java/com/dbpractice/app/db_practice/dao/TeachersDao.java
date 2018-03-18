package com.dbpractice.app.db_practice.dao;

import com.dbpractice.app.db_practice.enity.Teacher;

public interface TeachersDao {
	void addTeacher(Teacher teacher);
	Teacher getTeacherById(int id);
	void saveTeacher(Teacher teacher);
}
