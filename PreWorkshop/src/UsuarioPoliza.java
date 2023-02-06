public class UsuarioPoliza extends Usuario{
    public UsuarioPoliza(long cedula, String nombre, String apellido, String email){
        super(cedula, nombre, apellido, email);
    }
    @Override
    public String obtenerTipo() {
        return "POLIZA";
    }
}