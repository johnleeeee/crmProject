package com.lzq.service.impl;

import com.lzq.dao.ITransferHistoryDao;
import com.lzq.pojo.TransferHistory;
import com.lzq.service.ITransferHistoryService;

import java.io.Serializable;
import java.util.List;

/**
 * 客户移交
 */
public class TransferHistoryService implements ITransferHistoryService {
	
	// 注入dao
	private ITransferHistoryDao transferHistoryDao;
	public void setTransferHistoryDao(ITransferHistoryDao transferHistoryDao) {
		this.transferHistoryDao = transferHistoryDao;
	}
	

	public void delete(Serializable id) {
		transferHistoryDao.delete(id);
	}

	public TransferHistory findById(Serializable id) {
		return transferHistoryDao.findById(id);
	}

	public List<TransferHistory> getAll() {
		List<TransferHistory> list = transferHistoryDao.getAll();
		return list;
	}

	public void save(TransferHistory t) {
		transferHistoryDao.save(t);
	}

	public void update(TransferHistory t) {
		transferHistoryDao.update(t);
	}
	

}







