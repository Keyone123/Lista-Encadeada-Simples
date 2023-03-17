import java.util.Scanner;

public class Main {

    public static int menu(){
        Scanner input = new Scanner(System.in);
        int op;
        System.out.println("\n------------------------------- Menu -------------------------------");
        System.out.println("1. Cadastrar no fim");
        System.out.println("2. Quantidade de pessoas na lista");
        System.out.println("3. Imprimir nomes da lista");
        System.out.println("4. Remover nome da lista");
        System.out.println("0. Sair");
        System.out.println("\n--------------------------------------------------------------------\n");
        System.out.print("Digite a opção que será executada: ");
        op = input.nextInt();
        return op;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Function<String> lista = new Function<>();
        boolean igual = false;
        int op;
        String nome;
        while(!igual){
            op = menu();
            switch (op) {
                case 1 -> {
                    System.out.print("Digite um nome: ");
                    nome = input.next();
                    lista.adicionar(nome);
                    System.out.println("\nNome cadastrado com sucesso.");
                }
                case 2 -> System.out.println("Tamanho = " + lista.getTamanho());
                case 3 -> lista.imprimir();
                case 4 -> {
                    lista.limpar();
                    System.out.println("\nLista excluída com sucesso.");
                }
                case 0 -> {
                    System.out.println("\nO programa acabou...");
                    igual = true;
                }
                default -> System.out.println("Opção inválida, por favor, selecione outra.");
            }
        }
    }
}
