package com.ruanzz.s2sh.service.impl;

import com.ruanzz.s2sh.dao.StudentDao;
import com.ruanzz.s2sh.domain.Student;
import com.ruanzz.s2sh.service.StudentService;

public class StudentServiceImpl implements StudentService{

	private StudentDao studentDao;
	
	
	public StudentDao getStudentDao() {
		return studentDao;
	}


	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
	}

}
