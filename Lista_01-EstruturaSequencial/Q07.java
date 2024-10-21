import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double somatorioNotas = 0;
        int somatorioPesos = 0;

         System.out.println("NOTAS");

         for (int i = 1; i <= 4; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = tec.nextInt();

            System.out.print("Peso " + i + ": ");
            int peso = tec.nextInt();

            System.out.println();

            somatorioNotas += nota * peso;
            somatorioPesos += peso;

         }

         tec.close();
         System.out.println();

         double mediaPonderada = somatorioNotas / somatorioPesos;
         System.out.printf("MÉDIA PONDERADA: %.1f", mediaPonderada);


        // System.out.print("Nota 1: ");
        // double nota_01 = tec.nextDouble();
        
        // System.out.print("Nota 2: ");
        // double nota_02 = tec.nextDouble();
        
        // System.out.print("Nota 3: ");
        // double nota_03 = tec.nextDouble();
        
        // System.out.print("Nota 4: ");
        // double nota_04 = tec.nextDouble();

        // System.out.println();
        // System.out.println("PESOS");

        // System.out.print("Peso 1: ");
        // int peso_01 = tec.nextInt();
        
        // System.out.print("Peso 2: ");
        // int peso_02 = tec.nextInt();

        // System.out.print("Peso 3: ");
        // int peso_03 = tec.nextInt();

        // System.out.print("Peso 4: ");
        // int peso_04 = tec.nextInt();

        // tec.close();
        // System.out.println();

        // int somaPesos = peso_01 + peso_02 + peso_03 + peso_04;
        // double mediaPonderada = ((nota_01 * peso_01) + (nota_02 * peso_02) + (nota_03 * peso_03) + (nota_04 * peso_04)) / somaPesos;
        // System.out.printf("MÉDIA PONDERADA: %.1f", mediaPonderada);

    }
}
