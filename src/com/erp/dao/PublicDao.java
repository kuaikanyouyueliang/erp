/**
 * @Title: PublicDao.java TODO:
 * @Package com.erp.dao
 * @Description: TODO
 * @author chenguang
 * @date 2013-4-19 上午08:40:54
 * @version V1.0
 */
package com.erp.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 类功能说明 TODO:公用dao接口
 * 类修改者	修改日期
 * 修改说明
 * <p>Title: PublicDao.java</p>
 * <p>Description:福产流通科技</p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company:福产流通科技</p>
 *
 * @author shouyin 756514656@qq.com
 * @version V1.0
 * @date 2013-4-19 上午08:40:54
 */
public interface PublicDao<T> {
    /**
     * @param @param  o
     * @param @return 设定文件
     * @return Serializable    返回类型
     * @throws
     * @Title: save
     * @Description: TODO:保存一个对象
     */
    public Serializable save(T o);

    /**
     * @param @param o    设定文件
     * @return void    返回类型
     * @throws
     * @Title: delete
     * @Description: TODO:删除一个对象
     */
    public void delete(T o);

    /**
     * @param @param o    设定文件
     * @return void    返回类型
     * @throws
     * @Title: update
     * @Description: TODO:更新一个对象
     */
    public void update(T o);

    /**
     * @param @param o    设定文件
     * @return void    返回类型
     * @throws
     * @Title: saveOrUpdate
     * @Description: TODO:保存或更新对象
     */
    public void saveOrUpdate(T o);

    /**
     * @param @param  hql
     * @param @return 设定文件
     * @return List<T>    返回类型
     * @throws
     * @Title: find
     * @Description: TODO:查询
     */
    public List<T> find(String hql);

    /**
     * @param @param  c
     * @param @param  id
     * @param @return 设定文件
     * @return T    返回类型
     * @throws
     * @Title: get
     * @Description: TODO:获得一个对象
     */
    public T get(Class<T> c, Serializable id);

    /**
     * @param @param  hql
     * @param @return 设定文件
     * @return Long    返回类型
     * @throws
     * @Title: count
     * @Description: TODO:select count(*) from 类
     */
    public Long count(String hql);

    /**
     * @param @param  hql
     * @param @return 设定文件 响应数目
     * @return Integer    返回类型
     * @throws
     * @Title: executeHql
     * @Description: TODO:执行HQL语句
     */
    public Integer executeHql(String hql);

    /**
     * @param @param  hql
     * @param @param  params
     * @param @return 设定文件
     * @return List<T>    返回类型
     * @throws
     * @Title: find
     * @Description: TODO:查询集合
     */
    List<T> find(String hql, Map<String, Object> params);

    /**
     * @param @param  hql
     * @param @param  params
     * @param @param  page
     * @param @param  rows
     * @param @return 设定文件
     * @return List<T>    返回类型
     * @throws
     * @Title: find
     * @Description: TODO:查询分页集合
     */
    List<T> find(String hql, Map<String, Object> params, Integer page,
                 Integer rows);

    /**
     * @param @param  hql
     * @param @param  param
     * @param @return 设定文件
     * @return T    返回类型
     * @throws
     * @Title: get
     * @Description: TODO:根据参数查询实体类
     */
    T get(String hql, Map<String, Object> param);

    /**
     * @param @param  hql
     * @param @param  params
     * @param @return 设定文件
     * @return Long    返回类型
     * @throws
     * @Title: count
     * @Description: TODO:根据参数查询集合条数
     */
    Long count(String hql, Map<String, Object> params);

    /**
     * @param @param  hql
     * @param @param  params
     * @param @return 设定文件
     * @return Integer    返回类型
     * @throws
     * @Title: executeHql
     * @Description: TODO:批量执行HQL (更新) 响应数目
     */
    Integer executeHql(String hql, Map<String, Object> params);

    @SuppressWarnings("rawtypes")
    List findBySQL(String sql);

    void deleteToUpdate(T o);

}
