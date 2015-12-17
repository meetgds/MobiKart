package com.gds.main;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gds.pojo.Dimension;
import com.gds.pojo.Mobile;

public class MobiKartMain {
	
	private static Configuration configuration = new Configuration();
	private static SessionFactory sessionFactory;
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		
		Dimension dimension = (Dimension) applicationContext.getBean("dimension");
		System.out.println(dimension.toString());
		configuration = new Configuration();
		sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Mobile phone = new Mobile(101, "Apple", "iPhone 6", 8, Arrays.asList("Grey", "Gold"), 4.7d, "iOs");
		session.save(phone);
		System.out.println(phone.toString());
		session.close();
	}

}
