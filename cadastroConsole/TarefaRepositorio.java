package cadastroConsole;

import java.util.ArrayList;
import java.util.List;

public class TarefaRepositorio {

    private List<Tarefa> tarefas = new ArrayList<>();
    int proximoId = 1;

    public void salvar(Tarefa tarefa) {
        tarefas.add(tarefa);
        proximoId++;
    }

    // método para pegar o próximo ID
    public int getProximoId() {
        return proximoId;
    }

    public List<Tarefa> listar() {
        return tarefas;
    }

    public Tarefa buscarPorDescricao(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                return t;
            }
        }
        return null;
    }

    public boolean remover(String descricao) {
        Tarefa tarefa = buscarPorDescricao(descricao);
        if (tarefa != null) {
            tarefas.remove(tarefa);
            return true;
        }
        return false;
    }
}

