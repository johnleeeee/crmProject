<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>ECSHOP 管理中心</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<jsp:include page="/WEB-INF/views/common.jsp"></jsp:include>

</head>
<body style="background: #278296;color:white">
<form method="post" action="${path }/login_login.action">
    <table cellspacing="0" cellpadding="0" style="margin-top:100px" align="center">
        <tr>
            <td>
                <img src="${path }/Images/login.png" width="178" height="256" style="margin-top:40px;" border="0" alt="ECSHOP" />
            </td>
            <td style="padding-left: 50px">
                <table>
                    <tr>
                        <td>登陆名：</td>
                        <td>
                            <input type="text" name="employee.name" value="lzq"/>
                        </td>
                    </tr>
                    <tr>
                        <td>登陆密码：</td>
                        <td>
                            <input type="password" name="employee.password" value="1234" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="right">
                            <img src="" />
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>
                            <input type="submit" value="进入管理中心" class="button" />
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</form>
</body>