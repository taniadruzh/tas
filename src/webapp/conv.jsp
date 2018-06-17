<%@ page import="ServiceStudent.CreateStudents" %>
<%@ page import="DomenObject.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Students List-><br/> <table border = "2">
    <tr>
        <td>Name</td>
        <td>SerName</td>
        <td>Sex</td>
        <td>Phone</td>
    </tr>
    <%  CreateStudents createPeople = new CreateStudents();
ArrayList<Student>  students = createPeople.getStudentsArrayList();
   // students.forEach(x -> System.out.println(x));
//    Iterator<Student> st  = students.iterator();

    for (int i = 0; i < students.size(); i++) {
        out.print("<tr>");
        out.print("<td>" + students.get(i).getName() + "</td>");
        out.print("<td>" + students.get(i).getSername() + "</td>");
        out.print("<td>" + students.get(i).getSex() + "</td>");
        out.print("<td>" + students.get(i).getPhone() + "</td>");
        out.print("</tr>");
    }

%>

</table>
<form action="conv.jsp">

    <input type="radio" name="chooseSex" value="m"> Male
    <input type="radio" name="chooseSex" value="f"> Female
    <input type="submit" value="Submit"/></form>


<%  students = createPeople.getStudentsArrayListBySex(request.getParameter("chooseSex"));
   // students.forEach(x -> System.out.println(x));
//    Iterator<Student> st  = students.iterator();
    boolean showFlag = true;
    for (int i = 0; i < students.size(); i++) {
        if (showFlag) {
            out.print("Students List-><br/> <table border = "+"2"+">\n"+
                        "<tr>\n"+
                            "<td>Name</td>\n"+
                            "<td>SerName</td>\n"+
                            "<td>Sex</td>\n"+
                            "<td>Phone</td>\n"+
                        "</tr>");
            showFlag = false;
        }
        out.print("<tr>");
        out.print("<td>" + students.get(i).getName() + "</td>");
        out.print("<td>" + students.get(i).getSername() + "</td>");
        out.print("<td>" + students.get(i).getSex() + "</td>");
        out.print("<td>" + students.get(i).getPhone() + "</td>");
        out.print("</tr>");
        if (i == students.size()-1){
            out.print("</table>");
        }
    }

%>


</body>
</html>
