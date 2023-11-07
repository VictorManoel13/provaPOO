package Q5;

public class ConsultorioTest {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();
        consultorio.addPaciente("Carla", "odontologia", 0);
        consultorio.addPaciente("Victor", "oftalmologia", 1);
        consultorio.addPaciente("Manoel", "ortopedia", 1);
        consultorio.addPaciente("Joselita", "pediatria", 0);
        consultorio.addPaciente("Helder", "fisioterapia", 1);
        consultorio.addPaciente("Ingridy","psicologia", 1);
        consultorio.chamandoPaciente();
        consultorio.chamandoPaciente();
        consultorio.chamandoPaciente();

        consultorio.mostrarPacientes();


    }
}
