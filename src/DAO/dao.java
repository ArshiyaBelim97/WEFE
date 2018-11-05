package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.register_vo;

//import VO.login_vo;

public class dao {
	public void inst(register_vo v1)
	{
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		    Transaction t = session.beginTransaction();
		    session.save(v1);
		    System.out.println("Successfully");
		    t.commit();
		    session.close();
		    factory.close();
	}
	
	
	public static List search(register_vo v1){
		List sc=new ArrayList();
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		    
		    Transaction t = session.beginTransaction();
		    
		    Query q=session.createQuery("from register_vo where User_name like '"+v1.getUser_name()+"' AND Password like'"+v1.getPassword()+"'");
		    sc=q.list();
		    
		    System.out.println("Successfully");
		    t.commit();
		    session.close();
		    factory.close();
		    return sc;
	}
	
}
