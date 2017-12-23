<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>ECSHOP 管理中心 - 客户跟进列表 </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<jsp:include page="/WEB-INF/views/common.jsp"></jsp:include>


</head>
<body>
<h1>
    <span class="action-span"><a href="${path }/traceHistory_viewEdit.action">添加新客户跟进</a></span>
    <span class="action-span1"><a href="__GROUP__">CRM</a></span>
    <span id="search_id" class="action-span1"> - 客户跟进列表 </span>
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

<!-- 客户跟进列表 -->
<form method="post" action="" name="listForm" onsubmit="">
    <div class="list-div" id="listDiv">
        <table cellpadding="3" cellspacing="1">
            <tr>
                <th>编号</th>
                <th>跟进客户</th>
                <th>跟进员工</th>
                <th>跟进时间</th>
                <th>跟进方式</th>
                <th>跟进效果</th>
                <th>跟进内容</th>
                <th>查看</th>
            </tr>
            <!-- 先判断，再迭代 -->
            <!-- 
            	迭代标签，
            		1. 会把迭代的每一个元素放到map中，所以取值可以用#temp
            		2. 迭代的元素同时会放入栈顶，当前迭代接收，就从栈顶移除该元素 
             -->
            <s:if test="#request.listTraceHistory != null">
            	<s:iterator value="#request.listTraceHistory">
            		 <tr>
		                <td align="center"><s:property value="id"/></td>
		                <td align="center"><s:property value="customer.name"/></td>
		                <td align="center">
		                	 <s:property value="employee.name"/>
		                 </td>
		                <td align="center">
		                	<s:date name="traceTime" format="yyyy-MM-dd" />
		                </td>
		                <td align="center">
		                	<s:property value="traceMethod"/>
		                </td>
		                <td align="center">
		                	<s:if test="traceResult==1">优</s:if>
		                	<s:elseif test="traceResult==2">良</s:elseif>
		                	<s:else>差</s:else>
		                </td>
		                <td align="center">
		                	<s:property value="content"/>
		                </td>
		                
		                <td align="center">
			                <a href="#" target="_blank" title="查看"><img src="./Images/icon_view.gif" width="16" height="16" border="0" /></a>
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