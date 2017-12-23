package com.lzq.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 所有dao公用方法的接口
 * @param <T>
 */
public interface IBaseDao<T> {

    /**
     * 保存
     * @param t
     */
    void save(T t);

    /**
     * 更新
     * @param t
     */
    void update(T t);

    /**
     * 删除
     * @param id
     */
    void delete(Serializable id);

    /**
     * 根据id查找
     * @param id
     * @return
     */
    T findById(Serializable id);

    /**
     * 条件查询
     * @param hql
     * @param parmas
     * @return
     */
    List<T> getByCondition(String hql,Object... parmas);

    /**
     * 查询所有
     * @return
     */
    List<T> getAll();
}
