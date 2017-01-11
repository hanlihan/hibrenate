package com.ittx.hibate.test;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ittx.hibate.model.Department;
import com.ittx.hibate.model.Employee;
import com.ittx.hibate.untls.HibernateUtil;

public class EmployeeTest {

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
	public void testEmployee() {
		Department department = new Department(11, "������", "���Ǿ�Ӣ���ĵط�");
		Department departments = new Department(21, "���ĳ�", "���Ǳ������ĵط�");
		
		Employee employee1 = new Employee(1,"����", 2500);
		Employee employee2 = new Employee(2,"����", 5500);

		session.save(departments);
		session.save(department);
		
		employee1.setDepartments(department);
		employee2.setDepartments(departments);
		
		session.save(employee1);
		session.save(employee2);
		
	}

}
