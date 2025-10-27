<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User Form</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    <style>
        body {
            background-color: #f8f9fa;
        }
        .form-container {
            max-width: 450px;
            margin: 60px auto;
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.1);
            padding: 30px 35px;
        }
        h2 {
            text-align: center;
            color: #343a40;
            margin-bottom: 25px;
        }
        .btn-custom {
            background-color: #dc3545;
            color: white;
            font-weight: 500;
            width: 100%;
            border-radius: 6px;
        }
        .btn-custom:hover {
            background-color: #c82333;
        }
        .form-check-label {
            margin-right: 15px;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2>User Form</h2>

    <form:form action="userForm" modelAttribute="userDataModel">

        <!-- Name -->
        <div class="form-group">
            <form:input path="name" type="text" placeholder="Username" cssClass="form-control"/>
        </div>

        <!-- Password -->
        <div class="form-group">
            <form:password path="password" placeholder="Password" cssClass="form-control"/>
        </div>

        <!-- Country -->
        <div class="form-group">
            <form:select path="country" cssClass="form-control">
                <form:option value="" label="Select Country"/>
                <form:option value="egypt" label="Egypt"/>
                <form:option value="brazil" label="Brazil"/>
                <form:option value="saudia" label="Saudi Arabia"/>
            </form:select>
        </div>

        <!-- Programming Language -->
        <div class="form-group">
            <label class="font-weight-bold d-block">Preferred Programming Language</label>
            <div>
                <label class="form-check-label">
                    <form:radiobutton path="programmingLan" value="Java" cssClass="mr-1"/> Java
                </label>
                <label class="form-check-label">
                    <form:radiobutton path="programmingLan" value="C#" cssClass="mr-1"/> C#
                </label>
                <label class="form-check-label">
                    <form:radiobutton path="programmingLan" value="PHP" cssClass="mr-1"/> PHP
                </label>
                <label class="form-check-label">
                    <form:radiobutton path="programmingLan" value="Ruby" cssClass="mr-1"/> Ruby
                </label>
            </div>
        </div>

        <!-- Operating System -->
        <div class="form-group">
            <label class="font-weight-bold d-block">Preferred Operating System</label>
            <div>
                <label class="form-check-label">
                    <form:checkbox path="os" value="linux" cssClass="mr-1"/> Linux
                </label>
                <label class="form-check-label">
                    <form:checkbox path="os" value="mac" cssClass="mr-1"/> Mac OS
                </label>
                <label class="form-check-label">
                    <form:checkbox path="os" value="windows" cssClass="mr-1"/> MS Windows
                </label>
            </div>
        </div>

        <!-- Submit Button -->
        <div class="form-group mb-0">
            <button type="submit" class="btn btn-custom">Submit</button>
        </div>

    </form:form>
</div>

<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

</body>
</html>
