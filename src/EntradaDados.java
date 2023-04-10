import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento:");
       int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação:");
       double avaliacao = leitura.nextDouble();
        System.out.println("*** " + filme + ", " + anoDeLancamento + ". Avaliação: " + avaliacao + " ***" );




    }
}
