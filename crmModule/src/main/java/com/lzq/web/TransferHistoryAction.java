package com.lzq.web;

import com.lzq.pojo.Customer;
import com.lzq.pojo.Employee;
import com.lzq.pojo.TransferHistory;
import com.lzq.utils.UserContext;

import java.util.List;

/**
 * 客户跟进历史，控制层
 * @author AdminTH
 *
 */
public class TransferHistoryAction extends BaseAction{
	
	// 移交对象
	private TransferHistory transferHistory;
	public void setTransferHistory(TransferHistory transferHistory) {
		this.transferHistory = transferHistory;
	}
	public TransferHistory getTransferHistory() {
		return transferHistory;
	}
	
	
	// 客户对象
	private Customer customer;
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	

	/**
	 * 1. 进入客户移交修改页面
	 */
	public String viewEdit(){
		// 主键查询客户对象
		if (customer != null){
			customer = customerService.findById(customer.getId());
		}
		
		// 查询所有的营销人员(jsp页面用户选择)
		List<Employee> list = employeeService.getAll();
		request.put("listEmployee", list);
		return "edit";
	}
	
	/**
	 * 2. 保存客户移交记录
	 * @return
	 */
	public String save(){
		// 移交的客户
		transferHistory.setCustomer(customer);
		// 旧营销人员(当前登陆用户)
		transferHistory.setOddSeller(UserContext.get());
		// 保存移交记录
		transferHistoryService.save(transferHistory);
		return "save";
	}
	
	/**
	 * 3. 列表展示
	 */
	public String list(){
		// 查询移交记录
		List<TransferHistory> listTransferHistory = transferHistoryService.getAll();
		request.put("listTransferHistory", listTransferHistory);
		return "list";
	}
}












