package com.ruanzz.s2sh.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ruanzz.s2sh.dao.StudentDao;
import com.ruanzz.s2sh.domain.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao{

	public void saveStudent(Student student) {
		this.getHibernateTemplate().save(student);
	}

}
