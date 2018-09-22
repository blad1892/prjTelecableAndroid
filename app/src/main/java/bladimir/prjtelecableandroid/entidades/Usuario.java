package bladimir.prjtelecableandroid.entidades;

public class Usuario {

    Integer id;
    String nomUsuario;
    String nombre;
    String apellido;
    String clave;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Usuario() {
        this.id = id;
        this.nomUsuario = nomUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nomUsuario='" + nomUsuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
