package com.ruanzz.s2sh.test;

import org.hibernate.SessionFactory;
import org.junit.Test;

public class SessiionFactory extends SpringUtils {

	@Test
	public void testSessionFactory() {
		SessionFactory sessionFactory = (SessionFactory) context
				.getBean("sessionFactory");
		
		System.out.println(sessionFactory);
	}

}
