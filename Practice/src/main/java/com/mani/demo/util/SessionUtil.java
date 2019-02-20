package com.mani.demo.util;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SessionUtil {
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	private SessionFactory sessionFactory = null;
	
	public SessionFactory getSessionFactory(){
		if(sessionFactory == null){
			sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
		}else{
			
		}
		return sessionFactory;
	}

}
