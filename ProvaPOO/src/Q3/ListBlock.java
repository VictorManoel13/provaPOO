package Q3;

public class ListBlock {

    private Block refBlock;
    public void add(Block b) {

        b.setProx(this.refBlock);
        this.refBlock = b;
    }

    /*
     * Localiza um bloco de uma posição especificadas por index - 0, 1, 2, ...
     */

    public Block find(int index) {
        int quantidade = quantidadeDeElementos()-1;
        Block aux = this.refBlock;
        while (aux != null && index != quantidade) {
            quantidade--;
            if(quantidade != -1) {
                aux = aux.getProx();
            }
        }
        return aux;
    }


    /*
     * Remove de uma posição especificada por index - 0, 1, 2, ...
     */
    public void remove(int index) {

        Block anterior = find(index+1);
        Block atual = find(index);
        if(quantidadeDeElementos()-1 == index){
            this.refBlock = atual.getProx();
        } else{
            anterior.setProx(atual.getProx());
        }
    }

    public void imprime(){
        Block aux = this.refBlock;
        int index = quantidadeDeElementos();
        while(aux != null){

            System.out.println("Pedido "+index+" vai ser servido por: "+aux.getContent());
            index--;
            aux = aux.getProx();
        }
    }

    public int quantidadeDeElementos(){
        int quantidade = 0;
        Block aux = this.refBlock;
        while(aux != null){
            quantidade++;
            aux = aux.getProx();
        }
        return quantidade;
    }
}
