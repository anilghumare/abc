package com.zensar.client3;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.zensar.entity.Product3;
import com.zensar.entity.Student3;
import java.util.Date;
import java.util.List;
public class Client3 {

	//private static Query query;

	public static void main(String[] args) {
		//Student3 student = new Student3(6, "Vikas", 23, new Date());
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
	  // Query query = session.getNamedQuery("abc");
		
		/*SQLQuery sqlQuery = session.createSQLQuery("select * from StudentInfo");
		sqlQuery.addEntity(Student3.class);
		List list = sqlQuery.list();*/
		Criteria criteria = session.createCriteria(Student3.class);
		
		
		//criteria.add(Restrictions.gt("studentAge", 30));
		criteria.addOrder(Order.asc("studentName"));
		List list = criteria.list();
		
		
		for (Object obj: list)
			System.out.println(obj);
		
	   
	   
	 
		 //Transaction transaction = session.beginTransaction();
		
		//transaction.commit();
		
		session.close();
		
		//System.out.println(student);

	}

}
