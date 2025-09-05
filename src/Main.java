import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int Da1, Da2, SumaDa1 = 0, SumaDa2 = 0;
        for ( i = 0; i <= 20; i++)  {

            Random aleatorio = new Random();
            Da1 = aleatorio.nextInt((6-1)+1)+1;
            Da2 = aleatorio.nextInt((6-1)+1)+1;
            SumaDa1 += Da1;
            SumaDa2 += Da2;


        }
        if (SumaDa1>SumaDa2) {
            System.out.println("La suma total de el dado #1 es mayor que el #2" +SumaDa1);

        } else {
            System.out.println("La suma total de el dado #2 es mayor que el #1" +SumaDa2);

        }
    }
}