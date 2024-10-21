
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double somatorioNotas = 0;
        int qtdNotas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = tec.nextInt();

            somatorioNotas += nota;
            qtdNotas++;
        }

        tec.close();
        System.out.println();

        double media = somatorioNotas / qtdNotas;
        System.out.printf("MÉDIA ARITMÉTRICA: %.1f", media );
        

        // System.out.print("Nota 1: ");
        // double nota_01 = tec.nextDouble();

        // System.out.print("Nota 2: ");
        // double nota_02 = tec.nextDouble();

        // System.out.print("Nota 3: ");
        // double nota_03 = tec.nextDouble();

        // tec.close();
        // System.out.println();

        // double media = (nota_01 + nota_02 + nota_03) / 3;
        // System.out.println("NOTAS INSERIDAS: " + nota_01 + ", " + nota_02 + ", " + nota_03);
        // System.out.printf("MÉDIA ARITMÉTRICA: %.1f", media);
        
    }
}