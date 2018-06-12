<%@ page import="ServiceStudent.CreateStudents" %>
<%@ page import="DomenObject.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Test my method -><br/> <%  CreateStudents createPeople = new CreateStudents();
ArrayList<Student>  students = createPeople.getStudentsArrayList();
   // students.forEach(x -> System.out.println(x));
//    Iterator<Student> st  = students.iterator();
    for (int i = 0; i < students.size(); i++) {
        out.print(students.get(i) + "<br/>");

    }
%>
</body>
</html>
