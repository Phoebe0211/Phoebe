<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/28 0028
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="js/jquery.validate.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#form").validate({
                rules: {
                    username: {required: true, minlength: 4}
                },
                messages:{username: "invalid"}
            })
        })
//        $().ready(function () {
//            $("#form").validate({
//                rules:{
//                    username:{
//                        required: true,
//                        minlength:4
//                    }
//                },
//                messages:{
//                    username:"必填，最小长度4"
//                }
//            })
//        })
    </script>
</head>
<body>
    <form action="user_update.action" id="form">
        UserID: ${user.userid}<input type="hidden" name="user.userid" value="${user.userid} "><br />
        Username: <input type="text" name="username" value="${user.username}" /> <br />
        Password: <input type="text" name="user.password" value="${user.password}" /> <br />
        <input type="submit" value="Save">
    </form>

</body>
</html>
