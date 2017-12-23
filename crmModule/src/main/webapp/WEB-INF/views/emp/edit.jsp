<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 添加员工</title>
<meta name="robots" content="noindex, nofollow" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<!-- 引入公用页面 -->
<jsp:include page="/WEB-INF/views/common.jsp"></jsp:include>
<script language="javascript">
	// 修改表表单提交地址
	function changeForm(){
		//1. 获取表单对象
		var frm = document.forms[0];

		//2. 修改表单对象的action属性
		// 判断： 添加、修改!  (如果id的值为''说明是添加, 否则是修改)
		var id = document.getElementById('employee.id').value;
		if (id == ''){
			// 添加
			frm.action = "${path }/emp_save.action";
		} else {
			// 修改
			frm.action = "${path }/emp_update.action";
		}
		//3. 提交
		frm.submit();
	}
</script>
</head>
<body>
<h1>
    <span class="action-span"><a href="__GROUP__/Category/categoryList">添加员工</a></span>
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1"> - 添加员工 </span>
    <div style="clear:both"></div>
</h1>
<div class="main-div">
    <form action="${path }/dept_save.action" method="post">
    	
    	<!-- 隐藏域，保存id的值（编辑时候用） -->
    	<s:hidden name="employee.id" id="employee.id" value="%{employee.id}"></s:hidden>
    
        <table width="100%" id="general-table">
            <tr>
                <td class="label">员工名称:</td>
                <td>
                    <s:textfield name="employee.name"></s:textfield>
                </td>
            </tr>
            <tr>
                <td class="label">真实姓名:</td>
                <td>
                	 <s:textfield name="employee.trueName"></s:textfield>
                </td>
            </tr>
            <tr>
            	<td class="label">部门</td>
            	<td>
            		<!-- 
            			部门下拉列表
            			<select name="">
            				<option value="-1">请选择</option>
            				<option value="1">编程</option>
            			</select>
            			
            			name  空间名称
            			headerKey  默认选项的实际的值
            			headerValue  默认选项的显示的值
            			list  下拉列表取值集合
            			listKey  对象的哪个属性作为实际的值
            			listValue  对象的哪个属性作为显示的值
            		 -->
            		<s:select 
            			name="employee.department.id"
            			headerKey="-1"
            			headerValue="请选择"
            			list="#request.listDept"
            			listKey="id"
            			listValue="departmentName"
            		></s:select>
            	</td>
            </tr>
             <tr>
                <td class="label">密码:</td>
                <td>
                	 <s:password name="employee.password" showPassword="true"></s:password>
                </td>
            </tr>
             <tr>
                <td class="label">电话:</td>
                <td>
                	 <s:textfield name="employee.tel"></s:textfield>
                </td>
            </tr>
             <tr>
                <td class="label">邮箱:</td>
                <td>
                	 <s:textfield name="employee.email"></s:textfield>
                </td>
            </tr>
           
        </table>
        <div class="button-div">
            <input type="button" value=" 确定    " onclick="changeForm()" />
            <input type="reset" value="  重置 " />
        </div>
        
        <!-- 
        	对象里的其他数据，没有显示出来的，要用隐藏域保存，否则更改的时候会数据丢失！
         -->
    </form>
</div>

<div id="footer">
共执行 3 个查询，用时 0.162348 秒，Gzip 已禁用，内存占用 2.266 MB<br />
版权所有 &copy; 2015-2018 阿呆网络科技有限公司，并保留所有权利。</div>

</body>
</html>








