package com.ittx.hibate.test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.ittx.hibate.model.People;
import com.ittx.hibate.model.Section;
import com.ittx.hibate.untls.HibernateUtil;

public class PeopleTest {

	
	private Session session;
	

	@Before
	public void setUp() throws Exception {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	    session.beginTransaction();
	   
	}

	@After
	public void tearDown() throws Exception {
		
		session.getTransaction().commit();
		
	}

	@Test
	public void testPeople() {
		People peoplez = new People(5, "史上最", 12);
		People peoplel = new People(4, "史上", 22);
		session.save(peoplez);
		session.save(peoplel);
		
		HashSet<People> people = new HashSet<>();
		people.add(peoplez);
		people.add(peoplel);
		
		
		Section section = new Section(21,"java1606","java开发学习");
		section.setPeoples(people); //学生集合和班级关联
		
		session.save(section);
	}

}
