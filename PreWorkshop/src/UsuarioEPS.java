public class UsuarioEPS extends Usuario{
    public UsuarioEPS(long cedula, String nombre, String apellido, String email){
        super(cedula, nombre, apellido, email);
    }
    @Override
    public String obtenerTipo() {
        return "EPS";
    }
}
