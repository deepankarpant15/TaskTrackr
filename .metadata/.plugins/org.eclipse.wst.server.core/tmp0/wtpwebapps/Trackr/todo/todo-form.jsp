<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/styles/custom.css"> <!-- Example for external styles -->
</head>

<body>
<header>
    <nav class="navbar navbar-expand-md navbar-dark custom-navbar"> <!-- Moved styles to class -->
        <div>
            <a href="" class="navbar-brand">Todo App</a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Todos</a></li>
        </ul>

        <ul class="navbar-nav navbar-collapse justify-content-end">
            <li><a href="<%=request.getContextPath()%>/logout" class="nav-link">Logout</a></li>
        </ul>
    </nav>
</header>

<div class="container col-md-5">
    <div class="card">
        <div class="card-body">
            <!-- Form based on whether 'todo' object exists -->
            <c:if test="${todo != null}">
                <form action="update" method="post">
            </c:if>
            <c:if test="${todo == null}">
                <form action="insert" method="post">
            </c:if>

            <!-- Form Title -->
            <div>
                <h2>
                    <c:if test="${todo != null}">Edit Todo</c:if>
                    <c:if test="${todo == null}">Add New Todo</c:if>
                </h2>
            </div>

            <!-- Hidden ID Field -->
            <c:if test="${todo != null}">
                <input type="hidden" name="id" value="<c:out value='${todo.id}' />" />
            </c:if>
            
             <!-- Hidden Username Field -->
          <input type="hidden" name="username" value="<%= session.getAttribute("user") %>" />

            <!-- Title Input -->
            <fieldset class="form-group">
                <label for="title">Todo Title</label>
                <input type="text" id="title" 
                       value="<c:out value='${todo.title != null ? todo.title : ""}' />" 
                       class="form-control" name="title" required="required" minlength="5">
            </fieldset>

            <!-- Description Input -->
            <fieldset class="form-group">
                <label for="description">Todo Description</label>
                <input type="text" id="description"
                       value="<c:out value='${todo.description != null ? todo.description : ""}' />" 
                       class="form-control" name="description" minlength="5">
            </fieldset>

            <!-- Status Dropdown -->
            <fieldset class="form-group">
                <label for="isDone">Todo Status</label>
                <select id="isDone" class="form-control" name="isDone">
                    <option value="false" ${!todo.status ? 'selected' : ''}>In Progress</option>
                    <option value="true" ${todo.status ? 'selected' : ''}>Complete</option>
                </select>
            </fieldset>

            <!-- Target Date Input -->
            <fieldset class="form-group">
                <label for="targetDate">Todo Target Date</label>
                <input type="date" id="targetDate"
                       value="<c:out value='${todo.targetDate != null ? todo.targetDate : ""}' />" 
                       class="form-control" name="targetDate" required="required">
            </fieldset>

            <!-- Submit Button -->
            <button type="submit" class="btn btn-success">Save</button>
            </form>
        </div>
    </div>
</div>

<jsp:include page="../common/footer.jsp"></jsp:include> <!-- Footer inclusion -->
</body>
</html>
