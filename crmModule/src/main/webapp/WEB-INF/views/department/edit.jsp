 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 添加部门</title>
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
		var id = document.getElementById('department.id').value;
		if (id == ''){
			// 添加
			frm.action = "${path }/dept_save.action";
		} else {
			// 修改
			frm.action = "${path }/dept_update.action";
		}
		

		//3. 提交
		frm.submit();
	}
</script>
</head>
<body>
<h1>
    <span class="action-span"><a href="__GROUP__/Category/categoryList">添加部门</a></span>
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1"> - 添加部门 </span>
    <div style="clear:both"></div>
</h1>
<div class="main-div">
    <form action="${path }/dept_save.action" method="post">
    	
    	<!-- 隐藏域，保存id的值（编辑时候用） -->
    	<s:hidden name="department.id" id="department.id" value="%{department.id}"></s:hidden>
    
        <table width="100%" id="general-table">
            <tr>
                <td class="label">部门名称:</td>
                <td>
                    <s:textfield name="department.departmentName"></s:textfield>
                </td>
            </tr>
            <tr>
                <td class="label">部门负责人:</td>
                <td>
                	 <s:textfield name="department.manager"></s:textfield>
                </td>
            </tr>
            <tr>
                <td class="label">备注:</td>
                <td>
                    <s:textarea name="department.remark" cols="50" rows="8"></s:textarea>
                </td>
            </tr>
           
        </table>
        <div class="button-div">
            <input type="button" value=" 确定    " onclick="changeForm()" />
            <input type="reset" value="  重置 " />
        </div>
    </form>
</div>

<div id="footer">
共执行 3 个查询，用时 0.162348 秒，Gzip 已禁用，内存占用 2.266 MB<br />
版权所有 &copy; 2015-2018 阿呆网络科技有限公司，并保留所有权利。</div>

</body>
</html>








