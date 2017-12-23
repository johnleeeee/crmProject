<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 客户移交</title>
<meta name="robots" content="noindex, nofollow" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<!-- 引入公用页面 -->
<jsp:include page="/WEB-INF/views/common.jsp"></jsp:include>
</head>
<body>
<h1>
    <span class="action-span"><a href="__GROUP__/Category/categoryList">客户移交</a></span>
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1"> - 客户移交 </span>
</h1>
<div class="main-div">
    <form action="${path }/transferHistory_save.action" method="post">
    	
        <table width="100%" id="general-table">
            <tr>
                <td class="label">客户名称:</td>
                <td>
                    <s:property value="customer.name"/>
                    <s:hidden name="customer.id"></s:hidden>
                </td>
            </tr>
            <tr>
                <td class="label">旧营销人员:</td>
                <td>               
                	<!-- 营销人员，为当前登陆用； 从session中获取 -->
                	<s:property value="#session.user_info.name"/>
                </td>
            </tr>
            <tr>
            	<td class="label">新营销人员</td>
            	<td>
            		<s:select 
            			name="transferHistory.newSeller.id"
            			list="#request.listEmployee"
            			headerKey="-1"
            			headerValue="请选择"
            			listKey="id"
            			listValue="name"
            		></s:select>
            	</td>
            </tr>
             
             <tr>
                <td class="label">移交时间:</td>
                <td>
                	 <s:textfield name="transferHistory.transferTime"></s:textfield>
                </td>
            </tr>
            
              <tr>
                <td class="label">移交原因:</td>
                <td>
                	<s:textarea name="transferHistory.reason" cols="30" rows="6"></s:textarea>
                </td>
            </tr>
            
           
        </table>
        <div class="button-div">
            <input type="submit" value=" 移交    " />
        </div>
    </form>
</div>

<div id="footer">
共执行 3 个查询，用时 0.162348 秒，Gzip 已禁用，内存占用 2.266 MB<br />
版权所有 &copy; 2015-2018 阿呆网络科技有限公司，并保留所有权利。</div>

</body>
</html>








