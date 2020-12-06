
<%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
   <head>
      <title>Login</title>
   </head>
   
   <body>
   
   <h1>Login</h1>
   <h4>to test functionalities(database implemented) username : abby, password : 123</h4>
      <form action = "login" method = "post">
         Username: <br/><input type = "text" name = "username"/><br/>
         Password: <br /> <input type = "password" name = "password"/><br/>
         <br />
         <input type = "submit" value = "Login"/>		
      </form>
   </body>
</html>