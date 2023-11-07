package Q4;

public class ConsultorioTest {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();
        consultorio.addPaciente("Carla", "odontologia");
        consultorio.addPaciente("Victor", "oftalmologia");
        consultorio.addPaciente("Manoel", "ortopedia");
        consultorio.addPaciente("Joselita", "pediatria");
        consultorio.addPaciente("Helder", "fisioterapia");
        consultorio.addPaciente("Ingridy","psicologia");
        consultorio.chamandoPaciente();
        consultorio.chamandoPaciente();
        consultorio.chamandoPaciente();



        consultorio.mostrarPacientes();


    }
}
