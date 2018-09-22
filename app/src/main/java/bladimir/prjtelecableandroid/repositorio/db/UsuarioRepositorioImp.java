package bladimir.prjtelecableandroid.repositorio.db;

import android.view.View;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import bladimir.prjtelecableandroid.entidades.Usuario;
import bladimir.prjtelecableandroid.repositorio.UsuarioRepositorio;

public class UsuarioRepositorioImp implements UsuarioRepositorio {
    private static ConexionDB conexionDB;

//    public CategoriaRepositorioImp(View.OnClickListener context) {
//        conexiodb = new ConexionDb(context);
//    }

    @Override
    public boolean guardar(Usuario usuario) {


        try {
            conexionDB.statement().execute("SELECT & FROM usuario");


//            ResultSet resultSet = new ResultSet() {
//
//                ResultSet resultSet = conexionDB.stado.executeQuery("SELECT * FROM usuario");
//            while(resultSet.next())
//
//                {
//                    String s = resultSet.getString("nombre");
//                    Usuario usuario1 = null;
//                    usuario1.setNombre(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
//    } catch(SQLException e){
////                e.printStackTrace();
//                return false;
//            }
//
//            return true;
//
//
//    }

    @Override
    public boolean actualizar(Usuario usuario) {
        return false;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        conexionDB=new ConexionDB();
        conexionDB.connection();
        Statement statement = conexionDB.statement();
        try {

            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuario WHERE nombre='" + usuario.getNombre() + "'");
        } catch (SQLException e) {
            e.printStackTrace();
            usuario = null;
            return usuario;
        }

        return usuario;
    }

    @Override
    public List<Usuario> buscar() {
        return null;
    }
}
