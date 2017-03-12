<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/11
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
    <link rel="stylesheet" href="/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/dist/css/style.css">
    <script src="/dist/js/angular.min.js"></script>
    <script src="/dist/js/jquery-2.0.0.min.js"></script>
    <script>
        <%--var app = angular.module("demoApp",[]);--%>
        <%--app.controller("person",function ($scope) {--%>
           <%--$scope.checkPageNo = function () {--%>
               <%--//校验输入的页面--%>
               <%--$scope.pageNo = $scope.pageNo<=0?1:$scope.pageNo;--%>
               <%--$scope.pageNo = $scope.pageNo>=${pagetion.totalPage}?${pagetion.totalPage}:$scope.pageNo;--%>
           <%--}--%>
        <%--});--%>
        $(function () {
            $("#pageNo").change(function () {
                $("#pageNo").val( $("#pageNo").val()<=0?1:$("#pageNo").val() );
                $("#pageNo").val( $("#pageNo").val()>${pagetion.totalPage}?${pagetion.totalPage}:$("#pageNo").val() );
            });
        })
    </script>
</head>
<body ng-app="demoApp" ng-controller="person">

<div class="container">
    <h2>人员列表</h2>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>Job</th>
            <th>Operate</th>
        </tr>
        <c:forEach items="${pagetion.list}" var="person">
            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.age}</td>
                <td>${person.gender}</td>
                <td>${person.job}</td>
                <td>
                    <button type="button" class="btn btn-default">
                        <span class="glyphicon glyphicon-pencil"></span>Edit
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div class="page pb15" style="float: right">
            <span class="r inb_a page_b">
                <c:forEach items="${pagetion.pageView }" var="page">
                    ${page}
                </c:forEach>
            </span>
    </div>
</div>
</body>
</html>
