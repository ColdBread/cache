package com.dbpractice.app.db_practice.worker;

import com.dbpractice.app.db_practice.dao.StudentsDao;
import com.dbpractice.app.db_practice.enity.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithStudents {
    @Autowired
	private StudentsDao studentsDao;

        	public void saveStudentToDb(Student student){
        		if((student != null)&&(student.getPib()!=null)&&
        				(!"".equals(student.getPib()))&&
        				(student.getCourse()>0)){
         		studentsDao.addStudent(student);
         		System.out.println("Students have been saved " + student);
         		}
        	}
}
