package bladimir.prjtelecableandroid.repositorio;

import java.util.List;

import bladimir.prjtelecableandroid.entidades.Usuario;

public interface UsuarioRepositorio {

    boolean guardar(Usuario usuario);

    boolean actualizar(Usuario usuario);
    Usuario buscar (Usuario usuario);

    List<Usuario> buscar();
}
