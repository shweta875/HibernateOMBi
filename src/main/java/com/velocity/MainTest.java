package com.velocity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Question question=new Question();
		question.setQuestion("what is your name");
		
		Answer a1=new Answer();
		a1.setAnswer("my name is shweta");
		a1.setQuestion(question);
		
		Answer a2=new Answer();
		a2.setAnswer("my name is yuvraj");
		a2.setQuestion(question);
		
		Answer a3=new Answer();
		a3.setAnswer("my name is swaraj");
		a3.setQuestion(question);
		
		List<Answer> answer=new ArrayList();
		question.setAnswer(answer);
		
		session.save(question);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		

	}

}
