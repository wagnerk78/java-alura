public class Main3 {
    public static void main(String[] args) {
        String nome = "Wagner";
        int idade = 44;
        double valor = 575.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));



        String nome1 = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome1, aulas);

        System.out.println(mensagem);


        String nome2 = "Carlos";
        String escola = "Colégio São Paulo";

        String mensagem2 = """
                  Olá, %s! do(a) %s
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome2, escola, aulas);

        System.out.println(mensagem2);



    }
}
