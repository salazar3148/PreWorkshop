public class UsuarioParticular extends Usuario{
    public UsuarioParticular(long cedula, String nombre, String apellido, String email){
        super(cedula, nombre, apellido, email);
    }
    @Override
    public String obtenerTipo() {
        return "PARTICULAR";
    }
}
