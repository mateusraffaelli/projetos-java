package ads.esd;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Imovel> imoveis = new ArrayList<>();
        ArrayList<Contrato> contratos = new ArrayList<>();

        Cliente cliente1 = new Cliente("Julio", "122.323.599-00", "(21)99813-4848");
        clientes.add(cliente1);
        Imovel imovel1 = new Imovel("Imóvel à venda", "Av. da Saudade, 590", 1000);
        imoveis.add(imovel1);
        Contrato contrato1 = new Contrato("29/07/2026", "31/12/2027", 16000, cliente1, imovel1);
        contratos.add(contrato1);

        
        System.out.print(contrato1);
    }
}
