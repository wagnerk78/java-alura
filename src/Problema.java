import java.util.Random;
import java.util.Scanner;

public class Problema {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;
        int contador = 0;
        int numeroDesconhecido = new Random().nextInt(100);


        while  (contador <=4) {
            System.out.println("Digite seu número:");
            numero = (int) leitura.nextDouble();
            if (numero == numeroDesconhecido) {
                System.out.println("Parabéns! Você acertou!");
                break;
            } else if (numero > numeroDesconhecido) {
                System.out.println("Tente novamente um valor menor!");
            } else {
                System.out.println("Tente novamente um valor maior!");
            }
            contador++;
        }
        System.out.println("O número desconhecido era " + numeroDesconhecido + ".");
    }
}
