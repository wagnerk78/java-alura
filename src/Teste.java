import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        int temperatura = entrada.nextInt();

        double farenheit = (temperatura * 1.8) + 32;

        System.out.println("A temperatura em Farenheit é: " +  (int) farenheit);


    }
}