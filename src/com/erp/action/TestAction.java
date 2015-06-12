package com.erp.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.erp.model.City;
import com.erp.service.TestService;

/**
 * 此类只做测试用
 */
public class TestAction extends BaseAction {
    @Autowired
    private TestService testService;

    public String test() {
        List<City> list = testService.findCityAll();
        if (list != null && list.size() > 0) {
            for (City city : list) {
                System.out.println(city.getName());
            }
        }
        System.out.println("只为测试struts配置文件。");
        return SUCCESS;
    }
}
