package Q2;

import Q3.Block;

public class ListBlock {

    private Q3.Block refBlock;
    public void add(Q3.Block b) {

        b.setProx(this.refBlock);
        this.refBlock = b;
    }

    /*
     * Localiza um bloco de uma posição especificadas por index - 0, 1, 2, ...
     */

    public Q3.Block find(int index) {
        int quantidade = quantidadeDeElementos()-1;
        Q3.Block aux = this.refBlock;
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

        Q3.Block anterior = find(index+1);
        Q3.Block atual = find(index);
        if(quantidadeDeElementos()-1 == index){
            this.refBlock = atual.getProx();
        } else{
            anterior.setProx(atual.getProx());
        }
    }

    public void imprime(){
        Q3.Block aux = this.refBlock;
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
