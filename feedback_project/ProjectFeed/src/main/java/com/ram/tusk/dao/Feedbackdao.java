package com.ram.tusk.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ram.tusk.model.Feedback;
@Component
public class Feedbackdao 
{
	  @Autowired
	 private SessionFactory sessionFactory;
	@Transactional
	public void  addfeedback(Feedback fb) {
		System.out.println("in add feedback" + fb);
		
		Session session =sessionFactory.getCurrentSession();
		session.save(fb);
		
	}

}
