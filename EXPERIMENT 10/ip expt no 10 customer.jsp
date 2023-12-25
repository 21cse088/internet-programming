<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="ex10pack.customer2"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ex No 10</title>
       
    </head>
    <body>
        <%
         
            customer2 st=new customer2("John Doe","john.doe@example.com",12457888,"123 Main St.");
            customer2 st1=new customer2("Jane Smith","jane.smith@example.com",234568901,"456 Oak Ave");
          
           
            ArrayList<customer2> obj=new ArrayList<customer2>();
            obj.add(st);
            obj.add(st1);
           

pageContext.setAttribute("obj", obj);
        %>
        <table border="2px"><tr><th>Name</th><th>email</th><th>phone number</th><th>address</th></tr>
        <c:forEach items="${pageScope.obj}" var="i">
           
                <tr> <td>${i.getName()}</td>
                    <td>${i.getemail()}</td>
                    <td>${i.getphone()}</td>
                    <td>${i.getaddress()}</td>
                </tr>
        </c:forEach>  
        </table>
       </table>
    </body>
</html>
