package com.ruanzz.s2sh.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ruanzz.s2sh.action.StudentAction;
import com.ruanzz.s2sh.domain.Student;
import com.ruanzz.s2sh.service.StudentService;

public class StudentTest  extends SpringUtils{
	
	@Test
	public void testSaveStudent() throws Exception {
		
		StudentService studentService =(StudentService)	context.getBean("studentService");
		Student student =new Student();
		student.setName("ruanzz");
		studentService.saveStudent(student );
	}
	
		@Test
		public void testStudentAction() throws Exception {
			
			//测试是否拿到action实例
		 StudentAction studentAction=(StudentAction)context.getBean("studentAction");
			
		}

}
