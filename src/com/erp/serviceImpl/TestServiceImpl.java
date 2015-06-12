package com.erp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.dao.TestDao;
import com.erp.model.City;
import com.erp.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    public List<City> findCityAll() {
        List<City> list = testDao.findCityAll();
        return list;
    }
}
