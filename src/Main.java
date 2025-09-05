import java.util.Random;
public class Main {
    public static void main(String[] args) {
        var i = 0;
        int Da1, Da2, Da3, SumaDa1 = 0, SumaDa2 =0, SumaDa3 = 0;
        for (i = 0; i <= 20; i++) {

            Random aleatorio = new Random();
            Da1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            Da2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            Da3 = aleatorio.nextInt((6 - 1) + 1) + 1;
            SumaDa3 += Da3;
            SumaDa1 += Da1;
            SumaDa2 += Da2;


        }
        if (SumaDa1 > SumaDa2 && SumaDa1 > SumaDa3) {
            System.out.println("El Dado #1 GANA es mayor que Dado #2 y #3: " + SumaDa1);
            System.out.println("El valor de #2 es: " + SumaDa2);
            System.out.println("El valor de #3 es: " + SumaDa3);
        } else if (SumaDa2 > SumaDa1 && SumaDa2 > SumaDa3) {
            System.out.println("El Dado #2 GANA es mayor que el #1 y #3: " + SumaDa2);
            System.out.println("El valor de #1 es: " + SumaDa1);
            System.out.println("El valor de #3 es: " + SumaDa3);
        } else if (SumaDa3 > SumaDa1 && SumaDa3 > SumaDa2) {
            System.out.println("El Dado #3 GANA es mayor que el #1 y #2: " + SumaDa3);
            System.out.println("El valor de #1 es: " + SumaDa1);
            System.out.println("El valor de #2 es: " + SumaDa2);
        } else {
            System.out.println("Hay un empate entre los dados.");
        }
    }
}
