package com.lzq.service;

import java.io.Serializable;
import java.util.List;

/**
 * 服务层公用的业务方法
 * @param <T>
 */
public interface IBaseService<T> {

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
     * 查询所有
     * @return
     */
    List<T> getAll();
}
