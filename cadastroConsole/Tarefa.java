package cadastroConsole;

import java.time.LocalDate;

public class Tarefa {
    
    private int id;
    private String descricao;
    private LocalDate dataCriacao;
    private boolean concluida;

    public Tarefa( int id, String descricao,  LocalDate dataCriacao, boolean concluida) {
        this.id = id;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.concluida = concluida;

    }

    public int getId(){
        return id;
    }

    public String getDescricao(){
        return descricao;
    }

    public LocalDate getDataCriacao(){
        return dataCriacao;
    }

    public boolean isConcluida(){
        return concluida;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void serConcluida(boolean concluida){
        this.concluida = concluida;
    }
    
}

