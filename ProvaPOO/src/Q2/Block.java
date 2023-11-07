package Q2;

public class Block {

    private String content;
    private Block prox;

    public void setProx(Block b) {

        this.prox = b;
    }

    public Block getProx() {

        return this.prox;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
