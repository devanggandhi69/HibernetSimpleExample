package com.hibernet.test;



import java.sql.Date;

import org.hibernate.Session;

import com.hibernet.util.HibernateUtil;
import com.hibernet.vo.User;

public class Test {
	public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        User user = new User();
 
        user.setUserId(1);
        user.setUsername("Devang");
        user.setCreatedBy("Google");
        user.setCreatedDate(new Date(0));
 
        session.save(user);
        session.getTransaction().commit();
    }

}
