import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação:");
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("A média da avaliação é: " + media/3);
    }
}
