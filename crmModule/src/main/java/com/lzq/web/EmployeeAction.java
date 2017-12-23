package com.lzq.web;

import com.lzq.pojo.Department;
import com.lzq.pojo.Employee;

import java.util.List;

public class EmployeeAction extends BaseAction{

    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * 添加员工界面
     * @return
     */
    public String viewEdit(){
        if(employee != null){
            employee = employeeService.findById(employee.getId());
        }
        //此处用到了departmentService
        List<Department> listDept = departmentService.getAll();
        request.put("listDept",listDept);
        return "viewEdit";
    }

    /**
     * 员工列表
     * @return
     */
    public String list(){
        List<Employee> listEmp = employeeService.getAll();
        listEmp.size();
        request.put("listEmp",listEmp);
        return "list";
    }

    /**
     * 添加员工
     * @return
     */
    public String save(){
        employeeService.save(employee);

        return list();
    }

    /**
     * 修改员工
     * @return
     */
    public String update(){
        employeeService.update(employee);
        return list();
    }
}
