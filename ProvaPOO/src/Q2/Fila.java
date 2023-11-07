package Q2;


public class Fila {
    private ListBlock listBlock = new ListBlock();
    public void add(String content){
        Q3.Block block = new Q3.Block();
        block.setContent(content);
        listBlock.add(block);
    }

    public void imprime(){
        listBlock.imprime();
    }
}