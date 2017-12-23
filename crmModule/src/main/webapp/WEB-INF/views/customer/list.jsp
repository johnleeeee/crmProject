<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>ECSHOP 管理中心 - 客户资料列表 </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<jsp:include page="/WEB-INF/views/common.jsp"></jsp:include>


</head>
<body>
<h1>
    <span class="action-span"><a href="${path }/customer_viewEdit.action">添加新客户资料</a></span>
    <span class="action-span1"><a href="__GROUP__">CRM</a></span>
    <span id="search_id" class="action-span1"> - 客户资料列表 </span>
    <div style="clear:both"></div>
</h1>
<div class="form-div">
    <form action="" name="searchForm">
        <img src="${path }/Images/icon_search.gif" width="26" height="22" border="0" alt="search" />
        <!-- 关键字 -->
        关键字 <input type="text" name="keyword" size="15" />
        <input type="submit" value=" 搜索 " class="button" />
    </form>
</div>

<!-- 客户资料列表 -->
<form method="post" action="" name="listForm" onsubmit="">
    <div class="list-div" id="listDiv">
        <table cellpadding="3" cellspacing="1">
            <tr>
                <th>编号</th>
                <th>客户名称</th>
                <th>性别</th>
                <th>生日</th>
                <th>客户电话</th>
                <th>Email</th>
                <th>状态</th>
                <th>操作</th>
            </tr>
            <!-- 先判断，再迭代 -->
            <s:if test="#request.listCustomer != null">
            	<s:iterator var="customer" value="#request.listCustomer">
            		 <tr>
		                <td align="center"><s:property value="#customer.id"/></td>
		                <td align="center"><s:property value="#customer.name"/></td>
		                <td align="center">
		                	<s:if test="#customer.sex">男</s:if>
		                	<s:else>女</s:else>
		                 </td>
		                <td align="center">
		                	<s:date name="#customer.birth" format="yyyy-MM-dd" />
		                </td>
		                <td align="center"><s:property value="#customer.tel"/></td>
		                <td align="center"><s:property value="#customer.email"/></td>
		                <td align="center">
		                	<s:if test="#customer.status==0">
		                		<font color="red">作废</font>
		                	</s:if>
		                	<s:else>
		                		<font color="green">正常</font>
		                	</s:else>
		                		
		                </td>
		                
		                <td align="center">
			                <a href="#" target="_blank" title="查看"><img src="./Images/icon_view.gif" width="16" height="16" border="0" /></a>
			                <a href='${path }/customer_viewEdit.action?customer.id=<s:property value="#customer.id"/>' title="编辑"><img src="./Images/icon_edit.gif" width="16" height="16" border="0" /></a>
			               
							<s:a href="customer_updateStatus.action?customer.id=%{#customer.id}&customer.status=0" title="作废">
								<img src="./Images/icon_trash.gif" width="16" height="16" border="0" />
							</s:a>
							<s:a href="traceHistory_viewEdit.action?customer.id=%{#customer.id}">跟进</s:a>
							<s:a href="transferHistory_viewEdit.action?customer.id=%{#customer.id}">移交</s:a>
		               </td>
		            </tr>
            	</s:iterator>
            </s:if>
            <s:else>
            	<tr>
            		<td colspan="8">还没有数据录入，请先录入！</td>
            	</tr>
            </s:else>
            
           
        </table>

   		 <!-- 分页开始 
        <table id="page-table" cellspacing="0">
            <tr>
                <td width="80%">&nbsp;</td>
                <td align="center" nowrap="true">
                    <{$showPage}>
                </td>
            </tr>
        </table>
        -->
    <!-- 分页结束 -->
    </div>
</form>

<div id="footer">
共执行 7 个查询，用时 0.028849 秒，Gzip 已禁用，内存占用 3.219 MB<br />
版权所有 &copy; 2015-2018 阿呆网络科技有限公司，并保留所有权利。</div>
</body>
</html>