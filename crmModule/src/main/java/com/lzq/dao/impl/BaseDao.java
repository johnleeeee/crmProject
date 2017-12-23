package com.lzq.dao.impl;

import com.lzq.dao.IBaseDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T> {

    //当前操作类
    private Class<T> clazz;
    public BaseDao(){
        //当前类的直接超类的type
        Type type = this.getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        //获取参数化类型中的实际类型的定义
        Type[] ts = pt.getActualTypeArguments();
        this.clazz = (Class<T>) ts[0];
    }
    public void save(T t) {
        getHibernateTemplate().save(t);
    }

    public void update(T t) {
        getHibernateTemplate().update(t);
    }

    public void delete(Serializable id) {
        T byId = findById(id);
        if(byId!=null){
            getHibernateTemplate().delete(byId);
        }
    }

    public T findById(Serializable id) {

        return getHibernateTemplate().get(clazz,id);
    }

    public List<T> getByCondition(String sql,Object... parmas){
        return (List<T>) getHibernateTemplate().find(sql,parmas);
    }

    public List<T> getAll() {
        return getHibernateTemplate().loadAll(clazz);
    }
}
