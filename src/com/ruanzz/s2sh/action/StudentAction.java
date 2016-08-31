package com.ruanzz.s2sh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ruanzz.s2sh.domain.Student;
import com.ruanzz.s2sh.service.StudentService;

public class StudentAction  extends ActionSupport{

	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	/**
	 *  保存学生
	 * @return  null
	 */
	public String saveStudent(){
		Student student=new Student();
		student.setName("qingyl");
		studentService.saveStudent(student);
		return "index";
	}
	
	
}
