package Q5;

public class Consultorio {
    ListBlock listBlock = new ListBlock();
    Fila fila = new Fila();
    public void addPaciente(String nomeCompleto, String especialidade, int prioridade){
        fila.add(nomeCompleto, especialidade, prioridade);
    }

    public void chamandoPaciente(){

            fila.remove();

    }

    public void mostrarPacientes(){
        fila.imprime();
    }
}
