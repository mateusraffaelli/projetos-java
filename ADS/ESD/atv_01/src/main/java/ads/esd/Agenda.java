package ads.esd;


import java.util.Scanner;

public class Agenda {
    Scanner scanner = new Scanner(System.in);
    private Contato contatos[];
    private int tamanho;

    public Agenda(int tamanhoVetor) {
        this.contatos = new Contato[tamanhoVetor];
        this.tamanho = 0;
    }

    public void adicionar(Contato contato){
        if (tamanho >= contatos.length) {
            System.out.println("Vetor cheio!");
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            if (contato.getNome().equals(contatos[i].getNome()) || contato.getTelefone().equals(contatos[i].getTelefone())){
                System.out.println("Contato já existe");
                return;
            }
        }

        contatos[tamanho] = contato;
        tamanho++;

    }

    public void remover(Contato contato){
        for (int i = 0; i < contatos.length; i++) {
            if (contato.getNome().equals(contatos[i].getNome()) || contato.getTelefone().equals(contatos[i].getTelefone())){
                contatos[i] = null;
                System.out.println("Contato excluído");
                return;
            }
        }
    }

    public void buscar(Contato contato){
        for (int i = 0; i < contatos.length; i++) {
            if (contato.getNome().equals(contatos[i].getNome()) || contato.getTelefone().equals(contatos[i].getTelefone())){
                System.out.println("Contato encontrado:");
                System.out.println(contatos[i].toString());
                return;
            }
        }
    }

    public void atualizar(Contato contato){
        for (int i = 0; i < contatos.length; i++) {
            if (contato.getNome().equals(contatos[i].getNome()) || contato.getTelefone().equals(contatos[i].getTelefone())){
                System.out.println("Contato encontrado:");
                System.out.println(contatos[i].toString());

                System.out.println("Qual dado você deseja atualizar? (n | t | e)");
                String msg = scanner.next();
                System.out.println("Novo cadastro:");
                String rsp = scanner.next();
                switch (msg){
                    case "n", "e", "t": contatos[i].setNome(rsp);
                    break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
                return;
            }
        }
    }

    public void listar(){
        for (int i = 0; i < contatos.length; i++) {
            System.out.println(contatos[i].toString());
        }
    }
}
