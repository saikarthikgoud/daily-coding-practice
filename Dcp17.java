//jdbc lifecycle

import java.sql.*;

//connecting java and database

//public class Dcp17 {
//    public static void main(String[] args) throws Exception
//    {
//
//        String url = "jdbc:postgresql://localhost:5432/details";
//        String uname = "postgres";
//        String pass =  "6272";
//
//        //Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        con.close();
//
//    }
//}

















//jdbc CRUD operations


//for reading values

//public class Dcp17 {
//    public static void main(String[] args) throws Exception
//    {
//
//        String url = "jdbc:postgresql://localhost:5432/details";
//        String uname = "postgres";
//        String pass =  "6272";
//        //String sql = "select sname from student where sid = 1 ";
//        String sql = "select * from student";
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);
//
//
//
// //        rs.next();
// //        String name = rs.getString(columnLabel: "sname");
// //        System.out.println("Name of a student is " + name);
// //
//        while(rs.next())
//        {
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getInt(3));
//        }
//
//        con.close();
//
//    }
//}
















// //for creating
//public class Dcp17 {
//    public static void main(String[] args) throws Exception
//    {
//
//        String url = "jdbc:postgresql://localhost:5432/details";
//        String uname = "postgres";
//        String pass =  "6272";
//        //String sql = "insert into student values(6,'sri',82) ";
//        String sql = "insert into student values(7,'hari',78) ";
//
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        Statement st = con.createStatement();
//
//        st.execute(sql);
//        con.close();
//
//    }
//}



















// //for updating
//public class Dcp17 {
//    public static void main(String[] args) throws Exception
//    {
//
//        String url = "jdbc:postgresql://localhost:5432/details";
//        String uname = "postgres";
//        String pass =  "6272";
//        String sql = "update student set sname = 'hari krishna' where sid = 7 ";
//
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        Statement st = con.createStatement();
//
//        st.execute(sql);
//        con.close();
//
//    }
//}











// //for delection
//public class Dcp17 {
//    public static void main(String[] args) throws Exception
//    {
//
//        String url = "jdbc:postgresql://localhost:5432/details";
//        String uname = "postgres";
//        String pass =  "6272";
//        String sql = "delete from student where sid = 7 ";
//
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        Statement st = con.createStatement();
//
//        st.execute(sql);
//        con.close();
//
//    }
//}









 //problems with statements
//public class Dcp17 {
//    public static void main(String[] args) throws Exception
//    {
//
//
//        int sid = 7;
//        String sname = "sunny";
//        int smarks = 77;
//
//        String url = "jdbc:postgresql://localhost:5432/details";
//        String uname = "postgres";
//        String pass =  "6272";
//        String sql = "insert into student values (" + sid  + ",'"  + sname + " ',"  + smarks + ")";
//
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        Statement st = con.createStatement();
//
//        st.execute(sql);
//        con.close();
//
//    }
//}


















//prepared statements
public class Dcp17 {
    public static void main(String[] args) throws Exception
    {


        int sid = 8;
        String sname = "ashok";
        int smarks = 88;

        String url = "jdbc:postgresql://localhost:5432/details";
        String uname = "postgres";
        String pass =  "6272";
        String sql = "insert into student values (?,?,?)";


        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,smarks);

        st.execute();
        con.close();

    }
}
