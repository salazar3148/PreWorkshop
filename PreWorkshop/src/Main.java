import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Hospital makaia = new Hospital();

        Especialidad medicinaGeneral = new MedicinaGeneral("MEDGEN123", "Roberto Carlos");
        Usuario user1 = new UsuarioParticular(1001987654, "Chistian", "Salazar", "csalazar@mail.com");

        Cita citaChristian = new Cita(medicinaGeneral, user1, new Date(2023, 5, 20));
        System.out.println(citaChristian.imprimirDatos());

        Especialidad medicinaDeporte = new MedicinaDeporte("MEDDEP123", "KIKE NARANJO");
        Usuario user2 = new UsuarioPoliza(1001987654, "Edward", "Reyes", "ereyes@mail.com");

        Cita citaEdward = new Cita(medicinaGeneral, user2, new Date(2023, 11, 2));
        System.out.println(citaEdward.imprimirDatos());
    }
}