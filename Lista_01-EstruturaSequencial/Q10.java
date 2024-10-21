import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int valor = tec.nextInt();

        tec.close();
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " * " + i + " = " + valor * i);
        }

        // PRIMEIRA VERSÃO DA QUESTÃO:

        // System.out.println(valor + " * 1 = " + valor * 1);
        // System.out.println(valor + " * 2 = " + valor * 2);
        // System.out.println(valor + " * 3 = " + valor * 3);
        // System.out.println(valor + " * 4 = " + valor * 4);
        // System.out.println(valor + " * 5 = " + valor * 5);
        // System.out.println(valor + " * 6 = " + valor * 6);
        // System.out.println(valor + " * 7 = " + valor * 7);
        // System.out.println(valor + " * 8 = " + valor * 8);
        // System.out.println(valor + " * 9 = " + valor * 9);
        // System.out.println(valor + " * 10 = " + valor * 10);
    }
}
