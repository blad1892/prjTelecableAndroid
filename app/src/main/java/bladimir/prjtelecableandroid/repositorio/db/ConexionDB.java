package bladimir.prjtelecableandroid.repositorio.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
    private static Statement stado;
    private static Connection conn = null;

    public Connection connection() {

        try {
//            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//            StrictMode.setThreadPolicy(policy);

//          Declarando el drive de conexion como en cualquier proyecto java
            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://localhost:3306/telecabledb";
            String user = "root";
            String pasword = "Bl2331";

            conn = DriverManager.getConnection(url, user, pasword);
            stado = conn.createStatement();

        } catch (Exception e) {

        }
        return conn;
    }

    public Connection cerrar() throws SQLException {
        if (stado.getConnection().isReadOnly()) {
            conn.close();
            stado.close();
        }
        return conn;
    }

    public Statement statement() {
//        try {
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return stado;
    }


}
