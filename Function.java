public class Function<String> {
    Node<String> inicio;
    Node<String> ultimo;
    int tamanho;

    public int getTamanho(){
        return this.tamanho;
    }
    public void adicionar(String nome){
        Node<String> celula = new Node<>(nome);
        if(this.tamanho == 0){
            this.inicio = celula;
        }else{
            this.ultimo.setProx(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void imprimir(){
        Node<String> atual = this.inicio;
        if(this.tamanho == 0){
            System.out.println("Não há elementos na lista.");
        }
       for(int i = 0;i < this.tamanho;i++){
            System.out.println(atual.getNome());
            atual = atual.getProx();
       }
    }

    public void limpar(){
        for(Node<String> atual = this.inicio;atual != null;){
            Node<String> proximo = atual.getProx();
            atual.setNome(null);
            atual.setProx(null);
            atual = proximo;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
}
