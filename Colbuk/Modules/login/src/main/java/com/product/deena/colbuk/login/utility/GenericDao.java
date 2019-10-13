package com.product.deena.colbuk.login.utility;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public interface GenericDao<T> {
	
	public T create(T t);
	
	public void delete(T t);
	
	public T find(Object id);
	
	public T update(T t);
	
	public long executeNativeInsertOrUpdate(String sqlScript);
	
	public List<T> findByNamedQuery(String queryName, Map<String, Object> params);
	
	public List<T> findByNamedQuery(String queryName);
	
	public Object findObjectByNamedQuery(String queryName, Map<String, Object> params);
	
	public List executeNativeQuery(String sqlScript);
	
	public List<T> executeNativeQuery(String sqlScript, T t);
	
	public long executeInsert(String sqlScript);
	
	public ResultSet executeQueryString(String sqlScript);

}
