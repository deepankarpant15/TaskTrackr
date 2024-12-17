<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>

<body>
<header>
    <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato;">
        <div>
            <a href="#" class="navbar-brand">Todo App</a>
        </div>
        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Todos</a></li>
        </ul>
        <ul class="navbar-nav navbar-collapse justify-content-end">
            <li><a href="<%=request.getContextPath()%>/logout" class="nav-link">Logout</a></li>
        </ul>
    </nav>
</header>

<div class="container">
    <h3 class="text-center">List of Todos</h3>
    <hr>
    <div class="text-left mb-3">
        <a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add Todo</a>
    </div>

    <table class="table table-bordered">
        <thead>
            <tr>
                <th>Title</th>
                <th>Target Date</th>
                <th>Todo Status</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <!-- Loop through the list of todos -->
            <c:forEach var="todo" items="${listTodo}">
                <tr>
                    <td><c:out value="${todo.title}" /></td>
                    <td><c:out value="${todo.targetDate}" /></td>
                    <td><c:out value="${todo.status}" /></td>
                    <td>
                        <!-- Edit and Delete actions -->
                        <a href="<%=request.getContextPath()%>/edit?id=<c:out value='${todo.id}' />" class="btn btn-primary">Edit</a>
                        <a href="<%=request.getContextPath()%>/delete?id=<c:out value='${todo.id}' />" class="btn btn-danger">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<div class="container">
    <a href="<%=request.getContextPath()%>/fetch-tasks" class="btn btn-primary">View Calendar</a>

</div>

<jsp:include page="../common/footer.jsp"></jsp:include>

</body>
</html>
