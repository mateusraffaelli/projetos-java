```mermaid
classDiagram
    direction TD
    
    Barco <|-- Lancha
    Barco <|-- Veleiro
    Barco <|-- Jangada
    App ..> Barco
    
    class App{
        - barcos: ArrayList<Barco>
    }
    
    class Barco{
        <<abstract>>
        - id: int
        - modelo: String
        - anoDeFabricacao: int
        
        + Barco(String modelo, int anoDeFabricacao)
        + navegar() String
        +exibirFicha() String
    }
    
    class Lancha{
        + Lancha(String modelo, int anoDeFabricacao);
        + String navegar()
    }
    
    class Veleiro{
        + Veleiro(String modelo, int anoDeFabricacao);
        + String navegar()
    }
    
    class Jangada{
        + Jangada(String modelo, int anoDeFabricacao);
        + String navegar()
    }
    
    


```