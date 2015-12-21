package com.gds.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gds.pojo.Company;
import com.gds.pojo.Dimension;

public class MobiKartMain {

	private static Configuration configuration = new Configuration();
	private static SessionFactory sessionFactory;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

		Dimension dimension = (Dimension) applicationContext.getBean("dimension");
		System.out.println(dimension.toString());
		sessionFactory = configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		// Mobile phone = new Mobile(101, "Apple", "iPhone 6", 8, "Grey, Gold",
		// 4.7d, "iOs");
		// session.save(phone);
//		Mobile phone = session.get(Mobile.class, 1);
//		System.out.println(phone.toString());
		
		File appleLogo = new File("src/main/resources/img/apple.png");
		byte[] logo = null;
		try {
			logo = Files.readAllBytes(appleLogo.toPath());
			Company comp = new Company("Apple", logo);
			session.save(comp);
		} catch (IOException e) {
			System.err.println("Exception occured while getting logo : " + e.getMessage());
		}

		session.close();
	}

}
