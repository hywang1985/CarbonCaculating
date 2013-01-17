package persistence.dao;

import java.io.Serializable;
import java.util.List;

import exception.DataAccessRuntimeException;

public interface HibernateGenericDao {
	public Serializable findById(String className, Serializable id)
	   throws DataAccessRuntimeException;

	@SuppressWarnings("rawtypes")
	public List findByExample(Serializable example) throws DataAccessRuntimeException;

	public Serializable save(Serializable instance) throws DataAccessRuntimeException;

	public Serializable update(Serializable instance) throws DataAccessRuntimeException;

	public boolean delete(Serializable instance) throws DataAccessRuntimeException;
}
