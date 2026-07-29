package ads.esd;

import java.util.Random;

public class Contrato {
    private int codigo;
    private String dataInicio;
    private String dataFinal;
    private double valorFinal;
    private Cliente cliente;
    private Imovel imovel;

    public Contrato(String dataInicio, String dataFinal, double valorFinal, Cliente cliente, Imovel imovel) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.valorFinal = valorFinal;
        this.cliente = cliente;
        this.imovel = imovel;
        this.codigo = gerarCodigoAleatorio();
    }

    private int gerarCodigoAleatorio(){
        Random random = new Random();
        int centena = random.nextInt(10);
        int dezena = random.nextInt(10);
        int unidade = random.nextInt(10);
        return (centena*100) + (dezena*10) + unidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo: ").append(codigo);
        sb.append("\nData de início: ").append(dataInicio);
        sb.append("\nData de Término: ").append(dataFinal);
        sb.append("\nValor Final: R$").append(valorFinal);
        sb.append("\nDetalhes do imóvel: ").append(imovel.getDescricao());
        sb.append("\nNome Inquilino: ").append(cliente.getNome());
        return sb.toString();
    }
}
