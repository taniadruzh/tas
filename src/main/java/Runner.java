

import DomenObject.Student;
import ServiceStudent.CreateStudents;

import java.sql.*;
import java.util.ArrayList;


public class Runner {
    private static Connection connection;

    public static void main(String[] args) throws SQLException {
        //createConnection();
        createTablePeople();
         CreateStudents createPeople = new CreateStudents();
//        insertPeopleToTable(createPeople.getPeopleArrayList());
//        printPeopleTable();
//        selectUniqueAdressFromPeopleTable();
        //countPeopleWithSameAge();


    }



    private static void countPeopleWithSameAge() throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT age, COUNT (age) FROM people GROUP BY age");
        ResultSet rs = ps.executeQuery();
        System.out.println("Count ages: ");
        while (rs.next()){
            System.out.println( rs.getString(1)+" - "+rs.getInt(2));
        }
    }

    private static void selectUniqueAdressFromPeopleTable() throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT adress FROM people GROUP BY adress HAVING COUNT (*)=1");
        ResultSet rs = ps.executeQuery();
        System.out.println("Unique adresses: ");
        while (rs.next()){
            System.out.print( rs.getString(1)+", ");
        }
    }

    private static void insertPeopleToTable(ArrayList<Student> peopleArrayList) throws SQLException {

        PreparedStatement ps2 = connection.prepareStatement("INSERT INTO people (name) VALUES (?);");
        for (Student people : peopleArrayList) {
            ps2.setString(1, people.getName());
            ps2.executeUpdate();
        }
    }

    private static void printPeopleTable() throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM student");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("name: " + rs.getString(1) );
        }
    }

    private static void createTablePeople() throws SQLException {
        PreparedStatement ps2 = connection.prepareStatement("CREATE TABLE IF NOT EXISTS student \n" +
                "(\n" +
                "    name varchar(30),\n" +
                ");");
        System.out.println("Table is created.");
    }

    private static Connection createConnection() {

        connection = null;
        System.out.println("-------- PostgreSQL JDBC Connection Testing ------------");
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/student1", "postgres",
                    "qwerty");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? Include in your library path!");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        System.out.println("PostgreSQL JDBC Driver Registered!");
        return connection;
    }


}