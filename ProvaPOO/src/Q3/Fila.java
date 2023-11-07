package Q3;

public class Fila {
    private ListBlock listBlock = new ListBlock();
    public void add(String content){
        Block block = new Block();
        block.setContent(content);
        listBlock.add(block);
    }
    public void remove(){
        try {
            Block refBlock = listBlock.find(0);
            System.out.println("O garcom " + refBlock.getContent() + " vai servi");
            listBlock.remove(0);
        } catch (NullPointerException e) {
            System.out.println("Fila vazia, não é possível remover!");
        }
    }
    public void imprime(){
        listBlock.imprime();
    }
}