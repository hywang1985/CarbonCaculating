package persistence.dao;

import static org.hibernate.criterion.Example.create;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import entity.Device;
import entity.Port;
import exception.DataAccessRuntimeException;

public class HibernateGenericDaoImpl implements HibernateGenericDao{
	
	protected SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Serializable findById(String className, Serializable id)
	   throws DataAccessRuntimeException {
		// Get session and perform query
		Session session = sessionFactory.getCurrentSession();
		Serializable instance = (Serializable) session.get(className, id);
		if (instance == null) {
			throw new DataAccessRuntimeException("No instance matching " + id + " found.");
		}
		return instance;
	}

	@SuppressWarnings("rawtypes")
	public List findByExample(Serializable example) throws DataAccessRuntimeException {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		Transaction tx=	session.beginTransaction();
		List<Serializable> results = (List<Serializable>) session
		   .createCriteria(example.getClass().getName()).add(create(example)).list();
		tx.commit();
		return results;
	}

	public Serializable save(Serializable instance) throws DataAccessRuntimeException {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx=	session.beginTransaction();
		Serializable id = session.save(instance);
		session.flush();
		tx.commit();
		return instance;
	}

	public Serializable update(Serializable instance) throws DataAccessRuntimeException {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx=	session.beginTransaction();
		Serializable instance2 = (Serializable) session.merge(instance);
		session.flush();
		tx.commit();
		return instance2;
	}

	public boolean delete(Serializable instance) throws DataAccessRuntimeException {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx=	session.beginTransaction();
		session.delete(instance);
		session.flush();
		tx.commit();
		return true;

	}
	public static void main(String[] args) {
		HibernateGenericDaoImpl dao=new HibernateGenericDaoImpl();
		Device device1=new Device();
		device1.setName("转化炉");
		device1.setDevice_no(1);
		Port port1= new Port();
		port1.setIsInputing(true);
		port1.setC_percent(new Double(0.8));
		port1.setHolder(device1);
		port1.setM_quantity﻿﻿﻿(new Double(5000));
		port1.setNum(1);
		port1.setTemperature(new Double(500));
		device1.getPorts().add(port1);
		dao.save(device1);
//		dao.findByExample(new Device());
	}
}
