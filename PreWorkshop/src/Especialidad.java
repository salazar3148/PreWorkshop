public abstract class Especialidad {
    protected String codigo, nombre, tipo;

    public Especialidad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String toString(){
        return "\n" + tipo.toUpperCase() + "\nCodigo: " + codigo + "\nNombre: " + nombre +".\n";
    }
}
