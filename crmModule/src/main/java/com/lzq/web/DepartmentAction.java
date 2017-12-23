package com.lzq.web;

import com.lzq.pojo.Department;

import java.util.List;

/*
 * 1. 列表展示
 * 3. 进入添加页面
 * 2. 添加部门
 * 4. 修改
 * 5. 删除
 * 
 * ctrl + shift + R  查看项目的代码
 * ctrl + shift + T  查看jar包的源码
 */
public class DepartmentAction extends BaseAction{
	
	// 接收请求参数
	private Department department;  // add  null
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Department getDepartment() {
		return department;
	}

	// 1. 列表展示
	public String list(){
		// 1.1 查询所有部门信息
		List<Department> list = departmentService.getAll();
		// 1.2 保存到表示request域的map中
		request.put("listDepartment", list);
		return "list";
	}
	
	// 2. 添加部门
	public String save(){
		// 保存
		departmentService.save(department);
		// 保存成功,跳转到列表
		return list();
	}
	
	
	// 3. 进入添加页面
	public String viewEdit() {
		// 如果是进入修改页面，需要根据主键查询
		if (department != null  && department.getId() > 0) {
			// 主键查询值，查询到的结果放入值栈的根元素中； struts标签就会自动回显数据
			this.department = departmentService.findById(department.getId());
		}
		return "viewEdit";
	}
	
	// 4. 修改
	public String update() {
		departmentService.update(department);
		return list();  // 修改后，重新查询，再跳转到列表
	}
	// 5. 删除
	public String delete() {
		departmentService.delete(department.getId());
		return list();  // 删除后，重新查询，再跳转到列表
	}
}








