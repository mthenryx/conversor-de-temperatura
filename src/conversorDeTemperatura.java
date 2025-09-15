import java.util.Scanner;

public class conversorDeTemperatura {

    double temperaturaEmCelsius;
    double temperaturaEmFahrenheit;
    double temperaturaEmKelvin;

    public void obterDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a temperatura em  Celsius que deseja converter x° ?");
        temperaturaEmCelsius = leitor.nextDouble();

        calculandoDados();
    }

    public void calculandoDados() {
        temperaturaEmFahrenheit = (temperaturaEmCelsius * 9/5) + 32;
        temperaturaEmKelvin = temperaturaEmCelsius + 273.15;

        exibirResultados();
    }

    public void exibirResultados() {
        System.out.println(temperaturaEmCelsius + "° equivalem a:");
        System.out.println(temperaturaEmFahrenheit + "°F (Fahrenheit)");
        System.out.println(temperaturaEmKelvin +"K (Kelvin)");
    }
}