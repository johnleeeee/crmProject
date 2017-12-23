package com.lzq.service.impl;

import com.lzq.dao.ITraceHistoryDao;
import com.lzq.pojo.TraceHistory;
import com.lzq.service.ITraceHistoryService;

import java.io.Serializable;
import java.util.List;

/**
 * 客户跟进
 * @author AdminTH
 *
 */
public class TraceHistoryService implements ITraceHistoryService {
	
	// 注入dao
	private ITraceHistoryDao traceHistoryDao;
	public void setTraceHistoryDao(ITraceHistoryDao traceHistoryDao) {
		this.traceHistoryDao = traceHistoryDao;
	}
	

	public void delete(Serializable id) {
		traceHistoryDao.delete(id);
	}

	public TraceHistory findById(Serializable id) {
		return traceHistoryDao.findById(id);
	}

	public List<TraceHistory> getAll() {
		List<TraceHistory> list = traceHistoryDao.getAll();
		return list;
	}

	public void save(TraceHistory t) {
		traceHistoryDao.save(t);
	}

	public void update(TraceHistory t) {
		traceHistoryDao.update(t);
	}
	

}







