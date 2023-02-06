public abstract class Usuario {
    private long cedula;
    private String nombre, apellido, email;

    public Usuario(long cedula, String nombre, String apellido, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public abstract String obtenerTipo();

    @Override
    public String toString() {
        return "\n" + obtenerTipo().toUpperCase() + "\nCedula: " + cedula + "\nNombre: " + nombre +
                "\nApellido: " + apellido + "\nCorreo Electronico: " + email;
    }
}
