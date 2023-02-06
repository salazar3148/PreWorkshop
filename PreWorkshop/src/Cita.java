import java.util.Date;

public class Cita {
    private Especialidad especialidad;
    private Usuario usuario;
    private Date fecha;

    private double valorBase;

    public Cita(Especialidad especialidad, Usuario usuario, Date fecha) {
        this.especialidad = especialidad;
        this.usuario = usuario;
        this.fecha = fecha;
        this.valorBase = this.calcularValor();
    }
    public double calcularValor(){
        if(this.usuario.obtenerTipo() == "EPS") return 30000;
        if(this.usuario.obtenerTipo() == "POLIZA") return 40000;
        return 70000;
    }

    public String imprimirDatos(){
        return usuario + "\n" + especialidad + "\nUsuario Citado para el: " +
                fecha.getDate() + "/" + (fecha.getMonth() + 1) + "/" + fecha.getYear() + ".";
    }
}
