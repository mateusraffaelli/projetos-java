package POO.iniciante.ex06;

public class Smartphone implements Telefone, Camera {
    @Override
    public String tirarFoto() {
        return "Tirando foto";
    }

    @Override
    public String gravarVideo() {
        return "Gravando vídeo";
    }

    @Override
    public String ligar() {
        return "Ligando";
    }

    @Override
    public String atender() {
        return "Atendendo";
    }
}

