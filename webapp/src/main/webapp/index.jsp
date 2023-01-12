<!DOCTYPE html>
<html>
<head>
<title>Employee Details</title>
</head>
<body >
    <h3>Fill Employee Details</h3>
  
    <form action="createNewEmp" method="post">
        <table>
  
            <tr>
                <td>Emp Id:</td>
                <td><input type="text" name="id" /></td>
            </tr>
            <tr>
                <td>Emp Name:</td>
                <td><input type="text" name="name" /></td>
            </tr>
           
        </table>
  
        <input type="submit" value="Create Employee">
  
    </form>
    <form action="deleteEmployee" method="post">
        <table>
            <tr>
                <td>Emp Id:</td>
                <td><input type="text" name="id" /></td>
            </tr>
        </table>
        <input type="submit" value="delete Employee">
  
    </form>
    
    <form action="updateEmp" method="post">
        <table>
            <tr>
                <td>Emp Id:</td>
                <td><input type="text" name="id" /></td>
            </tr>
            <tr>
                <td>Emp Name:</td>
                <td><input type="text" name="name" /></td>
            </tr>
        </table>
        <input type="submit" value="update Employee">
  
    </form>
    
      <form action="getEmp" method="get">
        <table>
            <tr>
                <td>Emp Id:</td>
                <td><input type="text" name="id" /></td>
            </tr>
          </table>
        <input type="submit" value="Get Employee">
  
    </form>
  
    
  
</body>
</html>