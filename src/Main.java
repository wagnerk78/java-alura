public class Main {
    public static void main(String[] args) {
        int num = 9;
        int result = 0;
        System.out.println("Valor original: " + result);
        result = num++; // Primeiro atribui, depois incrementa
        System.out.println("Valor de num após o incremento: " + num);
        System.out.println("Valor de result após o incremento: " + result);
        num = 10; result = 0;
        result = ++num; // Primeiro incrementa, depois atribui
        System.out.println("Valor de num após o incremento: " + num);
        System.out.println("Valor de result após o incremento: " + result);



    }
}