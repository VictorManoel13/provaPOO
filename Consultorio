package atividade.dominio;

public class Consultorio {
    ListBlock listBlock = new ListBlock();
    Fila fila = new Fila();
    public void addPaciente(String nomeCompleto, String especialidade){
        fila.add(nomeCompleto, especialidade);
    }

    public void chamandoPaciente(){
        fila.remove();
    }

    public void mostrarPacientes(){
        fila.imprime();
    }
}
