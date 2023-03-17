public class Node<String> {
    String nome;
    Node<String> prox;

    public Node(String nome){
        this.nome = nome;
        this.prox = null;
    }

    public Node(String nome, Node<String> prox){
        this.nome = nome;
        this.prox = prox;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Node<String> getProx(){
        return prox;
    }
    public void setProx(Node<String> prox){
        this.prox = prox;
    }
}
