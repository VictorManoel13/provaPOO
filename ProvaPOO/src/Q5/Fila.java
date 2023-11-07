package Q5;

public class Fila {
    private ListBlock listBlock = new ListBlock();
    public void add(String nomeComleto, String especialidade, int prioridade){
        Block block = new Block();
        block.setPrioridade(prioridade);
        block.setNomeCompleto(nomeComleto);
        block.setEspecialidadeMedico(especialidade);
        listBlock.add(block);
    }
    public void remove(){
        try {
            if (listBlock.verificarPrioridade() != null) {
                int refBlock = listBlock.find(listBlock.verificarPrioridade().getNomeCompleto());
                System.out.println("O paciente " + listBlock.verificarPrioridade().getNomeCompleto() + " deve se redirecionar ao consultorio de "+ listBlock.verificarPrioridade().getEspecialidadeMedico());
                listBlock.remove(refBlock);
            }else {
                Block refBlock = listBlock.find(0);
                listBlock.remove(0);
                System.out.println("O paciente " + refBlock.getNomeCompleto() + " deve se redirecionar ao consultorio de " + refBlock.getEspecialidadeMedico());
            }

            } catch (NullPointerException e) {
            System.out.println("Fila vazia, não é possível remover!");
        }

    }
    public void imprime(){
        listBlock.imprime();
    }

}
