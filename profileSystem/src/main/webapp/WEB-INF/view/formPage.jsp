<html>
    <head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
    </head>
    <body >
    <h1>User Registration</h1>

        <form action="formPage">
          <div class="form-group">
            <label for="exampleInputEmail1">First Name</label>
            <input type="text" class="form-control" name="firstName" >
          </div>
           <div class="form-group">
            <label for="exampleInputEmail1">Last Name</label>
            <input type="text" class="form-control" name="lastName" >
          </div>
           <div class="form-group">
            <label for="exampleInputEmail1">Date Of Birth</label>
            <input type="date" class="form-control" name="birthdate" >
          </div>
           <div class="form-group">
            <label for="exampleInputEmail1">City</label>
            <input type="text" class="form-control" name="city" >
          </div>
            <div class="form-group">
            <label for="exampleInputEmail1">E-mail</label>
            <input type="email" class="form-control" name="email" >
          </div>

          <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </body>
</html>

