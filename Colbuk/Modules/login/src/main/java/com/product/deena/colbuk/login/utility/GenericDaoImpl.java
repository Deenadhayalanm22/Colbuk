package com.product.deena.colbuk.login.utility;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.product.deena.colbuk.login.entity.UserDetail;

public class GenericDaoImpl<T> implements GenericDao<T>{
	
	@Autowired
	private SessionFactory sessionFactory;
 
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public T create(T t) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(t);
		return t;
	}

	public void delete(T t, Object param) {
		//
	}

	public T find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	public T update(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	public long executeNativeInsertOrUpdate(String sqlScript) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<T> findByNamedQuery(String queryName, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findByNamedQuery(String queryName) {
		Session session = sessionFactory.getCurrentSession();
		Query query =  session.getNamedQuery(queryName);
		List<T> t = query.list();
		return t;
	}

	public Object findObjectByNamedQuery(String queryName, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public List executeNativeQuery(String sqlScript) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> executeNativeQuery(String sqlScript, T t) {
		// TODO Auto-generated method stub
		return null;
	}

	public long executeInsert(String sqlScript) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ResultSet executeQueryString(String sqlScript) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}

}
