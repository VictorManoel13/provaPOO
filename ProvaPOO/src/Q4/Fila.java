package Q4;

public class Fila {
    private ListBlock listBlock = new ListBlock();
    public void add(String nomeComleto, String especialidade){
        Block block = new Block();
        block.setNomeCompleto(nomeComleto);
        block.setEspecialidadeMedico(especialidade);
        listBlock.add(block);
    }
    public void remove(){
        try {
            Block refBlock = listBlock.find(0);
            System.out.println("O paciente " + refBlock.getNomeCompleto() + " deve se redirecionar ao consultorio de "+ refBlock.getEspecialidadeMedico());
            listBlock.remove(0);
        } catch (NullPointerException e) {
            System.out.println("Fila vazia, não é possível remover!");
        }
    }
    public void imprime(){
        listBlock.imprime();
    }
}