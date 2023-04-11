import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int numero;
        double acrescimo = 0;
        double transferido = 0;
        double saldo = 2500;
        String extrato = """
                *****************************************
                Nome: João da Silva
                Tipo conta: Corrente
                Saldo: R$ %.2f
                *****************************************
                """.formatted(saldo);

        System.out.println(extrato);
        Scanner leitura = new Scanner(System.in);
        String opcoes = """
                Operações:
                                
                1 - Consultar Saldo
                2 - Receber Valores
                3 - Transferir valor
                4 - Sair               
                """;
        System.out.println(opcoes);
        System.out.println("Que operação deseja realizar? ");
        numero = (int) leitura.nextDouble();

        while (numero != 4) {
            switch (numero) {
                case 1 -> System.out.println("Seu saldo é de R$ " + saldo);
                case 2 -> {
                    System.out.println("Qual valor você recebeu? ");
                    acrescimo = leitura.nextDouble();
                    saldo = saldo + acrescimo;
                    System.out.println("Seu saldo é de R$ " + saldo);
                }
                case 3 -> {
                    System.out.println("Qual valor você  quer transferir? ");
                    transferido = leitura.nextDouble();
                    if (transferido > saldo) {
                        System.out.println("Não é possível fazer a transferência! ");
                    } else {
                        saldo = saldo - transferido;
                        System.out.println("Seu saldo é de R$ " + saldo);
                    }
                }
                default -> System.out.println("Digite um número válido!");
            }
            System.out.println(opcoes);
            System.out.println("Que operação deseja realizar? ");
            numero = (int) leitura.nextDouble();
        }

        System.out.println("Obrigado por utilizar nossos serviços!");

    }
    }



        /*while (numero != 4) {
            if(numero == 1) {
                System.out.println("Seu saldo é de R$ " + saldo);
                System.out.println(opcoes);
                System.out.println("Que operação deseja realizar? ");
                numero = (int) leitura.nextDouble();
        } if (numero == 2) {
                System.out.println("Qual valor você recebeu? ");
                acrescimo = leitura.nextDouble();
                saldo = saldo + acrescimo;
                System.out.println("Seu saldo é de R$ " + saldo);
                System.out.println(opcoes);
                System.out.println("Que operação deseja realizar? ");
                numero = (int) leitura.nextDouble();
            } if (numero == 3) {
                System.out.println("Qual valor você  quer transferir? ");
                transferido = leitura.nextDouble();
                if (transferido > saldo) {
                    System.out.println("Não é possível fazer a transferência! ");
                    System.out.println(opcoes);
                    System.out.println("Que operação deseja realizar? ");
                    numero = (int) leitura.nextDouble();
                } else {
                    saldo = saldo - transferido;
                    System.out.println("Seu saldo é de R$ " + saldo);
                    System.out.println(opcoes);
                    System.out.println("Que operação deseja realizar? ");
                }
            } else if (numero != 1 && numero != 2 && numero != 3) {
                System.out.println("Digite uma opção válida! ");
                System.out.println(opcoes);
                System.out.println("Que operação deseja realizar? ");
                numero = (int) leitura.nextDouble();
            }


        }
        System.out.println("Obrigado por utilizar nossos serviços! ");*/










