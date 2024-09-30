//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Uber uber = new Uber();

// Coletando informações da corrida
        System.out.print("Digite a distância percorrida (km): ");
        uber.setDistancia(scanner.nextDouble());

        System.out.print("Digite o tempo de espera (minutos): ");
        uber.setTempoEspera(scanner.nextInt());

        System.out.print("Digite a tarifa base (R$): ");
        uber.setTarifaBase(scanner.nextDouble());

        System.out.print("Digite o fator de demanda R$ (1.0 = normal, 1.5 = pico): ");
        uber.setFatorDemanda(scanner.nextDouble());


        uber.calcularValorCorrida();

// Exibe os detalhes da corrida
        System.out.println("Detalhes da corrida:");
        System.out.println("Distância percorrida: " + uber.getDistancia() + " km");
        System.out.println("Tempo de espera: " + uber.getTempoEspera() + " minutos");
        System.out.println("Tarifa base: R$ " + uber.getTarifaBase());
        System.out.println("Fator de demanda: " + uber.getFatorDemanda());

        uber.exibirDetalhesCorrida();
    }
}





