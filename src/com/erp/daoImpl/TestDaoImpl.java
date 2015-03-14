package com.erp.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.dao.TestDao;
import com.erp.model.City;
@Repository
public class TestDaoImpl implements TestDao {
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * 测试框架
	 */
	public List<City> findCityAll() {
		List<City> list=this.sessionFactory.getCurrentSession().createQuery(" from City c").list();
		return list;
	}

}
