public class Uber {

    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;

// Métodos getters e setters
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

// Método para calcular o valor da corrida
    public double calcularValorCorrida() {
        double valorFinal = (distancia * 2) + (tempoEspera * 0.5) + tarifaBase * fatorDemanda;
        return valorFinal;
    }

// Método para exibir os detalhes da corrida
        public void exibirDetalhesCorrida() {
            double valorFinal = calcularValorCorrida();

 // Exibe os detalhes da corrida
            System.out.println("Detalhes da corrida:");
            System.out.println("Distância percorrida: " + distancia + " km");
            System.out.println("Tempo de espera: " + tempoEspera + " minutos");
            System.out.println("Tarifa base: R$ " + tarifaBase);
            System.out.println("Fator de demanda: " + fatorDemanda);
            System.out.println("Valor final da corrida: R$ " + valorFinal);
        }
    }



