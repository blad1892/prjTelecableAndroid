package bladimir.prjtelecableandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import bladimir.prjtelecableandroid.entidades.Usuario;
import bladimir.prjtelecableandroid.repositorio.UsuarioRepositorio;
import bladimir.prjtelecableandroid.repositorio.db.ConexionDB;
import bladimir.prjtelecableandroid.repositorio.db.UsuarioRepositorioImp;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    private static EditText txtUsuario, txtClave;
    private static Button btnIniciar;
    ConexionDB conexionDB;
    private static Usuario usuario;
    private static UsuarioRepositorio usuarioRepositorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtClave = (EditText) findViewById(R.id.txtClave);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);


        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                conexionDB = new ConexionDB();
//                conexionDB.connection();

                usuario=new Usuario();
                usuario.setNombre(txtUsuario.getText().toString());
                usuario.setClave(txtClave.getText().toString());

                usuarioRepositorio = new UsuarioRepositorioImp();
                usuarioRepositorio.buscar(usuario);

                if (usuario != null) {
                    Toast toast = Toast.makeText(MainActivity.this, "Usuario Registrado", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }


//                if (conexionDB != null) {
//                    Toast toast = Toast.makeText(MainActivity.this, "Conecxion Establecida", Toast.LENGTH_LONG);
//                    toast.show();
//                } else {
//                    Toast toast = Toast.makeText(MainActivity.this, "Conecxion no Establecida", Toast.LENGTH_LONG);
//                    toast.show();
//                }
//                Usuario usuario = new Usuario();
////                UsuarioRepositorioImp usuarioRepositorioImp;
//                UsuarioRepositorio usuarioRepositorio =new UsuarioRepositorioImp();
//                usuarioRepositorio.guardar(usuario);
//                Toast toast = Toast.makeText(MainActivity.this, usuario.getNombre(), Toast.LENGTH_LONG);
//                toast.show();

//                try {
//                    conexionDB.cerrar();
//                    Toast toast = Toast.makeText(MainActivity.this, "Conecxion Cerada", Toast.LENGTH_LONG);
//                    toast.show();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//                Toast toast = Toast.makeText(MainActivity.this, "Conecxion Establecida con Exito", Toast.LENGTH_LONG);
//                toast.show();
            }
        });


    }


}
