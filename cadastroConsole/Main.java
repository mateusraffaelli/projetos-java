package cadastroConsole;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TarefaRepositorio repositorio = new TarefaRepositorio();


        boolean loop = true;
        while (loop) {
            System.out.println("=== MENU ===");
            System.out.println("1. Adicionar nova tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Mostrar detalhes de uma tarefa");
            System.out.println("4. Atualizar tarefa");
            System.out.println("5. Remover tarefa");
            System.out.println("6. Salvar em arquivo");
            System.out.println("7. Carregar de arquivo");
            System.out.println("8. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpa ENTER pendente

            switch (opcao) {
            case 1:
                System.out.println("");
                System.out.println("=== NOVA TAREFA ===");
                System.out.println("Digite a descrição da tarefa:");
                String descricao = scanner.nextLine();

                LocalDate dataCriacao = LocalDate.now(); //Gera a data atual
                boolean concluida = false;
                int id = repositorio.getProximoId();

                Tarefa t = new Tarefa(id, descricao, dataCriacao, concluida);//Criar um objeto
                repositorio.salvar(t); //Adicionar ao repositório

                System.out.println("Tarefa adicionada com sucesso. ID = " + id );
                System.out.println("");
                break;

            case 2:
                System.out.println("");
                System.out.println("=== LISTA DE TAREFAS ===");

                List<Tarefa> todasTarefas = repositorio.listar(); // Pega todas as tarefas do repositório

                if (todasTarefas.isEmpty()) { // Verificando se está vazia
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    for(Tarefa tarefa : todasTarefas){ // Percorre por todas as tarefas
                        String status = tarefa.isConcluida() ? "[✓]" : "[ ]";
                        System.out.println(status + " ID: " + tarefa.getId() + " - " 
                                            + tarefa.getDescricao() + 
                                            " ( Criada em: " + tarefa.getDataCriacao() + " )");
                    }
                }

                System.out.println("");
                break;

            case 3:
                System.out.println("");
                System.out.println("Digite a descrição da tarefa");
                String buscarPorDescricao = scanner.nextLine();

                Tarefa tarefaEncontrada = repositorio.buscarPorDescricao(buscarPorDescricao);

                if (tarefaEncontrada == null) {
                    System.out.println("Tarefa não encontrada");
                } else {
                    System.out.println("");
                    System.out.println("=== DETALHES DA TAREFA ===");
                    System.out.println("ID: " + tarefaEncontrada.getId());
                    System.out.println("Descrição: " + tarefaEncontrada.getDescricao());
                    System.out.println("Data de criação: " + tarefaEncontrada.getDataCriacao());
                    System.out.println("Status: " + (tarefaEncontrada.isConcluida() ? "Concluída" : "Pendente"));
                }
                
                System.out.println("");
                break;
            
            case 4:
                System.out.println("");
                System.out.println("Digite a descrição da tarefa que deseja atualizar:");
                String descricaoAtualizar = scanner.nextLine();

                Tarefa tarefaAtualizar = repositorio.buscarPorDescricao(descricaoAtualizar);

                if (tarefaAtualizar == null) {
                    System.out.println("Tarefa não encontrada");
                } else {
                    System.out.println("");
                    System.out.println("=== ATUALIZAR TAREFA ===");
                    System.out.println("1. Alterar descrição");
                    System.out.println("2. Marcar como concluída");
                    System.out.println("3. Marcar como não concluída");
                    int opcaoAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoAtualizar) {
                        case 1:
                            System.out.println("Digite a nova descrição:");
                            String novaDescricao = scanner.nextLine();
                            tarefaAtualizar.setDescricao(novaDescricao);
                            System.out.println("Descrição atualizada!");
                            break;

                        case 2:
                            tarefaAtualizar.setConcluida(true);
                            System.out.println("Tarefa marcada como concluída");
                            break;

                        case 3:
                            tarefaAtualizar.setConcluida(false);
                            System.out.println("Tarefa marcada como pendente");
                            break;
                    
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }

                    System.out.println("");
                }

                break;

            case 5:
                
                break;

            case 6:
                
                break;

            case 7:
                
                break;
            
            case 8:
                loop = false;
                break;
        
            default:
                System.out.println("Valor inválido");
                break;
            }
        }

        scanner.close();
    }
}

