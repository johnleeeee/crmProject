<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>ECSHOP 管理中心 - 客户移交列表 </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<jsp:include page="/WEB-INF/views/common.jsp"></jsp:include>


</head>
<body>
<h1>
    <span class="action-span"><a href="${path }/customer_viewEdit.action">添加新客户移交</a></span>
    <span class="action-span1"><a href="__GROUP__">CRM</a></span>
    <span id="search_id" class="action-span1"> - 客户移交列表 </span>
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

<!-- 客户移交列表 -->
<form method="post" action="" name="listForm" onsubmit="">
    <div class="list-div" id="listDiv">
        <table cellpadding="3" cellspacing="1">
            <tr>
                <th>编号</th>
                <th>移交客户</th>
                <th>旧营销人员 </th>
                <th>新营销人员 </th>
                <th>移交时间</th>
                <th>移交原因</th>
                <th>查看</th>
            </tr>
            <!-- 先判断，再迭代 -->
            <s:if test="#request.listTransferHistory != null">
            	<s:iterator value="#request.listTransferHistory">
            		 <tr>
		                <td align="center"><s:property value="id"/></td>
		                <td align="center"><s:property value="customer.name"/></td>
		                <td align="center">
		                	 <s:property value="oddSeller.name"/>
		                 </td>
		                <td align="center">
		                	 <s:property value="newSeller.name"/>
		                 </td>
		                <td align="center">
		                	<s:date name="transferTime" format="yyyy-MM-dd" />
		                </td>
		                <td align="center">
		                	<s:property value="reason"/>
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