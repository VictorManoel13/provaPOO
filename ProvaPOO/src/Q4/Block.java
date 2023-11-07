package Q4;

public class Block {

    private String nomeCompleto;
    private String especialidadeMedico;
    private Block prox;

    private int prioridade;


    public void setProx(Block b) {

        this.prox = b;
    }

    public Block getProx() {

        return this.prox;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEspecialidadeMedico() {
        return especialidadeMedico;
    }

    public void setEspecialidadeMedico(String especialidadeMedico) {
        this.especialidadeMedico = especialidadeMedico;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}